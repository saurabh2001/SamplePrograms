import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        /*
         * Program to find the difference between diagonal elements
         * */
        int n, diagonal1 = 0, diagonal2 = 0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter dimensions");
        n=in.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Row : #" + (i+1));
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) diagonal1 = diagonal1 + a[i][j];
                if (i == n - j - 1) diagonal2 = diagonal2 + a[i][j];
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Diagonal difference is : " + Math.abs(diagonal1-diagonal2));
    }
}
