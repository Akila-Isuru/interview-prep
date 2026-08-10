//int[] numbers = {64, 34, 25, 12, 22, 11, 90}; කියන ඇරේ එක Bubble Sort පාවිච්චි කරලා
//කුඩා අගයේ සිට විශාල අගය දක්වා (Ascending Order) පිළිවෙළට සකස් කරලා print කරන්න ඕනේ.

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        int temp =0;

        for(int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
//java Intern Interviews වලදී අහන පැත්ත: "How to Optimize Bubble Sort?"
//මෙන්න මේ ප්‍රශ්නය Interviewer කෙනෙක් Bubble Sort එක ගැන අහලා ඉවර වුණ ගමන් අහන්න ගොඩක් ඉඩ තියෙන දෙයක්:
//        "දැනටමත් Sort වෙලා තියෙන Array එකක් දුන්නොත්, නැත්නම් මගදී Array එක Sort වෙලා ඉවර වුණොත්, " +
//        "නිකරුණේ Loops දුවන්නේ නැතුව මේක තවත් වේගවත් (Efficient) කරන්නේ කොහොමද?"

//විසඳුම (boolean swapped flag එකක් එකතු කිරීම):
//
//ලූප් එකේ එක වටයක් (Inner loop pass එකක්) යන අතරතුර කිසිම අංක දෙකක් මාරු වුණේ නැත්නම්,
//ඒ කියන්නේ Array එක සම්පූර්ණයෙන්ම Sort වෙලා ඉවරයි! ඒ නිසා අපිට ලූප් එක එතැනින්ම break කරලා නවත්වන්න පුළුවන්.
