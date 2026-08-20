//Netflix App එකේ User කෙනෙක් අන්තිම දවස් ටිකේ බලපු පැය ගණන (Watch Time in hours) array එකක තියෙනවා:
//int[] watchTime = {1, 3, 2, 5, 4, 1};
//අපිට ඕන ඕනෑම ළඟ ළඟ තියෙන දවස් 3ක (k = 3) බලපු වැඩිම පැය ගණන (Max Watch Time) හොයන්න.

public class NetflixApp {
    public static void main(String[] args) {
        int[] watchTime = {1, 3, 2, 5, 4, 1};
        int k =3;

        int windowSum =0;
        int maxWatchTime = 0;

        for(int i =0;i<k;i++){
            windowSum +=watchTime[i];
        }
        maxWatchTime = windowSum;

        for(int i =k;i< watchTime.length;i++){
            windowSum +=watchTime[i] - watchTime[i-k];

            if(windowSum>maxWatchTime){
                maxWatchTime = windowSum;
            }
        }
        System.out.println("maxWatchTime:"+maxWatchTime);

    }
}
