import java.io.InputStream;
public class ArrLexer extends Lexer {
	public ArrLexer(InputStream in) {
		super(in);
		add("PLUS", "\\+", false);
		add("MINUS", "-", false);
		add("NUMBER", "[0-9]+", false);
		add("WS", " |\\n|\\t", true);
	}
}
