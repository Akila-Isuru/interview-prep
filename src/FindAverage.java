//Java වලින් int[] numbers = {10, 25, 30, 45, 52};
//කියන ඇරේ එකේ තියෙන අංකවල Average (මධ්‍යන්‍යය) හොයලා print කරන්න ඕනේ.
//        (පිළිතුර දශම සංඛ්‍යාවක් විදිහට එන්න ඕනේ).

public class FindAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 52};

        double total = 0;
        double average = 0;

        for(int num : numbers){
            total += num;
        }
        average = total / numbers.length;
        System.out.println(average);
    }
//public static void main(String[] args) {
//    int[] numbers = {10, 25, 30, 45, 52};
//    double total = 0;
//    int count = 0;
//    double average = 0;
//
//    for(int i = 0; i < numbers.length; i++) {
//        total += numbers[i];
//        count++;
//    }
//    average = total / count;
//    System.out.println(average);
//}

}
