package Array_String;
/**
 * Url: https://leetcode.com/problems/richest-customer-wealth/
*/

public class _1672_richest_customer_wealth {
    public static int maximumWealth(int[][] accounts) {
        int numberRow = accounts.length;
        int numberColumn = accounts[0].length;
        int max = sumOfRow(accounts, 0);
        for (int i = 1; i < numberRow; i++) {
            int sum = 0;
            for(int j= 0; j < numberColumn; j++){
                sum+= accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
    public static int sumOfRow(int[][] accounts, int row){
        int sum = 0, numberColumn = accounts[0].length;
        
        for(int i=0 ; i < numberColumn; i++){
            sum += accounts[row][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}} ;
        System.out.println(maximumWealth(accounts));
    }
}
