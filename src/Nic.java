import java.util.Scanner;

public class Nic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  NIC: ");
        String nic = input.next();


        if (nic.length() == 12) {

            char c1 = nic.charAt(4);
            char c2 = nic.charAt(5);
            char c3 = nic.charAt(6);

            int gendercheck = Integer.parseInt("" + c1 + c2 + c3);

            System.out.println("Valid Nic number");

            if (gendercheck > 499) {
                System.out.println("Geneder is female");
            } else {
                System.out.println("Gender is male");
            }
        } else {
            System.out.println("Invalid NIC");
        }
    }
}