package ArrayManipulations;

import java.util.Arrays;

/**
 * 4. Merge Two Sorted Arrays (Sorted Arrays දෙකක් අමුණා Sort කිරීම)
 * Problem: පිළිවෙළට Sort කරලා තියෙන Arrays දෙකක් අරන්,
 * ඒ දෙක එකතු කරලා එක Sorted Array එකක් සාදන්න.
 * Input: arr1 = [1, 3, 5, 7], arr2 = [2, 4, 6, 8]
 * Expected Output: 1 2 3 4 5 6 7 8
 * Logic එක (Two Pointer Merge):i සහ j කියලා Pointers දෙකක් අරන් arr1[i] සහ arr2[j] සසඳනවා.
 * කුඩා අගය අලුත් Array එකට දාලා අදාළ Pointer එක විතරක් $+1$ කරනවා.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int [] result = new int[arr1.length+arr2.length];
        int i =0,j=0,k=0;

        while (i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }else {
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i< arr1.length){
            result[k]=arr1[i];
            i++;
            k++;

        }
        while (j< arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(result));


    }
}
