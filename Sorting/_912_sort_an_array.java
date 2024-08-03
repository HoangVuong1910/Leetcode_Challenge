package Sorting;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-an-array/
 * Tags: #sorting
 */
public class _912_sort_an_array {
    // su dung thuat toan merge sort
    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i= 0, i1=0, i2=0;
        while(i < n){
            if(i1 < a1.length && i2 < a2.length){ // hai mang a1 va a2 con phan tu (khac rong)
                if(a1[i1] <= a2[i2]){ // neu a1 <= a2
                    result[i++] = a1[i1++];
                }else{ //nguoc lai a2 <= a1
                    result[i++] = a2[i2++];
                }
            }else{ //truong hop a1 hoac a2 rong
                if(i1 < a1.length){ // truong hop a1 khac rong va a2 rong
                    result[i++] = a1[i1++];
                }else{ // truong hop a2 khac rong va a1 rong
                    result[i++] = a2[i2++];
                }
            }
        }
            
        

        return result;
    }

    public static int[] mergeSort(int a[], int L, int R){

        // Dieu kien dung
        if(L > R) return new int[0];
        if(L == R){
            int[] childArrayIsSorted = {a[L]};
            return childArrayIsSorted;
        }

        // chia ra
        int k = (L+R)/2;
        int[] a1= mergeSort(a, L, k);
        int[] a2= mergeSort(a, k+1, R);

        // trộn vào: tới bước này thì a1 và a2 là các mảng đã được sắp xếp (Mảng 1 phần tử đc sắp xếp)
        int[] result = merge(a1, a2);
        return result;
        

    }

    // su dung thuat toan quick sort
    public static void quickSort(int[] a, int L, int R){
        //dieu kien dung 
        if(L >= R) return;
        // Chọn khóa 
        int key = a[(L+R)/2];
        // Phân bổ mảng theo khóa 
        int pivot = partition(a, L, R, key);
        // Chia đôi mảng => lặp lại
        quickSort(a, L, pivot-1);
        quickSort(a, pivot, R);
    }
    // return pivot value
    public static int partition(int[] a, int L, int R, int key){
        int iL = L;
        int iR= R;
        while(iL <= iR){
            // Với iL, tìm phần tử >= key để đổi chỗ 
            while(a[iL] < key) iL++;
            // Với iR, tìm phần tử <= key để đổi chỗ 
            while(a[iR] > key) iR--;
            if(iL <= iR){
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++; iR--;
            }
        }
        return iL;
    }

    

    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] nums = {6,7,8,5,4,1,2,3};
        // System.out.println("Ket qua: " + Arrays.toString(mergeSort(nums, 0, nums.length-1)));
        quickSort(nums, 0, nums.length-1);
        
        System.out.println("Ket qua: " + Arrays.toString(nums));
    }
}
