package ArrayManipulations;

/**
 * Find Peak Element
 * Problem: තමාගේ දෙපැත්තේම තියෙන අගයන් දෙකටම වඩා විශාල Peak Element එකක් සොයන්න.
 * Input: [1, 3, 20, 4, 1] | Output: 20
 * Logic: arr[i] >= arr[i-1] සහ arr[i] >= arr[i+1] පරීක්ෂා කරයි.
 */
public class FindPeakElement {
    public static void main(String[] args) {
        int [] arr = {1, 3, 20, 4, 1};
        int low = 0;
        int high = arr.length-1;

      while(low<high){
          int mid = low+high/2;
          if(arr[mid]<arr[mid+1]){
              low = mid+1;
          }else {
              high = mid;
          }
      }
        System.out.println("Peak Element :"+arr[low]);



    }
}
