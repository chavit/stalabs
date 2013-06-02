import java.text.ParseException;
import MyAntLL.*;

public class PostfixRuleParser {
   public static class rule1 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         PostfixContext.l _0 = (PostfixContext.l) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         PostfixContext.t _2 = new PostfixContext.t();
         _1.name = "NUMBER";
         _r.add(_p.parse(_1, _in));
         _2.val = Integer.parseInt(_1.text); 
         _r.add(_p.parse(_2, _in));
         _0.res = _2.res; 
         return _r;
      }
   }

   public static class rule2 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         PostfixContext.t _0 = (PostfixContext.t) _o;
         ParseTree _r = new ParseTree(_0);
         PostfixContext.l _1 = new PostfixContext.l();
         PostfixContext.g _2 = new PostfixContext.g();
         PostfixContext.t _3 = new PostfixContext.t();
         _r.add(_p.parse(_1, _in));
         _2.val1 = _0.val; _2.val2 = _1.res; 
         _r.add(_p.parse(_2, _in));
         _3.val = _2.res; 
         _r.add(_p.parse(_3, _in));
         _0.res = _3.res; 
         return _r;
      }
   }

   public static class rule3 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         PostfixContext.t _0 = (PostfixContext.t) _o;
         ParseTree _r = new ParseTree(_0);
         _0.res = _0.val; 
         return _r;
      }
   }

   public static class rule4 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         PostfixContext.g _0 = (PostfixContext.g) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         _1.name = "OP";
         _r.add(_p.parse(_1, _in));
         if (_1.text.equals("+")) _0.res = _0.val1 + _0.val2;
         if (_1.text.equals("-")) _0.res = _0.val1 - _0.val2;
         if (_1.text.equals("*")) _0.res = _0.val1 * _0.val2; 
         return _r;
      }
   }

}
