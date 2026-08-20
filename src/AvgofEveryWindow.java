//Input: int[] arr = {10, 20, 30, 40, 50}; සහ k = 3
//Goal: ජනේලය Slide වෙද්දී ලැබෙන සෑම Window එකකම සාමාන්‍යය (Average) මුද්‍රණය කිරීම.
//Expected Output:
//        20.0
//        30.0
//        40.0

public class AvgofEveryWindow {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k =3;

        int windowSum =0;
        int windowAvg=0;

        for(int i =0;i<k;i++){
            windowSum+=arr[i];
            windowAvg=windowSum/k;
        }
        System.out.println(windowAvg);

        for(int i =k;i<arr.length;i++){
            windowSum+=arr[i]- arr[i-k];

            windowAvg=windowSum/k;
            System.out.println(windowAvg);
        }

    }
}
