import java.text.ParseException;
import MyAntLL.*;

public class PostfixParser extends Parser{
   public PostfixParser(Lexer in) {
      super(in);
      map.put("g$OP", new PostfixRuleParser.rule4());
      map.put("t$@END", new PostfixRuleParser.rule3());
      map.put("t$OP", new PostfixRuleParser.rule3());
      map.put("t$NUMBER", new PostfixRuleParser.rule2());
      map.put("l$NUMBER", new PostfixRuleParser.rule1());
   }

   public ParseTree startParse() throws ParseException {
      ParseTree res = parse(new PostfixContext.l(),in);
      if (!in.peekLexem().name.equals("@END")) {
         throw new ParseException("Extra information in the end of file", in.getPos());
      }
      return res;
   }
}
