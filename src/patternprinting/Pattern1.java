package patternprinting;

import java.util.Arrays;

public class Pattern1 {
    /*
     * Print following pattern
     *                7 3 6
     *                * - -
     *                * - *
     *                * - *
     *                * - *
     *                * * *
     *                * * *
     *                * * *
     *
     *    array elements denote the no of stars to print starting from bottom
     * */
    public static void main(String[] args) {
        int arr[] = {7, 3, 6};
        int maxNo = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < maxNo; i++) {
            for (int j = 0; j < arr.length; j++) {

                if(arr[j] + i - maxNo  >= 0)
                    System.out.print("* ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }

    }
}
