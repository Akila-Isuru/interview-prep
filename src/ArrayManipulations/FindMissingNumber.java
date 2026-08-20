package ArrayManipulations;

//1 සිට $N$ දක්වා අංක තියෙන්න ඕන Array එකක එක අංකයක් විතරක් අඩුවෙලා තියෙනවා.
//Input: int[] arr = {1, 2, 4, 5, 6}; (මෙතන අංක 6ක් තියෙන්න ඕනේ, ඒත් 5යි තියෙන්නේ)
//Expected Output: 3

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length+1;
        int expectedTotal = n *(n+1)/2;

        int getTotal =0;

        for(int num : arr){
            getTotal+=num;
        }
        System.out.println(getTotal);
        int missingNumber = expectedTotal-getTotal;
        System.out.println("Missing Number: "+missingNumber);
    }
}
