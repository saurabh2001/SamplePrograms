package designpatterns.singletonDP.eager;

public class EagerSingleton {
    // eager initialization
    private static EagerSingleton singleton = new EagerSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerSingleton(){

    }

    public static EagerSingleton getEagerInstance(){
        return singleton;
    }
}
