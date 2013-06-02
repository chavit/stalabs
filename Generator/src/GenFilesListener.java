import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.parse.ANTLRParser.throwsSpec_return;

public class GenFilesListener extends GeneratorBaseListener {

	private PrintWriter out;
	private String name;
	private String dir;
	private int rules = 0;

	public GenFilesListener(GeneratorParser parse, String name, String dir)
			throws FileNotFoundException {
		this.name = name;
		this.dir = dir;
	}

	@Override
	public void enterLexems(GeneratorParser.LexemsContext ctx) {
		try {
			out = new PrintWriter(new File(dir + "/" + name + "Lexer.java"));
		} catch (IOException e) {
			throw new IllegalStateException("Something wrong");
		}
		out.println("import java.io.InputStream;");
		out.println("import MyAntLL.Lexer;");
		out.println();
		out.println("public class " + name + "Lexer extends Lexer {");
		out.println("   public " + name + "Lexer(InputStream in) {");
		out.println("      super(in);");

	}

	@Override
	public void exitLexems(GeneratorParser.LexemsContext ctx) {
		out.println("   }");
		out.println("}");
		out.close();
	}

	@Override
	public void enterNterms(GeneratorParser.NtermsContext ctx) {
		try {
			out = new PrintWriter(new File(dir + "/" + name + "Context.java"));
		} catch (IOException e) {
			throw new IllegalStateException("Something wrong");
		}
		out.println("import MyAntLL.Context;");
		out.println();
		out.println("public class " + name + "Context {");
	}

	private String format(String s, int c) {
		s = "\n" + s;
		StringBuilder str = new StringBuilder("");
		for (int i = 0; i < s.length();) {
			int oldi = i;
			if (s.charAt(i) != '\n') {
				str.append(s.charAt(i));
				i++;
			} else {
				i++;
				while (i < s.length()
						&& (s.charAt(i) == ' ' || s.charAt(i) == '\n' || s
								.charAt(i) == '\t')) {
					i++;
				}
				if (i < s.length()) {
					if (oldi != 0) {
						str.append("\n");
					}
					for (int j = 0; j < c; j++) {
						str.append(" ");
					}
				}
			}
		}
		return str.toString();
	}

	@Override
	public void enterParams(GeneratorParser.ParamsContext ctx) {
		String cur = ctx.PARAMS().getText();
		out.println(format(cur.substring(2, cur.length() - 2), 6));
	}

	@Override
	public void exitNterms(GeneratorParser.NtermsContext ctx) {
		out.println("}");
		out.close();
	}

	@Override
	public void exitNterm(GeneratorParser.NtermContext ctx) {
		out.println("   }");
		out.println();
	}

	@Override
	public void enterNterm(GeneratorParser.NtermContext ctx) {
		out.println("   public static class " + ctx.NTERMID().getText()
				+ " implements Context {");
		out.println("      public String getText() {");
		out.println("         return \"" + ctx.NTERMID().getText() + "\";");
		out.println("      }");
		out.println();
	}

	String ecranaize(String s1) {
		StringBuilder s = new StringBuilder("");
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '\\') {
				s.append("\\\\");
			} else if (s1.charAt(i) == '\n') {
				s.append("\\n");
			} else if (s1.charAt(i) == '\r') {
				s.append("\\r");
			} else if (s1.charAt(i) == '\b') {
				s.append("\\b");
			} else if (s1.charAt(i) == '\t') {
				s.append("\\t");
			} else {
				s.append(s1.charAt(i));
			}
		}
		return s.toString();
	}

	@Override
	public void enterLexem(GeneratorParser.LexemContext ctx) {
		out.println("      add(\"" + ctx.LEXID().getText() + "\", "
				+ ecranaize(ctx.STRING().getText()) + ", "
				+ (ctx.getChildCount() != 4) + ");");
	}

	@Override
	public void enterPrules(GeneratorParser.PrulesContext ctx) {
		try {
			out = new PrintWriter(
					new File(dir + "/" + name + "RuleParser.java"));
		} catch (IOException e) {
			throw new IllegalStateException("Something wrong");
		}
		out.println("import java.text.ParseException;");
		out.println("import MyAntLL.*;");
		out.println();
		out.println("public class " + name + "RuleParser {");
	}

	@Override
	public void exitPrules(GeneratorParser.PrulesContext ctx) {
		out.println("}");
		out.close();
	}

	@Override
	public void enterPrule(GeneratorParser.PruleContext ctx) {
		rules++;
		out.println("   public static class rule" + rules
				+ " implements RuleParser {");
		out.println("      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {");
		String beg = ctx.NTERMID().getText();
		out.println("         " + name + "Context." + beg + " _0 = (" + name
				+ "Context." + beg + ") _o;");
		out.println("         " + "ParseTree _r = new ParseTree(_0);");

	}

	@Override
	public void enterPrulepart(GeneratorParser.PrulepartContext ctx) {
		int curchild = 0;
		String prefix = "         ";
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			String text = ctx.getChild(i).getText();
			if (text.charAt(0) == '$') {
				continue;
			}
			curchild++;
			if (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z') {
				out.println(prefix + "ContextTerminal _" + curchild
						+ " = new ContextTerminal();");
			} else {
				out.println(prefix + name + "Context." + text + " _" + curchild
						+ " = new " + name + "Context." + text + "();");
			}
		}
		curchild = 0;
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			String text = ctx.getChild(i).getText();
			if (text.charAt(0) == '$') {
				out.println(format(text.substring(2, text.length() - 2), 9));
			} else if (text.charAt(0) >= 'A' && text.charAt(0) <= 'Z') {
				curchild++;
				out.println(prefix + "_" + curchild + ".name = \"" + text
						+ "\";");
				out.println(prefix + "_r.add(_p.parse(_"+curchild+", _in));");
			} else {
				curchild++;
				out.println(prefix + "_r.add(_p.parse(_" + curchild
						+ ", _in));");
			}
		}
		out.println(prefix + "return _r;");
	}

	@Override
	public void exitPrule(GeneratorParser.PruleContext ctx) {
		out.println("      }");
		out.println("   }");
		out.println();
	}

}
