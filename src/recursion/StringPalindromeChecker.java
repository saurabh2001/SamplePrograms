package recursion;

import java.util.Scanner;

public class StringPalindromeChecker {
    private static boolean isPalindrome(String stringToCheck){
        System.out.println(stringToCheck);
        if (stringToCheck.length() ==0 || stringToCheck.length() == 1)
            return true;
        if(stringToCheck.charAt(0) == stringToCheck.charAt(stringToCheck.length()-1))
            return isPalindrome(stringToCheck.substring(1,stringToCheck.length()-1)); // dont forget to write return here

        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check");
        String string = scanner.nextLine();

        boolean isPal = isPalindrome(string);

        if (isPal) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String not palindrome");
        }
    }
}
