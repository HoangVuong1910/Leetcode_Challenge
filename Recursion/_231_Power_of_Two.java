package Recursion;
/**
 * https://leetcode.com/problems/power-of-two/
 * Tags: #Recursion
*/
public class _231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwo(n / 2); 
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }
}
