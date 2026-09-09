//ඔයාගේ Task එක:
//ඔයාට int[] numbers = {1, 2, 3, 4, 5}; කියලා ඇරේ එකක් දෙනවා.

import javax.swing.*;
import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int temp =0;
//        int n = (numbers.length)/2;
//
//        for(int i =0;i<n;i++){
//            temp = numbers[i];
//            numbers[i] = numbers[numbers.length-1-i];
//            numbers[numbers.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(numbers));

        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
