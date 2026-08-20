package ArrayManipulations;

//Find the Second Largest:
//Array එකේ තියෙන දෙවෙනියට ලොකුම අංකය හොයන්න (Arrays.sort() නැතුව). (For Loop, Multiple If conditions)
public class FindtheSecondLargest {
    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest =0;
        int secondLargest =0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest : "+secondLargest);


    }
}
