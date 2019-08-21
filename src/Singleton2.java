public class Singleton2 {

   public static final Singleton2 INSTANCE = new Singleton2();

   private Singleton2() {
      System.out.println("Singleton2 created.");
   }

}
