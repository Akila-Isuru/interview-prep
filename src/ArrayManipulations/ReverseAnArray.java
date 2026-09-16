package ArrayManipulations;

import java.util.Arrays;

public class ReverseAnArray {
//    public static void main(String[] args) {
//        int[] arr = {12, 35, 1, 10, 34, 1};
//
//        int temp =0;
//        int n = (arr.length)/2;
//
//        for(int i =0;i<n;i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int n = arr.length/2;

        for(int i=0;i<=n;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));


    }

}
