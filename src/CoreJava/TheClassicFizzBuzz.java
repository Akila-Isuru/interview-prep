package CoreJava;

//The Classic FizzBuzz:
//$1$ සිට $100$ දක්වා සංඛ්‍යා Print කරන්න. හැබැයි අංකය $3$ න් බෙදෙනවා නම් "Fizz" කියලත්,
//$5$ න් බෙදෙනවා නම් "Buzz" කියලත්, $3$ සහ $5$ දෙකෙන්ම බෙදෙනවා නම් "FizzBuzz" කියලත් Print වෙන්න ඕනේ.
//        (If/Else, Loop, Modulo %)
public class TheClassicFizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }else if (i%5==0) {
                System.out.println("Buzz");
            }else  {
                System.out.println("" + i);
            }


        }
    }
}
