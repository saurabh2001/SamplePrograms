package designpatterns.singleton.eager;

public class EagerSingletonClient {
    public static void main(String[] args) {

        System.out.println("Following is the call to get the singleton instance");
        EagerSingleton singleton = EagerSingleton.getEagerInstance();

    }
}
