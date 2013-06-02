import java.io.InputStream;
import MyAntLL.Lexer;

public class PostfixLexer extends Lexer {
   public PostfixLexer(InputStream in) {
      super(in);
      add("NUMBER", "[0-9]", false);
      add("OP", "\\+|-|\\*", false);
      add("WS", "[ \\r\\t\\n]", true);
   }
}
