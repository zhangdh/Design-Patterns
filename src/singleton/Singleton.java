package singleton;

public class Singleton {
	 private static final Singleton instance = new Singleton();
     private Singleton(){
             //do something.
      }

       public static Singleton getInstance(){
             return instance;
        }
}
