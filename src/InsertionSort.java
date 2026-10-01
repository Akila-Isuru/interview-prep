import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] arr = {12, 11, 13, 5, 6};

        if(arr== null ||arr.length<=0){
            return;
        }

        // Index 1 සිට අන්තිම Element එක දක්වා යයි
        int n = arr.length;

        for(int i =0;i<n;i++){
            int key = arr[i];  // Insert කිරීමට අවශ්‍ය Element එක
            int j = i-1;  // Sorted කොටසේ අන්තිම Element එකේ Index එක

            /*
             * key එකට වඩා විශාල අගයන් එක ස්ථානයක් දකුණට Shift කරයි.
             * (Swap කරනවාට වඩා Shift කිරීම Performance අතින් ඉතා කාර්යක්ෂමයි)
             */

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];  // Element එක දකුණට Shift කිරීම
                j--;     // වම් පස ඇති ඊළඟ Element එකට යෑම
            }
            // නිවැරදි ස්ථානයට key එක Insert කිරීම
            arr[j+1] = key;
        }
        System.out.println("Array after Insertion Sort :"+ Arrays.toString(arr));


    }
}


