package designpatterns.singletonDP.lazy;

public class LazySingleton {
    // lazy initialization
    private static LazySingleton singleton ;

    //private constructor to avoid client applications to use constructor
    private LazySingleton(){

    }

    public static LazySingleton getEagerInstance(){
        if(singleton == null){
            // here  instance is created at 1st call
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
