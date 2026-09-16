package ArrayManipulations;

/**
 * Subarray with Given Sum (Sliding Window)Problem:
 * ධන සංඛ්‍යා සහිත Array එකක එකතුව $K$ වන ළඟ ළඟ පිහිටි Subarray එක සොයන්න.
 * Input: arr = [1, 4, 20, 3, 10, 5], sum = 33 |
 * Output: Index 2 to 4Logic: windowSum > target වූ විට start Pointer
 * එකෙන් අගයන් අඩු කරමින් Sliding Window ක්‍රමය පාවිච්චි කරයි.
 */
public class SubarrayGivenSum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int start =0;
        int windowSum =0;
        int target =25;

        for(int i =0;i<arr.length;i++){
            windowSum+=arr[i];

            // 2. එකතුව target එකට වඩා වැඩි නම්, වම් පැත්තෙන් (start) අගයන් අඩු කරමින් Window එක පොඩි කරනවා
            while(windowSum>target){
                windowSum-=arr[start];
                start++;
            }

            if(windowSum==target){
                System.out.println("Found between index "+start+" and "+i);
                return;
            }


        }
        System.out.println("Not found");
    }
}
