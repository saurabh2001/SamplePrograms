package designpatterns.singletonDP.sync;

public class LazySyncSingletonClient {
    public static void main(String[] args) {

        System.out.println("Following is the call to get the singleton instance lazy+sync way");
        LazySyncSingleton singleton = LazySyncSingleton.getEagerInstance();

    }
}
