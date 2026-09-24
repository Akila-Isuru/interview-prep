package ArrayManipulations;

public class FourthLargest {
    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 16};
        int largest = 0;
        int secondLargest =0;
        int thirdLargest =0;
        int fourthLargest =0;

        for(int num : arr){
            if(num>largest){
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num>thirdLargest && thirdLargest !=largest) {
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = num;


            } else if (num>secondLargest && secondLargest != largest) {
                fourthLargest = thirdLargest;
                thirdLargest = secondLargest;
                secondLargest = num;

            } else if (num>thirdLargest && thirdLargest != largest) {
                fourthLargest = thirdLargest;
                thirdLargest= num;

            } else if (num>fourthLargest && num!=largest ) {
                fourthLargest= num;

            }
        }
        System.out.println("Fourth Largest : "+fourthLargest);
        System.out.println("Third Largest : "+thirdLargest);
        System.out.println("Second Largest : "+secondLargest);
        System.out.println("Largest : "+largest);

    }
}
