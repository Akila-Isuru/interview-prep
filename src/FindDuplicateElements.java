//Find Duplicate Elements (ඇරේ එකක ඩූප්ලිකේට් අංක සෙවීම)
// අරමුණ: Nested Loops ($O(N^2)$) වෙනුවට එක ලූප් එකකින් අගයන් සෙවීමට Frequency array එකක් හෝ HashSet
//පාවිච්චි කිරීම.Input: {4, 3, 2, 7, 8, 2, 3, 1}
//Output: [2, 3]Key Logic: කලින් හමුවූ අංක මතක තබා ගැනීම (Tracking frequency).


import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr ={4, 3, 2, 7, 8, 2, 3, 1};

        Set<Integer> normalNums = new HashSet<>();
        Set<Integer> duplicateNums = new HashSet<>();

        for(int num:arr){
            if(!normalNums.add(num)){
                duplicateNums.add(num);
            };
        }
        System.out.println(duplicateNums);
    }
}
