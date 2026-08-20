import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Remove Duplicates from Sorted Array (Sort වූ ඇරේ එකක ඩූප්ලිකේට් ඉවත් කිරීම)
//
//අරමුණ: Two-Pointer technique එකක් පාවිච්චි කර Unique අගයන් පමණක් ඉතිරි කිරීම.
//
//Input: {1, 1, 2, 2, 3, 4, 4}
//
//Output: Unique size 4 (Array: {1, 2, 3, 4,...})
public class RemoveduplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int write = arr[0];
        int read =arr[1];

        while(write<arr.length){
            if(write!=read){
                arr[write]=read;
                write++;
            }


        }
        System.out.println(Arrays.toString(arr));

    }
}
