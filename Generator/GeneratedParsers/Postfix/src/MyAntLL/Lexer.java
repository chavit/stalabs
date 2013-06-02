package MyAntLL;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

	private Lexem cur;
	private ArrayList<LexRule> rules;
	private String in;
	private int pos = 0;

	public Lexer(InputStream in) {
		rules = new ArrayList<>();
		this.in = new Scanner(in, "UTF-8").useDelimiter("\\A").next();
	}
	
	public int getPos() {
		return pos;
	}

	protected void add(String name, String pattern, boolean isSkip) {
		rules.add(new LexRule(name, pattern, isSkip));
	}

	public Lexem peekLexem() throws ParseException {
		if (cur == null) {
			cur = getNextLexem();
		}
		return cur;
	}

	public Lexem popLexem() throws ParseException {
		Lexem res = peekLexem();
		cur = null;
		return res;
	}

	private Lexem getNextLexem() throws ParseException {
		for (LexRule l : rules) {
			l.matcher.region(pos, in.length());
			if (l.matcher.find()) {
				String s = l.matcher.group();
				pos += s.length();
				if (l.isSkip) {
					return getNextLexem();
				} else {
					return new Lexem(l.name, s);
				}
			}
		}
		if (pos == in.length()) {
			return new Lexem("@END", "");
		} else {
			throw new ParseException("unknown token at position = " + pos, pos);
		}
	}

	public static class Lexem {
		public String name;
		public String text;

		public Lexem(String name, String text) {
			this.name = name;
			this.text = text;
		}
	}

	private class LexRule {
		String name;
		Matcher matcher;
		boolean isSkip;

		public LexRule(String name, String pattern, boolean isSkip) {
			this.name = name;
			this.matcher = Pattern.compile("^" + "(" + pattern + ")").matcher(
					in);
			this.isSkip = isSkip;
		}
	}

}
