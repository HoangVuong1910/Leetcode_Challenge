package Array_String;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Tags: #array
 */
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int digit: nums){
            int amount_of_digit = amountOfDigit(digit);
            if(amount_of_digit % 2 == 0){
                count++;
            }
        }

        return count;
    }
    public static int amountOfDigit (int digit) {
        int amount_of_digit = 0;
        int result = digit;
        while(result != 0){
            result = result/10;
            amount_of_digit++;
        }
        return amount_of_digit;
    }
    // Another optimal solution
    public static int findNumbers1(int[] nums) {
        int count = 0;

        for(int digit: nums){
            int amount_of_digit = (int)Math.floor(Math.log10(digit)) + 1;
            if(amount_of_digit % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,22,345,7896};
        System.out.println("amount_of_digit: " + findNumbers1(nums));
    }

}