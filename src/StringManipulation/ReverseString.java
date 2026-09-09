package StringManipulation;

//Reverse a String (වචනයක් අනිත් පැත්ත හැරවීම):
//StringBuilder.reverse() පාවිච්චි කරන්නේ නැතුව, For Loop එකක් දාලා අග ඉඳන් මුලට String එක reverse කරන්න.

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Car";
        String [] str =  word.split("");
        int n = str.length/2;

        String temp = "";

        for(int i =0;i<n;i++){
            temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;

        }
        String result = String.join("", str);
        System.out.println(result);

//        MEHEMATH PULUWAN HODEE STRINGBUILDER USE KARALA

//        StringBuilder sb = new StringBuilder();
//        for (String s : str) {
//            sb.append(s);
//        }
//        String result = sb.toString();
//
//        System.out.println(result);

    }
}
