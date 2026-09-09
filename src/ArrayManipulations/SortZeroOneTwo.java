package ArrayManipulations;

import java.util.Arrays;

/**
 * 3. Sort 0s, 1s, and 2s (Dutch National Flag Algorithm)
 * Problem: $0, 1, 2$ විතරක් තියෙන Array එකක් Arrays.sort() පාවිච්චි නොකර
 * එක පාරෙන් ($O(N)$ Time & $O(1)$ Space) Sort කරන්න.
 * Input: int[] arr = {2, 0, 2, 1, 1, 0}
 * Expected Output: 0 0 1 1 2 2
 * Logic එක:Pointers 3ක් පාවිච්චි කරයි:
 * low, mid, high.arr[mid] == 0 නම්: low සහ mid මාරු කර දෙකම $+1$ කරයි.
 * arr[mid] == 1 නම්: mid විතරක් $+1$ කරයි.arr[mid] == 2 නම්: mid සහ high මාරු කර high අගය $-1$ කරයි.
 */
public class SortZeroOneTwo {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;

            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
