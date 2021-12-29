package collectionframework;

import java.util.Map;
import java.util.TreeMap;

public class CaseInsensitiveKeysForMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.put("ABc", 2);
        treeMap.put("ABC", 1);
        treeMap.put("cde", 1);

        System.out.println(treeMap);
        System.out.println(treeMap.get("abC"));
    }
}
