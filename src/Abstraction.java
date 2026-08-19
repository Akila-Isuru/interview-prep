public class Abstraction {
    public static void main(String[] args) {
        Notification n1=new EmailNotification("akila@gmail.com");
        Notification n2 = new SMSNotification("07751322538");


        String otpMessage = "Your OTP is 4589";

        n1.sendNotification(otpMessage);
        n2.sendNotification(otpMessage);
    }
}

class EmailNotification implements Notification{
    private String emailAddress;

    public EmailNotification(String emailAddress){
        this.emailAddress= emailAddress;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email to "+emailAddress+" :" +message);


    }
}

class SMSNotification implements Notification{
    private String phoneNumber;

    public SMSNotification(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS to "+phoneNumber+" :" +message);
    }
}
