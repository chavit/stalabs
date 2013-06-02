package MyAntLL;
import java.text.ParseException;


public interface RuleParser {
	public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException;
}
