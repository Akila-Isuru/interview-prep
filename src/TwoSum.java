//int[] numbers = {2, 7, 11, 15}; කියන ඇරේ එක සහ int target = 9; කියලා එකතු අගයක් දෙනවා.
public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 26;
        String result = findTwoSumPairs(numbers, target);
        System.out.println(result);

    }

    private static String findTwoSumPairs(int[] numbers, int target) {


        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                System.out.println(numbers[left]+" "+numbers[right]);
                break;
            } else if (sum>target) {
                right--;

            }else  {
                left++;
            }
        }
        return null;
    }
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return "Yes";
//                }
//            }
//        }
//        return "No";
//    }


//    private static String findTwoSumPairs(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return "Pair found at indices: " + i + " and " + j + " (Values: " + numbers[i] + " and " + numbers[j] + ")";
//                }
//            }
//        }
//        return "No pair found";
//    }


}

