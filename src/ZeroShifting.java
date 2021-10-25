import java.util.Arrays;

public class ZeroShifting {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 2, 0, 5, 0, 7, 2, 9, 6, 0, 4};
        // op expected : [5, 2, 5, 7, 2, 9, 6, 4, 0, 0, 0, 0]
        // Ref: https://www.geeksforgeeks.org/move-zeroes-end-array/
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
                arr[cnt++]= arr[i];
        }
        while(cnt < arr.length)
        {
            arr[cnt++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
