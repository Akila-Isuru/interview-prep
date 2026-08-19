import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

//        Scanner intput=new Scanner(System.in);
//        String Nic = intput.nextLine();
//        String name = intput.nextLine();
//        Double amount = intput.nextDouble();
        BankApp bank = new BankApp("200310400960","akila",0);
       bank.deposit(1000);
       bank.getBalance();
       bank.withdraw(200);
       bank.getBalance();



    }
}
class BankApp{
    private String NIC;
    private String name;
    private double amount;

    public BankApp(String NIC, String name, double amount){
        this.NIC = NIC;
        this.name = name;
        this.amount = amount;
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > amount){
            System.out.println("Insufficient funds!");

        }
        else if(amount > 0){
            this.amount -= amount;
        }else {
            System.out.println("Amount cant be negative");
        }
    }
    public void deposit(double amount){
        if(amount>0){
            this.amount += amount;
        }else {
            System.out.println("Amount cant be negative");
        }
    }
    public void getBalance(){
        System.out.println("Your balance is "+this.amount);
    }

}
