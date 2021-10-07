package designpatterns.proxyDP;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    Internet internet = new RealInternet();
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList();
        bannedSites.add("abc.com");
        bannedSites.add("abc.co");
        bannedSites.add("abc.uk");
        bannedSites.add("abc.in");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {

        if(bannedSites.contains(serverHost)) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
