import java.util.Scanner;

//int[] numbers = {12, 45, 67, 23, 89, 34}; කියන ඇරේ එක සහ int target = 23;
//    කියලා හොයන්න ඕන අගයක් දෙනවා.
public class FindTargetElement {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 34};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target value :");
        int target = scanner.nextInt();
        String result = LinearSearch(numbers,target);
        System.out.println(result);
    }

    private static String  LinearSearch(int[] numbers, int targetValue) {
        for (int i =0;i<numbers.length;i++){
            if(numbers[i]==targetValue){
                return "Element found at index "+i;
            }
        }
        return "Element not found";
    }
}
