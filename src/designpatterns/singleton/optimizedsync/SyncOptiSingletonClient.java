package designpatterns.singleton.optimizedsync;

public class SyncOptiSingletonClient {
    public static void main(String[] args) {

        System.out.println("Following is the call to get the singleton instance lazy+sync+opti way");
        SyncOptiSingleton singleton = SyncOptiSingleton.getEagerInstance();

    }
}
