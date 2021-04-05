import java.util.Arrays;
import java.util.List;

public class ValidateSequence {
    public static void main(String[] args)
    {
        /*
        * Program to validate subsequence
        * Subsequence need not be adjacent
        * e.g. For array [1],2,3,4,5], [1,2,4] and [2,5] are valid subsequences
        * */
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10, 11);
        List<Integer> sequence = Arrays.asList(1, 6,  10, 11);
        boolean isValid  = isValidSubsequence(array, sequence);
        System.out.println("Valid sequence : " + isValid);

    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int seqIndex = 0;
        while (arrayIndex < array.size() && seqIndex < sequence.size()){
            if(array.get(arrayIndex).equals(sequence.get(seqIndex)))
            {
                seqIndex++;
            }
            arrayIndex++;

            if(seqIndex== sequence.size()){
                return true;
            }

        }
        return false;
    }
}
