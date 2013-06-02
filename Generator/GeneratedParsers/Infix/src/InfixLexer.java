import java.io.InputStream;
import MyAntLL.Lexer;

public class InfixLexer extends Lexer {
   public InfixLexer(InputStream in) {
      super(in);
      add("NUMBER", "[0-9]+", false);
      add("PLUS", "\\+", false);
      add("MUL", "\\*", false);
      add("LB", "\\(", false);
      add("RB", "\\)", false);
      add("WS", "[ \\t\\r\\n]", true);
   }
}
