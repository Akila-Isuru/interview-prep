package StringManipulation;
//
//Count Specific Character (අකුරක් කීපාරක් තියෙනවද):
//String එකක එක අකුරක් කී පාරක් තියෙනවද කියලා හොයන්න. (උදා: "programming" කියන එකේ 'r' අකුර කී පාරක් තියෙනවද).

import java.util.Arrays;
import java.util.Scanner;

public class CountingAndFrequency {
    public static void main(String[] args) {
        String word ="I love programming and programming has start to love me";
        System.out.print("Enter the keyword :");
        Scanner sc = new Scanner(System.in);
        String keyword = sc.nextLine();

        String [] str = word.split(" ");
        int count = 0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(keyword)){
                count++;
            }
        }
        System.out.println("The "+keyword+" keyword has repeated "+count+" times");

    }
}
