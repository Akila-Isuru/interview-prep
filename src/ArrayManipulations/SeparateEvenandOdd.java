package ArrayManipulations;

//Separate Even and Odd:
//Array එකක තියෙන ඉරට්ටේ (Even) සහ ඔත්තේ (Odd) සංඛ්‍යා වෙන් කරලා Print කරන්න. (For Loop, If, Modulo % 2)
public class SeparateEvenandOdd {
    public static void main(String[] args) {
        int [] arr = {12,13,14,15,16};
        String evenNumbers = "";
        String oddNumbers = "";

        for(int num : arr){
            if(num%2==0){
                evenNumbers+=num+" ";
            } else {
                oddNumbers+=num+" ";

            }
        }
        System.out.println("Even Numbers : "+evenNumbers);
        System.out.println("Odd Numbers : "+oddNumbers);

    }
}
