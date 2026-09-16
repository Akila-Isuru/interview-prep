package CoreJava;

//Factorial of a Number:
//අංකයක Factorial අගය හොයන්න (උදා: 5 දුන්නොත් $5 \times 4 \times 3 \times 2 \times 1 = 120$ එන්න ඕනේ). (For Loop)

public class FactorialofNumber {
//    public static void main(String[] args) {
//        int factorial =1;
//        int number =6;
//
//        for(int i =1;i<=number;i++){
//            factorial *= i;
//        }
//        System.out.println("Factorial is "+factorial);
//
//    }
public static void main(String[] args) {
    int number =5;
    int factorial=1;

    for(int i=1;i<=number;i++){
        factorial*=i;
    }
    System.out.println(factorial);
}
}
