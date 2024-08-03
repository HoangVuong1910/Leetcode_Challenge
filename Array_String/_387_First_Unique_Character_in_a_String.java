package Array_String;
/**
 * Url: https://leetcode.com/problems/first-unique-character-in-a-string
*/

public class _387_First_Unique_Character_in_a_String {
    // Sử dụng kỹ thuật mảng tần suất
    public int firstUniqChar(String s) {
        int[] frequencyArray = new int[123];
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            frequencyArray[(int)arr[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            if(frequencyArray[(int)arr[i]] == 1){
                return i;
            }
        }
        return -1;
    }
}
