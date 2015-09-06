package singleton;

public class SingletonClass {
	private static SingletonClass instance = null;
    public static SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }
    private SingletonClass(){
    }
}
