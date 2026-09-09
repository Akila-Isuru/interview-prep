//Find Missing Number (1 සිට N දක්වා අඩුවී ඇති අංකය සෙවීම)අරමුණ: Loop Logic සහ Simple Mathematical Formula එකතු කර ගැටලු විසඳීම
//.Input: {1, 2, 4, 5, 6} (N = 6)Output: 3 (අඩු අංකය)Key Logic: 1 සිට N දක්වා එකතුව $N \times (N+1) / 2$ සූත්‍රයෙන් අරන්,
//ඇරේ එකේ Actual Sum එක එකෙන් අඩු කිරීම.

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr={1, 6, 4, 5, 2};
        int n = arr.length+1;

        int expectedSum = n*(n+1)/2;

        int actualSum =0;

        for(int num:arr){
            actualSum+=num;
        }
        int missing_number = expectedSum-actualSum;

        System.out.println("Missing number: "+missing_number);

//        int expected_sum = n*(n+1)/2;
//
//        int actualSum =0;
//        for(int num:arr){
//            actualSum+=num;
//        }
//
//        int mising_number = expected_sum-actualSum;
//        System.out.println("mising number = "+mising_number);


    }


}
