package Array_String;
/**
 * https://leetcode.com/problems/merge-sorted-array/
 * Tags: #array
 */
public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int element: nums2){
            insert(element,nums1,m);
            m++;
        }
    }
    public static void insert(int element, int[] nums1, int m){
        boolean flag = false;
        for(int i=0; i<m; i++){
            if(nums1[i] > element){
                flag = true;
                for(int k=m-1; k>=i; k--){
                    nums1[k+1]= nums1[k];
                }
                nums1[i] = element;
                break;
            }
        }
        if(!flag){
            nums1[m] = element;
        }
    }
    // Another optimal solution 1: merge nums2 to nums 1, after sort nums1 
    // Another optimal solution 2: two pointer
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;
        
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
        
    }
    /*
     * Cách thức hoạt động của phương thức:
     
        Khởi tạo các biến con trỏ:

        p1 = m - 1: Chỉ vào phần tử cuối cùng của nums1 đang có giá trị thực.
        p2 = n - 1: Chỉ vào phần tử cuối cùng của nums2.
        pMerge = m + n - 1: Chỉ vào vị trí cuối cùng của mảng nums1 (vị trí để gán giá trị).
        Vòng lặp while: Chạy cho đến khi p2 còn lớn hơn hoặc bằng 0 (khi còn phần tử trong nums2 cần gộp vào).

        Nếu p1 >= 0 và giá trị tại nums1[p1] lớn hơn nums2[p2], thì gán nums1[pMerge] = nums1[p1] và giảm p1 cùng pMerge đi 1.
        Ngược lại, gán nums1[pMerge] = nums2[p2] và giảm p2 cùng pMerge đi 1.
        Với cách tiếp cận này, các phần tử lớn hơn sẽ được đặt vào đúng vị trí trong mảng nums1 từ cuối lên đầu, đảm bảo mảng kết quả nums1 vẫn được sắp xếp theo thứ tự tăng dần.
     */
    
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {0,3,6};
        System.out.println("\n");
        merge1(nums1, 4, nums2, 3);
    }
}
