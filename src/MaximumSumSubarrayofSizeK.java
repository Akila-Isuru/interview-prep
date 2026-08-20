//Input: int[] arr = {2, 1, 5, 1, 3, 2}; සහ k = 3
//Goal: ළඟ ළඟ තියෙන අංක 3 ක (k = 3) ලබාගත හැකි විශාලම එකතුව (Maximum Sum) සෙවීම.
//        Output: 9 (මොකද {5, 1, 3} කියන 3 දෙනාගේ එකතුව 9 වේ).

public class MaximumSumSubarrayofSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k =3;

        int windowSum = 0;

        for(int i=0;i<k;i++){
            windowSum +=arr[i];
        }
        int maxSum = windowSum;

        for(int i=k;i<arr.length;i++){
            windowSum +=arr[i]-arr[i-k];

            if(windowSum>maxSum){
               maxSum = windowSum;
            }
        }
        System.out.println("Maximum Sub :"+maxSum);



    }
}
