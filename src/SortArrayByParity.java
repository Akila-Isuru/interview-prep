//Input: int[] nums = {3, 1, 2, 4};
//Expected Output: {4, 2, 1, 3} (හෝ සියලුම ඉරට්ට සංඛ්‍යා මුලටත්, ඔත්තේ සංඛ්‍යා අගටත් ඇති ඕනෑම පිළිවෙලක්).

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};

        int left =0;
        int right = nums.length-1;

        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
            if(nums[left]%2==0){
                left++;
            }
            if(nums[right]%2!=0){
                right--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
