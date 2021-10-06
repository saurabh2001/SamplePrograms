package recursion;

import java.util.Scanner;

public class NumberPalindromeChecker {
    private static int getReversedNumber(int num){
        int remainder, reversedNum = 0;

        while(num!=0){
            remainder = num % 10;
            num = num / 10;
            reversedNum = reversedNum * 10 + remainder;
        }
        return reversedNum;
    }
    private static boolean isPalindrome(int num){

        boolean isPalindromeNum;
        int reversedNum = getReversedNumber(num);

        isPalindromeNum = num == reversedNum;
        return isPalindromeNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isPal = isPalindrome(number);

        if (isPal) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number not palindrome");
        }
    }
}
