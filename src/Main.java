public class Main {
   public static void main(String[] args) {

   Singleton1 s1a = Singleton1.createInstance();      // instance created
   Singleton1 s1b = Singleton1.createInstance();      // instance not created

   Singleton2 s2a = Singleton2.INSTANCE;              // instance created
   Singleton2 s2b = Singleton2.INSTANCE;              // instance not created

   Singleton3 s3a = Singleton3.createSingleton();     // instance created
   Singleton3 s3b = Singleton3.createSingleton();     // instance not created

   }
}
