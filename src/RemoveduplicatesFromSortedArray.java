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

        Set<Integer> unique_numbers = new HashSet<>();

        for (int i : arr) {
            unique_numbers.add(i);
        }
        System.out.println(unique_numbers);

    }
}
