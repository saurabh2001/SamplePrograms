package recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciUsingMemo {
    private Map<Integer, Integer> memo = new HashMap<>();

    private int fib(int value){
        if(value < 0){
            throw new IllegalArgumentException("Index is negative, not allowed!");
        }
        if(value == 0 || value == 1) return value;

        // see if we've already calculated this
        if(memo.containsKey(value)) {
            System.out.println("Getting value from memo for: " + value);
            return memo.get(value);
        }
        int result = fib(value-1) + fib(value-2);

        memo.put(value,result);

        return result;
    }
    public static void main(String[] args) {
        // https://www.interviewcake.com/concept/java/memoization
        /*
        * This program illustrates how we can use memoization to remember the past results
        * Fibonacci: a series of numbers in which each number is the sum of the two preceding numbers.
        * The simplest is the series 1, 1, 2, 3, 5, 8, etc.
        *
        * */
        System.out.println(new FibonacciUsingMemo().fib(3));
    }
}
