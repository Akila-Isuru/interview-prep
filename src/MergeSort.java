public class MergeSort {

//    public static void mergeSort(int[] arr){
//        int mid = arr.length/2;
//
//        if (arr.length < 2) {
//            return;
//        }
//        int[] leftArray = new int [mid];
//        int[] rightArray = new int [arr.length-mid];
//
//        for(int i =0;i<mid;i++){
//            leftArray[i] = arr[i];
//        }
//        for(int i = mid;i<arr.length;i++){
//            rightArray[i-mid] = arr[i];
//        }
//        mergeSort(leftArray);
//        mergeSort(rightArray);
//
//        merge(arr,leftArray,rightArray);
//    }
//
//    public static void merge(int[] arr,int[] leftArray,int[] rightArray){
//        int i=0;
//        int j=0;
//        int k=0;
//
//        int leftArrayLength = leftArray.length;
//        int rightArrayLength = rightArray.length;
//
//        while(i<leftArrayLength && j< rightArrayLength){
//            if(leftArray[i]<=rightArray[j]){
//                arr[k] = leftArray[i];
//                i++;
//            }else {
//                arr[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//        while(j<rightArrayLength){
//            arr[k] = rightArray[j];
//            j++;
//            k++;
//        }
//    }

    public static void mergeSort(int[] arr) {
        int mid= arr.length/2;

        if(arr.length<2){
            return;
        }
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length-mid];

        for(int i =0;i<mid;i++){
            leftArray[i]=arr[i];
        }
        for(int i =mid;i<arr.length;i++){
            rightArray[i-mid]=arr[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

       merge(arr,leftArray,rightArray);
    }

    public static void merge(int[] arr,int[] leftArray,int[] rightArray){

        int leftArraySize =  leftArray.length;
        int rightArraySize = rightArray.length;

        int i =0;
        int j =0;
        int k =0;

        while(i<leftArraySize && j<rightArraySize){
            if(leftArray[i]<=rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<leftArraySize){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<rightArraySize){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {

        int [] numbers = {38,27,43,3};

        System.out.println("Before Sort :");
        for(int num : numbers){
            System.out.print(num+",");
        }

        mergeSort(numbers);

        System.out.println("\nAfter Sort :");
        for(int num : numbers){
            System.out.print(num+",");
        }



    }
}
