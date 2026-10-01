import java.util.Arrays;

public class SelectionSort {
//    public static void main(String[] args) {
//        int[] numbers = {64, 25, 12, 22, 11};
//
//        if(numbers.length <=0 || numbers== null){
//            return;
//        }
//        int n = numbers.length;
//
//        for(int i =0;i<n-1;i++){
//            int minIndex = i;
//            for(int j=i+1;j<n;j++){
//                if(numbers[j]<numbers[minIndex]){
//                    minIndex = j;
//                }
//
//            }
//            if(minIndex !=i){
//                int temp = numbers[i];
//                numbers[i] = numbers[minIndex];
//                numbers[minIndex] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//
//    }
public static void main(String[] args) {
    int[] numbers = {64, 25, 12, 22, 11};

    for(int i =0;i<numbers.length-1;i++){
        int minIndex = i;
        for(int j=i+1;j<numbers.length;j++){
            if(numbers[j]<numbers[minIndex]){
                minIndex = j;
            }
           }
        if(minIndex!=i){
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }
    System.out.println(Arrays.toString(numbers));
}
}
