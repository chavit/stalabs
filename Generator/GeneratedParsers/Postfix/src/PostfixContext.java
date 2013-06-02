import MyAntLL.Context;

public class PostfixContext {
   public static class l implements Context {
      public String getText() {
         return "l";
      }

      int res;
   }

   public static class t implements Context {
      public String getText() {
         return "t";
      }

      int val; int res;
   }

   public static class g implements Context {
      public String getText() {
         return "g";
      }

      int val1; int val2; int res;
   }

}
