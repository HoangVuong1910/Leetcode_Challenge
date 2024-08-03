package Recursion;
/**
 * https://leetcode.com/problems/fibonacci-number/
 * Tags: #Recursion
*/
public class _50_9_Fibonacci_Number {
    public static int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println("\n" + fib(3));
    }
}
