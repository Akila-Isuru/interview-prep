package CoreJava;

//Sum of Digits:
//දීලා තියෙන අංකයක ඉලක්කම්වල එකතුව හොයන්න (උදා: 1234 දුන්නොත් $1+2+3+4 = 10$ එන්න ඕනේ). (While Loop, Modulo %)

public class SumOfDigits {
//    public static void main(String[] args) {
//        int number = 1234;
//        int total = 0;
//        while(number>0){
//            int remainder = number % 10;
//            total += remainder;
//            number = number / 10;
//        }
//        System.out.println("Total is "+total);
//
//    }
public static void main(String[] args) {
    int number =1234;
    int total =0;

    while(number>0){
        int remainder = number%10;
        total+=remainder;
        number=number/10;
    }
    System.out.println(total);
}
}
