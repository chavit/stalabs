import MyAntLL.Context;

public class InfixContext {
   public static class e implements Context {
      public String getText() {
         return "e";
      }

      int res;
   }

   public static class es implements Context {
      public String getText() {
         return "es";
      }

      int res;
   }

   public static class f implements Context {
      public String getText() {
         return "f";
      }

      int res;
   }

   public static class fs implements Context {
      public String getText() {
         return "fs";
      }

      int res;
   }

   public static class num implements Context {
      public String getText() {
         return "num";
      }

      int res;
   }

}
