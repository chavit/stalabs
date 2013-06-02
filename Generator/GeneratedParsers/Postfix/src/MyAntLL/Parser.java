package MyAntLL;

import java.text.ParseException;
import java.util.HashMap;


public class Parser {
	protected HashMap<String, RuleParser> map;
	protected Lexer in;

	public Parser(Lexer in) {
		map = new HashMap<>();
		this.in = in;
	}

	public ParseTree parse(Context o, Lexer in) throws ParseException {
		if (o instanceof ContextTerminal) {
			ContextTerminal term = (ContextTerminal) o;
			if (in.peekLexem().name != term.name) {
				throw new ParseException("Expected " + term.name + "but has"
						+ in.peekLexem(), in.getPos());
			} else {
				term.text = in.peekLexem().text;
				in.popLexem();
				return new ParseTree(o);
			}
		}
		RuleParser p = map.get(o.getText() + "$" + in.peekLexem().name);
		if (p == null) {
			throw new ParseException("Unexpected token " + in.peekLexem().name
					+ " at position: "+in.getPos(), in.getPos());
		}
		return map.get(o.getText() + "$" + in.peekLexem().name).parse(o, in,
				this);
	}
}
