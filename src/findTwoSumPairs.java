public class findTwoSumPairs {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 26;

        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                System.out.println("The two pairs found at index : "+left+" and "+right);
                break;
            }else if(sum>target){
                right--;
            }else {
                left++;
            }
        }
    }
}
