import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SocksPairs {
    public static void main(String[] args) {
        /*
         * Program to find the number of pair of socks
         * each number in the array represents the color of the socks
         * e.g. For array [1],2,3,4,5], [1,2,4] and [2,5] are valid subsequences
         * */
        List<Integer> arrayOfPileOfSocks = Arrays.asList(1, 2, 3, 2, 1, 3, 4, 1);
        ArrayList tempArray = new ArrayList();
        int pairOfSocks = 0;

        for (int i = 0; i < arrayOfPileOfSocks.size(); i++) {

            int element = arrayOfPileOfSocks.get(i);

            if (!tempArray.contains(element)) {
                tempArray.add(element);
            } else {
                tempArray.remove(element);
                pairOfSocks++;
            }
        }
        System.out.println("Valid Pair of socks::" + pairOfSocks);
    }
}
