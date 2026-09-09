package StringManipulation;

import java.util.Arrays;

//Longest Word in a Sentence (දිගම වචනය සෙවීම):
//වාක්‍යයක් දීලා ඒකේ තියෙන දිගම වචනය මොකක්ද කියලා හොයන්න. (split(" ") පාවිච්චි කරලා Array එකකට අරන් දිගම එක හොයන්න).

public class LongestWordinASentence {
    public static void main(String[] args) {
        String word = "Akila isuru Kahingala";

        String [] str = word.split(" ");
        String longestWord = str[0];


        for(int i = 0;i<str.length;i++){
            if(str[i].length()>longestWord.length()) {
                longestWord = str[i];
            }
        }
        System.out.println("Longest Word: "+longestWord);
    }
}
