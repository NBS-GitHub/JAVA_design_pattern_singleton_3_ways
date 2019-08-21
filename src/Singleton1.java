public class Singleton1 {

   private static Singleton1 instance;

    private Singleton1() {
       System.out.println("Singleton1 created.");
    }

    public static synchronized Singleton1 createInstance() {
       if(instance == null)
          instance = new Singleton1();
       return instance;
    }

}
