package designpatterns.proxyDP;

public class Client {
    public static void main(String[] args){

        try{
            // https://www.geeksforgeeks.org/proxy-design-pattern/
            Internet internet = new ProxyInternet();
            internet.connectTo("xyz.com");
            internet.connectTo("abc.com");
        } catch (Exception e){
            System.out.println("Connection is not allowed");
            e.printStackTrace();
        }


    }
}
