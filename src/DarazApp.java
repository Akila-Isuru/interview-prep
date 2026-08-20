//Daraz එකේ Item වල ගණන් අඩු අගයේ සිට වැඩි අගයට Sort කරලා තියෙනවා:
//int[] prices = {10, 20, 35, 50, 75, 90};
//කෙනෙක් ළඟ Rs. 85 ක Gift Voucher එකක් තියෙනවා (target = 85).
//මෙයාට මේ Voucher එකෙන්ම Items 2ක් ගන්න ඕනේ (ඉතිරි නැතිවම Voucher එක සම්පූර්ණයෙන්ම පාවිච්චි වෙන්න ඕනේ).

public class DarazApp {
    public static void main(String[] args) {
        int[] prices = {10, 20, 35, 50, 75, 90};
        int target =85;

        int left =0;
        int right = prices.length-1;
        boolean isFound = false;

        while(left<right){
            if(prices[left]+prices[right]==target){
                System.out.println("Items found: Rs." + prices[left] + " and Rs." + prices[right]);
                isFound=true;
                break;
            }else if(prices[left]+prices[right]>target){
                right--;
            }else {
                left++;
            }
        }

        if(!isFound){
            System.out.println("Items not found");
        }
    }
}
