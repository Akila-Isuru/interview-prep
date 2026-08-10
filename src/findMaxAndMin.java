//ඔයාගේ Task එක:
//int[] numbers = {45, 12, 85, 32, 89, 3, 67}; කියන ඇරේ එකේ තියෙන:
//විශාලම අංකය (Maximum) සහ
//කුඩාම අංකය (Minimum)

import javax.swing.*;

public class findMaxAndMin {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 85, 32, 89, 3, 67};
        int max =numbers[0];
        int min =numbers[0];

        for(int num : numbers){
            if(num>max){
                max = num;
            }else if(num<min){
            min = num;}
        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);


    }
}
