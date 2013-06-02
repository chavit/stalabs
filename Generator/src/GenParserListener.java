import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class GenParserListener extends GeneratorBaseListener {
	private PrintWriter out;
	private String name;
	private String root;
	private String dir;
	private Rule curRule;
	private ArrayList<Rule> ready;

	public GenParserListener(GeneratorParser parse, String name, String dir)
			throws FileNotFoundException {
		this.name = name;
		this.dir = dir;
	};

	HashSet<String> defNterm = new HashSet<>();

	@Override
	public void enterNterm(GeneratorParser.NtermContext ctx) {
		String str = ctx.NTERMID().getText();
		if (root == null) {
			root = str;
		}
		if (defNterm.contains(str)) {
			throw new IllegalStateException(str + " has multiply definition");
		} else {
			defNterm.add(str);
		}
	}

	@Override
	public void enterPrule(GeneratorParser.PruleContext ctx) {
		curRule = new Rule(new Term(ctx.NTERMID().getText()));
	}

	@Override
	public void exitPrule(GeneratorParser.PruleContext ctx) {
		ready.add(curRule);
	}

	@Override
	public void enterPrules(GeneratorParser.PrulesContext ctx) {
		ready = new ArrayList<>();
	}

	@Override
	public void enterPrulepart(GeneratorParser.PrulepartContext ctx) {
		for (int i = 0; i < ctx.getChildCount() - 1; i++) {
			if (ctx.getChild(i).getText().charAt(0) != '$') {
				curRule.sons.add(new Term(ctx.getChild(i).getText()));
			}
		}
	}

	@Override
	public void exitPrules(GeneratorParser.PrulesContext ctx) {
		HashMap<String, Integer> map = new GrammarAnalyze(ready, new Term(root))
				.getChoiser();
		try {
			out = new PrintWriter(new File(dir + "/" + name + "Parser.java"));
		} catch (FileNotFoundException e) {
			throw new IllegalStateException("Something wrong");
		}
		out.println("import java.text.ParseException;");
		out.println("import MyAntLL.*;");
		out.println();
		out.println("public class " + name + "Parser extends Parser{");
		out.println("   public "+name+"Parser(Lexer in) {");
		out.println("      super(in);");
		for (String s : map.keySet()) {
			out.println("      map.put(\"" + s
					+ "\", new "+name+"RuleParser.rule" + map.get(s) + "());");
		}
		out.println("   }");
		out.println("");
		out.println("   public ParseTree startParse() throws ParseException {");
		out.println("      ParseTree res = parse(new " + name + "Context."+root+"(),in);");
		out.println("      if (!in.peekLexem().name.equals(\"@END\")) {");
		out.println("         throw new ParseException(\"Extra information in the end of file\", in.getPos());");
		out.println("      }");
		out.println("      return res;");
		out.println("   }");
		out.println("}");
		out.close();
	}
}
