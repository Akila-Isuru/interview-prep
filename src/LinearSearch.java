public class LinearSearch {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        int target=40;


            for(int j = 0; j < numbers.length-1; j++){
                if(numbers[j]==target){
                    System.out.println(j);
                    break;

            }
        }
    }
}
