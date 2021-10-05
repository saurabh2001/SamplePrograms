package recursion;

import java.util.HashMap;
import java.util.Map;

public class FactorialUsingMemo {
    private Map<Integer, Integer> memo = new HashMap<>();

    private int factorial(int value){
        if(value < 1){
            throw new IllegalArgumentException("Value should be greater than 0!");
        }
        if(value == 1) return value;

        // see if we've already calculated this
        if(memo.containsKey(value)) {
            System.out.println("Getting value from memo for: " + value);
            return memo.get(value);
        }
        int result = value * factorial(value-1);

        memo.put(value,result);

        return result;
    }
    public static void main(String[] args) {
        // https://www.interviewcake.com/concept/java/memoization
        /*
        * This program illustrates how we can use memoization to remember the past results
        * Factorial: factorial of 5 is 5*4*3*2*1 = 120
        * Instead of int you can use Long if the value is  going to be tvery big
        * */
        FactorialUsingMemo fact = new FactorialUsingMemo();
        System.out.println(fact.factorial(4));
        System.out.println(fact.factorial(5)); // while calculating this it will pick the fact of 4 from memo
    }
}
