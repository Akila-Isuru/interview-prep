package ArrayManipulations;
//
//Find Maximum and Minimum:
//Array එකක තියෙන ලොකුම අංකය සහ කුඩාම අංකය හොයන්න. (Arrays.sort() පාවිච්චි කරන්නේ නැතුව). (For Loop, If)
public class FindMaximumandMinimum {
    public static void main(String[] args) {
        int [] arr = {12,45,76,1,8};

        int max =arr[0];
        int min = arr[0];

//        for(int i =0;i<arr.length;i++){
//            if(arr[i]>max){
//                max= arr[i];
//            }else if(arr[i]<min){
//                min= arr[i];
//            }
//        }
//        System.out.println("Maximum is "+max);
//        System.out.println("Minimum is "+min);

        for(int num:arr){
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);

    }
}
