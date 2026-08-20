//Input: int[] arr = {10, 20, 30, 40, 50}; සහ k = 3
//
//Expected Output:
//        60
//        90
//        120


public class PrintSumofEveryWindow {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k =3;

        int windowSum =0;

        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        System.out.println(windowSum);

        for(int i=k;i<arr.length;i++){
            windowSum+=arr[i]-arr[i-k];
            System.out.println(windowSum);
        }




    }
}
