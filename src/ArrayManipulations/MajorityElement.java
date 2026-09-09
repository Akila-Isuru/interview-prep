package ArrayManipulations;

/**
 * 5. Majority Element (Boyer-Moore Voting Algorithm)
 * Problem: Array එකක මුළු ප්‍රමාණයෙන් අඩකට වඩා ($> N/2$) යෙදෙන අංකය සොයන්න.
 * (එවැනි අංකයක් අනිවාර්යයෙන්ම පවතී).
 * Input: int[] arr = {2, 2, 1, 1, 1, 2, 2}
 * Expected Output: 2
 * Logic එක:ඡන්දයක් දිනනවා වගේ හිතන්න:candidate කෙනෙක් තෝරාගෙන count = 1 කරයි.
 * ඊළඟට එන්නේ ඒ අංකයම නම් count++, වෙනස් අංකයක් නම් count--.count == 0 වුණොත්, අලුත් අංකය candidate ලෙස තෝරාගනී.
 */

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int candidate = arr[0];
        int count=0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == candidate){
                count++;

            }else {
                count--;
            }
            if(count==0){
                candidate = arr[i];
                count=1;
            }

        }
        System.out.println("Majority Element: "+candidate);

    }
}
