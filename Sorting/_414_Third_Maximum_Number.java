package Sorting;

public class _414_Third_Maximum_Number {

    public static void insert(long[] maxArr, int val){
        int i=0; 
        while (i < maxArr.length) {
            if(maxArr[i] == val){ // ko duoc trung
                return;
            }else if(val > maxArr[i]){ // truong hop val > maxArr[i]
                break;
            }else{ // truong hop val < maxArr[i]
                i++;
            }
        }

        // code ma chay toi day la val lon hon mot trong so cac phan tu cua maxArr roi 
        // bat dau dich vi tri cac phan tu sang phai 1 don vi 
        if(i < maxArr.length){
            for(int j = maxArr.length-2; j >= i; j--){
                maxArr[j+1] = maxArr[j];
            }
            maxArr[i] = val;
        }

    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for(int num: nums){
            insert(maxArr,num);
        }

        if(maxArr[2] == Long.MIN_VALUE){
            return (int)maxArr[0];
        }
        return (int)maxArr[2];

    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
