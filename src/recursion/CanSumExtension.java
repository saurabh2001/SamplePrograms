package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CanSumExtension {

    public static void main(String[] args) {
        // print all combination
        int array[] = {3, 4, 24};
        Map<Integer, Boolean> memo = new HashMap<>();

        System.out.println(canSum(14, array, memo));
    }

    private static final ArrayList emptyArray = new ArrayList();

    public static ArrayList canSum(int targetSum, int[] array, Map<Integer, Boolean> map) {

        if (targetSum == 0) {
            return new ArrayList();
        }
        if (targetSum < 0) {
            System.out.println("returning false");
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Doing : " + targetSum + "-" + array[i]);
            int remainder = targetSum - array[i];
            ArrayList result = canSum(remainder, array, map);
            if (result != null) {
                result.add(array[i]);
                return result;
            }
        }
        return null;
    }
}

