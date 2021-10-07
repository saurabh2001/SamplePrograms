package designpatterns.singletonDP.sync;

public class LazySyncSingleton {
    // lazy initialization
    private static LazySyncSingleton singleton ;

    //private constructor to avoid client applications to use constructor
    private LazySyncSingleton(){

    }

    // putting synchronized, Only one thread can execute this at a time,
    // but it is costly because to get same instance each method has to wait, synchronized is only required on 1st call
    // so we use double checking locking
    // Ref: https://www.geeksforgeeks.org/singleton-design-pattern/
    public static synchronized LazySyncSingleton getEagerInstance(){
        if(singleton == null){
            singleton = new LazySyncSingleton();
        }
        return singleton;
    }
}
