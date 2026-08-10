//Java වලින් අංක ඇරේ එකක (int[] numbers = {5, 10, 15, 20};) තියෙන සියලුම අංකවල
//එකතුව (Sum) හොයලා Screen එකේ Print කරන ක්‍රමයක් ලියන්න.

import javax.swing.*;

class Main {
    public static void main(String[] args) {
        int [] numbers = {5,10,15,20};
        int total = 0;
//        for(int i = 0; i < numbers.length; i++){
//            total += numbers[i];
//        }
        for (int num : numbers) {
            total += num;
        }
        System.out.println(total);
    }
}