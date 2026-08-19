public class RuntimePolymorphism
{
    public static void main(String[] args) {
        Payment[] payments = new Payment[2];
        CreditCardPayment creditCardPayment = new CreditCardPayment("2002",1000);
        PaypalPayment paypalPayment = new PaypalPayment(10000,"akila@gmail.com");
        payments[0] = creditCardPayment;
        payments[1] = paypalPayment;

        for(Payment payment : payments){
            payment.processPayment();
        }


    }
}


class Payment{
    protected double amount;

    public Payment(double amount){
        this.amount =amount;

    }

    public void processPayment(){
        System.out.println("Processing Payment"+amount);
    }



}

class CreditCardPayment extends Payment{
    private String cardNumber;

    public CreditCardPayment(String cardNumber,double amount){
        super(amount);
        this.cardNumber = cardNumber;

    }

    @Override
    public void processPayment(){
        System.out.println("Processing credit card payment of Rs."+amount+" using card NUmber "+cardNumber);
    }

}

class PaypalPayment extends Payment{
    private String email;


    public PaypalPayment(double amount,String email) {
        super(amount);
        this.email = email;

    }

    @Override
    public void processPayment(){
        System.out.println("Processing paypal payment of Rs."+amount+" using email "+email);
    }
}