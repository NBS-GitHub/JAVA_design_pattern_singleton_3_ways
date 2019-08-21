public class Singleton3 {

   private static int instanceCount;
   private static Singleton3 instance;

   private Singleton3() {
      System.out.println("Singleton3 created.");
      instanceCount++;
   }

   public static synchronized Singleton3 createSingleton() {
      if(!(instanceCount > 0))
         instance = new Singleton3();
      return instance;
   }

}
