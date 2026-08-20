//Input: char[] arr = {'h', 'e', 'l', 'l', 'o'};
//
//Expected Output: ['o', 'l', 'l', 'e', 'h']

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        int left =0;
        int right =arr.length-1;

        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]= temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
