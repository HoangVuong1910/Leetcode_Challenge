package Array_String;
/**
 * Name: Remove Element
 * Url: https://leetcode.com/problems/remove-element/
 */
public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for(int i=0; i<n; ){
            if(nums[i] == val){
                //Xóa pt thứ i
                for(int k=i; k<n-1; k++){
                    nums[k] = nums[k+1];
                }
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
    // Another optimal solution: two pointer
    public static int removeElement1(int[] nums, int val) {
        int index = 0;
        for(int num : nums) {
            if(num != val){
                nums[index++] = num;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,3,2};
        System.out.println("\n" + removeElement1(nums, 2));
    }
    
}
