package designpatterns.singleton.optimizedsync;

public class SyncOptiSingleton {
    // lazy initialization
    private static volatile SyncOptiSingleton singleton = null;

    //private constructor to avoid client applications to use constructor
    private SyncOptiSingleton(){

    }

    // So we will only acquire lock on the getInstance() once, when the obj is null.
    // This way we only synchronize the first way through, just what we want.
    // so we use double checking locking as below
    // Ref: https://www.geeksforgeeks.org/singleton-design-pattern/
    public static SyncOptiSingleton getEagerInstance(){
        if(singleton == null){
            // To make thread safe
            synchronized (SyncOptiSingleton.class){

                // check again as multiple threads
                // can reach above step
                if(singleton == null) {
                    singleton = new SyncOptiSingleton();
                }
            }
        }
        return singleton;
    }
}
