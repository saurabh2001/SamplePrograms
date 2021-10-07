package recursion;

public class DecimalToBinary {
    private static String getBinary(int number, String binary) {
        int remainder, division;

        if(number == 0) return binary;
        division = number / 2;
        remainder = number % 2;

        binary = remainder + binary;
        return getBinary(division, binary);
    }
    public static void main(String[] args) {
        int number = 8;
        System.out.println("Binary for " + number + " is : " + getBinary(number, ""));
    }
}
