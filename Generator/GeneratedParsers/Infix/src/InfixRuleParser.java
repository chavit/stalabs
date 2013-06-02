import java.text.ParseException;
import MyAntLL.*;

public class InfixRuleParser {
   public static class rule1 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.e _0 = (InfixContext.e) _o;
         ParseTree _r = new ParseTree(_0);
         InfixContext.f _1 = new InfixContext.f();
         InfixContext.es _2 = new InfixContext.es();
         _r.add(_p.parse(_1, _in));
         _r.add(_p.parse(_2, _in));
         _0.res = _1.res + _2.res; 
         return _r;
      }
   }

   public static class rule2 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.es _0 = (InfixContext.es) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         InfixContext.f _2 = new InfixContext.f();
         InfixContext.es _3 = new InfixContext.es();
         _1.name = "PLUS";
         _r.add(_p.parse(_1, _in));
         _r.add(_p.parse(_2, _in));
         _r.add(_p.parse(_3, _in));
         _0.res = _2.res + _3.res;
         return _r;
      }
   }

   public static class rule3 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.es _0 = (InfixContext.es) _o;
         ParseTree _r = new ParseTree(_0);
         _0.res = 0;
         return _r;
      }
   }

   public static class rule4 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.f _0 = (InfixContext.f) _o;
         ParseTree _r = new ParseTree(_0);
         InfixContext.num _1 = new InfixContext.num();
         InfixContext.fs _2 = new InfixContext.fs();
         _r.add(_p.parse(_1, _in));
         _r.add(_p.parse(_2, _in));
         _0.res = _1.res * _2.res; 
         return _r;
      }
   }

   public static class rule5 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.fs _0 = (InfixContext.fs) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         InfixContext.num _2 = new InfixContext.num();
         InfixContext.fs _3 = new InfixContext.fs();
         _1.name = "MUL";
         _r.add(_p.parse(_1, _in));
         _r.add(_p.parse(_2, _in));
         _r.add(_p.parse(_3, _in));
         _0.res = _2.res * _3.res;
         return _r;
      }
   }

   public static class rule6 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.fs _0 = (InfixContext.fs) _o;
         ParseTree _r = new ParseTree(_0);
         _0.res = 1;
         return _r;
      }
   }

   public static class rule7 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.num _0 = (InfixContext.num) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         _1.name = "NUMBER";
         _r.add(_p.parse(_1, _in));
         _0.res = Integer.parseInt(_1.text); 
         return _r;
      }
   }

   public static class rule8 implements RuleParser {
      public ParseTree parse(Context _o, Lexer _in, Parser _p) throws ParseException {
         InfixContext.num _0 = (InfixContext.num) _o;
         ParseTree _r = new ParseTree(_0);
         ContextTerminal _1 = new ContextTerminal();
         InfixContext.e _2 = new InfixContext.e();
         ContextTerminal _3 = new ContextTerminal();
         _1.name = "LB";
         _r.add(_p.parse(_1, _in));
         _r.add(_p.parse(_2, _in));
         _3.name = "RB";
         _r.add(_p.parse(_3, _in));
         _0.res = _2.res; 
         return _r;
      }
   }

}
