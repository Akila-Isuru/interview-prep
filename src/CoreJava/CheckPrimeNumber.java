package CoreJava;

//Check Prime Number:
//දීලා තියෙන අංකයක් ප්‍රථමක සංඛ්‍යාවක්ද (Prime - බෙදිය හැක්කේ $1$ න් සහ එම සංඛ්‍යාවෙන් පමණයි)
//කියලා Check කරන්න. (For Loop, If)
public class CheckPrimeNumber {
//    public static void main(String[] args) {
//
//        int number =11;
//        int count = 0;
//
//
//        for(int i =1;i<=number;i++){
//            if(number%i==0){
//                count++;
//            }
//        }
//        if(count<=2){
//            System.out.println("Prime Number");
//        }else {
//            System.out.println("Not Prime Number");
//        }
//    }

    public static void main(String[] args) {
        int number =15;
        int count=0;

        for(int i =1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("Not Prime Number");
        }else {
            System.out.println("Prime Number");
        }
    }
}
