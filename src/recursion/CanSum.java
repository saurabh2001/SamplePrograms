package recursion;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public static void main(String[] args) {
        // canSum( 7 , [3,2,6,4])  returns true because 7 can be made out of array numbers
        // canSum( 7 , [2, 4, 6])  returns false because 7 cannot be made out of array numbers
        // print all combination
        //int array[] = {3, 2, 6, 11};
        int array[] = {7, 14};
        Map<Integer, Boolean> memo = new HashMap<>();

        System.out.println(canSum(13, array, memo)); // 3+2+6
        System.out.println(canSum(5, array, memo)); // 3+2
        System.out.println(canSum(4, array, memo)); //2+2
        System.out.println(canSum(7, array, memo)); //3+2+2


        // Example for memo
        System.out.println(canSum(250, array,memo)); //2+2+2+6

    }

    public static boolean canSum(int targetSum, int array[], Map<Integer, Boolean> map) {

        if (map.containsKey(targetSum)) {
            System.out.println("pulling from memo: " + targetSum);
            return map.get(targetSum);
        }


        if(targetSum == 0) {
            return true;
        }
        if(targetSum < 0) {
            System.out.println("returning false");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Doing : " + targetSum + "-" + array[i]);
            boolean canSumFlag = canSum(targetSum - array[i], array, map);
            if(!map.containsKey(targetSum))
            {
                System.out.println("putting in memo: "+ targetSum + " and "+ canSumFlag);
                map.put(targetSum, canSumFlag);
            }

            if(canSumFlag) return true;
        }
        map.put(targetSum, false);
        return false;
    }
}
