import java.util.HashMap;
import java.util.Stack;

public class BalancedString {
    // Ref: https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("{","}");
        map.put("(",")");
        map.put("[","]");
        Stack<String> stack = new Stack<>();

        String str = "{([asdasd]dasda)asdasd}";

        int len = str.length();
        boolean isBalanced = true;

        for (int i = 0; i < len; i++) {
            String c =  Character.toString(str.charAt(i));
            System.out.print("------Processing: "+ c);
            if(map.containsKey(c)) {
                System.out.println("  Pushing into stack");
                stack.push(c);
            }
            else if(map.containsValue(c)) {
                System.out.println("  Popping from stack");
                if(stack.isEmpty()) {
                    System.out.println("  Stack is empty");
                    isBalanced = false;
                    break;
                }
                String value = map.get(stack.pop());
                if(!value.equals(c)) {
                    isBalanced = false;
                    break;
                }
            }
            else {
                System.out.println("  Ignoring the characters");
            }
        }
        if(isBalanced)
            System.out.println("String is balanced");
        else
            System.out.println("String is NOT balanced");
    }
}
