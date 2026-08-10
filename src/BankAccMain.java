public class BankAccMain {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount("1000000001",10000);

    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String AccountNumber, double balance){
        this.accountNumber = AccountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
       if(amount > 0){
           this.balance += amount;
       }else {
           System.out.println("Amount cant be negative");
       }
    }
    public void withdraw(double amount){
        if(amount > 0 && this.balance >= amount){
            this.balance -= amount;
        }else  {
            System.out.println("Amount cant be negative");
        }
    }

    public double getBalance() {
        return balance;
    }
}
