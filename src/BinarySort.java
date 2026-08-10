//int[] numbers = {10, 20, 30, 40, 50, 60, 70}; කියන පිළිවෙළට තියෙන ඇරේ එකේ int target = 50;
//    කියන අගය Binary Search පාවිච්චි කරලා හොයාගෙන, ඒක පිහිටා තියෙන Index එක print කරන්න ඕනේ.

import java.util.Arrays;

public class BinarySort {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target = 60;

        int result = binarySearch(numbers,target);
        if(result == -1){
            System.out.println("Value not found");
        }else {
            System.out.println(result);
        }


    }

    public static int binarySearch(int[] numbers, int target) {

        int left= 0;
        int right = numbers.length-1;

        while(left<right){
            int mid = (left+right)/2;
            if(target == numbers[mid]){
                return mid;
            }else if(target < numbers[mid]){
                right = mid - 1;
            }else  {
                left = mid + 1;
            }
        }
        return -1;
    }
}
