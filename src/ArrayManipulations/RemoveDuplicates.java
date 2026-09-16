package ArrayManipulations;
/**
 * Remove Duplicates from Sorted Array In-Place
 * Problem: Sort කරපු Array එකක Duplicate අගයන් In-Place අයින් කර නිවැරදි Length එක Return කරන්න.
 * Input: [1, 1, 2, 2, 3] | Output: [1, 2, 3] (Length: 3)

 * Logic: Two Pointers පාවිච්චි කරයි. වෙනස් අංකයක් හමුවූ විට j Index එකට දමා j++ කරයි.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        int j =0;

        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];

            }
        }
        System.out.println("New length is :"+(j+1));

    }
}
