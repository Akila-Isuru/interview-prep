// Find Second Largest Element in an Array (දෙවනුවට විශාලම අංකය සෙවීම)අරමුණ:
//Array එක Sort කරන්නේ නැතුව ($O(N)$ කාලයකින්) එක ලූප් එකෙන් අගය හොයන්න පුළුවන්දැයි බැලීම.Input: {12, 35, 1, 10, 34, 1}
//Output: 34Key Logic: largest සහ
//secondLargest ලෙස variables 2ක් තබාගෙන එක ලූප් එකකින් update කිරීම.
//


import java.util.Arrays;

public class FindSecondlargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = 0;
        int secondLargest = 0;

        for(int num : arr){
            if(num>largest){
               secondLargest = largest;
               largest = num;
            }else if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);


    }
}
