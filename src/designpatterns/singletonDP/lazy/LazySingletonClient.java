package designpatterns.singletonDP.lazy;

public class LazySingletonClient {
    public static void main(String[] args) {

        System.out.println("Following is the call to get the singleton instance lazy way");
        LazySingleton singleton = LazySingleton.getEagerInstance();

    }
}
