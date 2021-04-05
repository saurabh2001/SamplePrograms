import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinusRatio {
    public static void main(String[] args) {
        /*
         * Program to find the ratio of positive negative or zeros in an array
         * print the ratio upto 6 decimals
         * e.g. if 2 positive in array of 6 elements, ratio = 2/3 printed upto 6 decimals, i.e. 0.333333
         * */
        int arr[] = new int[]{6, 1, 0,-2,-3, -7};
        int pos = 0, neg = 0,zeros = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<0) neg++;
            if(arr[i]>0) pos++;
            if(arr[i]==0) zeros++;
        }
        float floatPos=0f,floatNeg=0f,floatZeros=0f;
        floatPos = (float)pos/arr.length;
        floatNeg = (float)neg/arr.length;
        floatZeros = (float)zeros/arr.length;

        System.out.printf("Positive ratio : %.6f \n",floatPos);
        System.out.printf("Negative ratio : %.6f \n",floatNeg);
        System.out.printf("Zeros ratio : %.6f",floatZeros);
    }
}
