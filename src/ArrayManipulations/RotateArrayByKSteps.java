package ArrayManipulations;

import java.util.Arrays;

/**
 * 2. Rotate Array by K Steps (Array එකක් දකුණට K ප්‍රමාණයකින් කරකවීම)
 *
 * Problem: Array එකක් සහ $K$ අගයක් ලබා දුන් විට, Array එකේ ඇති Element $K$ ප්‍රමාණයක් දකුණට Rotate කරන්න.
 * Input: arr = [1, 2, 3, 4, 5], k = 2Expected
 * Output: [4, 5, 1, 2, 3]
 * Logic එක (Reversal Algorithm):අලුත් Arrays හදන්නේ නැතුව In-Place කරන්න පුළුවන් පට්ටම Tricks 3ක් මෙන්න:
 * මුළු Array එකම Reverse කරන්න -> [5, 4, 3, 2, 1]
 * මුල් අංක $K$ ප්‍රමාණය Reverse කරන්න -> [4, 5, 3, 2, 1]
 * ඉතිරි අංක ටික Reverse කරන්න -> [4, 5, 1, 2, 3]
 */
public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,k-1);
        System.out.println(Arrays.toString(arr));
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
