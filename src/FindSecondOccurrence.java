
public class FindSecondOccurrence {
    public static void main(String[] a) {

        String key = "r";
        String str = "Programming";

        System.out.println("Second index of "+ key + ": " + str.indexOf(key,str.indexOf(key)+1));
    }
}
