package StringManipulation;

//Capitalize First Letter (හැම වචනෙකම මුල් අකුර ලොකු කිරීම):
//වාක්‍යයක තියෙන හැම වචනෙකම පළවෙනි අකුර Capital කරන්න. (උදා: "hello world" -> "Hello World"). (split() සහ substring())

import java.util.Arrays;
import java.util.Locale;

public class CapitalizeFirstLetter {
//    public static void main(String[] args) {
//        String word = "akila isuru kahingala";
//
//        String [] str =  word.split("");
//
//        for(int i =0;i<str.length;i++){
//            if(i==0|| str[i-1].equals(" ")){
//                str[i] = str[i].toUpperCase();
//            }
//        }
//        String result = String.join("", str);
//        System.out.println(result);
//
//
//    }
public static void main(String[] args) {
    String word = "akila isuru kahingala";

    String [] arr = word.split("");

    for(int i=0;i<arr.length;i++){
        if(i==0 || arr[i-1].equals(" ")){
           arr[i]=  arr[i].toUpperCase();
        }
    }
    String result = String.join("", arr);
    System.out.println(result);
}
}
