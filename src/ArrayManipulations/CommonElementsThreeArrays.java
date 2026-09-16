package ArrayManipulations;

/**
 * Common Elements in 3 Sorted Arrays
 * Problem: Sort කර ඇති Arrays 3කම පොදුවේ තියෙන Elements සොයන්න.
 * Input: [1, 5, 10], [2, 5, 10], [3, 5, 10] | Output: 5 10
 * Logic: Pointers 3ක් පාවිච්චි කර තනියම Increment කරයි.
 */
public class CommonElementsThreeArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 5, 10};
        int [] arr2 = {2, 5, 10};
        int [] arr3 = {3, 5, 10};
        int i =0,j=0,k=0;

        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j]&& arr2[j]==arr3[k]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
                k++;
            } else if (arr1[i]<arr2[j]) {
                i++;

            }else if (arr2[j]<arr3[k]) {
                j++;

            }else {
                k++;
            }
        }
    }
}
