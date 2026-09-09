package StringManipulation;

//Check if String has only Digits (ඉලක්කම් පමණක් තිබේද):
//දීලා තියෙන String එකේ තියෙන්නේ ඉලක්කම් (0-9) විතරද,
//නැත්නම් වෙන අකුරුත් තියෙනවද කියලා Check කරන්න. (උදා: "12345" -> true, "12a45" -> false).

import java.util.Arrays;

public class CheckOnlyDigits {
    public static void main(String[] args) {

        String word ="123a45";
        String [] str = word.split("");

        boolean isNumber = true;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);

            if(ch<'0' || ch>'9'){
                isNumber = false;
                break;
            }


        }

        if(isNumber){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
