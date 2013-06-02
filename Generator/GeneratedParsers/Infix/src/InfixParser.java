import java.text.ParseException;
import MyAntLL.*;

public class InfixParser extends Parser{
   public InfixParser(Lexer in) {
      super(in);
      map.put("num$LB", new InfixRuleParser.rule8());
      map.put("fs$@END", new InfixRuleParser.rule6());
      map.put("es$PLUS", new InfixRuleParser.rule2());
      map.put("es$RB", new InfixRuleParser.rule3());
      map.put("f$LB", new InfixRuleParser.rule4());
      map.put("f$NUMBER", new InfixRuleParser.rule4());
      map.put("fs$RB", new InfixRuleParser.rule6());
      map.put("e$LB", new InfixRuleParser.rule1());
      map.put("fs$MUL", new InfixRuleParser.rule5());
      map.put("es$@END", new InfixRuleParser.rule3());
      map.put("e$NUMBER", new InfixRuleParser.rule1());
      map.put("fs$PLUS", new InfixRuleParser.rule6());
      map.put("num$NUMBER", new InfixRuleParser.rule7());
   }

   public ParseTree startParse() throws ParseException {
      ParseTree res = parse(new InfixContext.e(),in);
      if (!in.peekLexem().name.equals("@END")) {
         throw new ParseException("Extra information in the end of file", in.getPos());
      }
      return res;
   }
}
