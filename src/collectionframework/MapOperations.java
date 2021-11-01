package collectionframework;

import java.util.*;

public class MapOperations {
    private static Map<Integer, String> map = new HashMap<>();
    static {
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");

    }
    public static void main(String[] args) {
        System.out.println("###Method one###");
        System.out.println("###Iterating over key set which holds only keys");
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        System.out.println();
        System.out.println("###Method two###");
        System.out.println("###Iterating over entry set which hold key and value both");
        Iterator<Map.Entry<Integer, String>> iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println();
        System.out.println("###Method two###");
        System.out.println("###java 8 streams");
        map.entrySet()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

        System.out.println();
        System.out.println("###Method two###");
        System.out.println("###java 8 streams using foreach");
        map.forEach((k,v) -> System.out.println("Key: " + k + " Value: " + v));
    }
}
