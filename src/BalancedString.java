import java.util.HashMap;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("{","}");
        map.put("(",")");
        map.put("[","]");
        Stack st = new Stack();

        String str = "{([asdasd]dasda)asdasd}";

        int len = str.length();
        boolean isValid = false;

        for (int i = 0; i < len-1; i++) {
            String c =  Character.toString(str.charAt(i));



            System.out.println(c);
        }
    }
}
