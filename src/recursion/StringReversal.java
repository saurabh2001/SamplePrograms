package recursion;

public class StringReversal {
    private static String reverseString(String string) {
        if(string.length() == 1) return string;

        String lastCharacter = string.substring(1);
        return reverseString(lastCharacter) + string.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("Reversed string : " + reverseString("abcde"));;
    }
}
