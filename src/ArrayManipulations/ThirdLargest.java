package ArrayManipulations;

/**
 * Find Third Largest Element
 * Problem: Array එකක 3 වෙනියට ලොකුම අංකය single pass එකකින් සොයන්න.
 * Input: [12, 13, 1, 10, 34, 16] | Output: 13
 * Logic: first, second, third ලෙස Variables 3ක් තබාගෙන Update කරයි.
 */

public class ThirdLargest {
    public static void main(String[] args) {

        int arr[] = {12, 13, 1, 10, 34, 16};
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                thirdLargest= secondLargest;
                secondLargest = largest;
                largest = arr[i];

                // 2. first ට වඩා කුඩා, නමුත් second ට වඩා විශාල නම්
            }else if(arr[i]>secondLargest && secondLargest!= largest){
                thirdLargest= secondLargest;
                secondLargest = arr[i];

                // 3. second ට වඩා කුඩා, නමුත් third ට වඩා විශාල නම්
            } else if (arr[i]>thirdLargest && arr[i]!=largest) {
                thirdLargest= arr[i];

            }
        }
        System.out.println("Third Largest : "+thirdLargest);

    }
}
