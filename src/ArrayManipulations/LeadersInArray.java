package ArrayManipulations;

/**
 * 1. Leaders in an Array (Array එකක 'Leader' අගයන් සෙවීම)
 * Problem: Array එකක යම් අංකයකට දකුණු පසින් තියෙන සියලුම අංක වලට වඩා ඒ අංකය විශාලයි නම්,
 * ඒ අංකය "Leader" කෙනෙක් වෙනවා. Array එකේ තියෙන සියලුම Leaders ලා හොයන්න.
 * (අන්තිම අංකයට දකුණෙන් අංක නැති නිසා අන්තිම අංකය හැමවිටම Leader කෙනෙකි).
 * Input: int[] arr = {16, 17, 4, 3, 5, 2}
 * Expected Output: 2, 5, 17 (හෝ 17, 5, 2)
 * Logic එක:වම් පැත්තේ ඉඳන් බලන්න ගියොත් Nested Loops ($O(N^2)$) ඕන වෙනවා.
 * ඒත් දකුණු පැත්තේ ඉඳන් මුලට (Right to Left) ආවොත්, දැනට හම්බුණු ලොකුම අගය (maxFromRight)
 * Variable එකක තියාගෙන එක පාරෙන් ($O(N)$) සියලුම Leaders ලා හොයාගන්න පුළුවන්!
 */

public class LeadersInArray {
    public static void main(String[] args) {

        int [] arr = {16, 17, 4, 3, 5, 2};;
        int n = arr.length;

        int maxFromRight = arr[n-1];
        System.out.print(maxFromRight+" ");

        for(int i = n-2;i>=0;i--){
            if(arr[i]>maxFromRight){

                maxFromRight=arr[i];

                System.out.print(maxFromRight+" ");
            }
        }
    }
}
