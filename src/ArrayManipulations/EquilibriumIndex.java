package ArrayManipulations;

/**
 * 1. Equilibrium Index යනු කුමක්ද?Array එකක යම් Index එකක් ගත් විට, එම Index එකට වම් පැත්තේ ඇති සියලුම අංකවල
 * එකතුව සහ දකුණු පැත්තේ ඇති සියලුම අංකවල එකතුව සමාන වේ නම්, එම Index එක Equilibrium Index එකක් ලෙස හැඳින්වේ.සැලකිය යුතුයි:
 * Equilibrium Index එකෙහි ඇති අංකය වම් පැත්තේ හෝ දකුණු පැත්තේ එකතුවට අයිති වන්නේ නැත.
 * 2. කේතයේ තර්කය (Logic Behind the Code)අපට මෙය ක්‍රම 2 කට කළ හැක:
 * සාමාන්‍ය ක්‍රමය (Brute Force): සෑම Index එකකටම වම් පැත්ත සහ දකුණු පැත්ත වෙන වෙනම Loop කර එකතු කිරීම ($O(N^2)$ කාලයක් යයි).
 * දක්ෂ ක්‍රමය (Optimized Approach - අපගේ කේතය):මුලින්ම Array එකේ සියලුම අංකවල එකතුව (totalSum) සොයා ගනී.
 * ඊට පසු Loop එකක් හරහා යන විට, දකුණු පැත්තේ එකතුව (rightSum) = totalSum - වත්මන් අගය - leftSum ලෙස ගණනය කරයි.
 * 3. Line-by-Line පැහැදිලි කිරීම int[] arr = {1, 3, 5, 2, 2};අපගේ පරීක්ෂණ Array එක නිර්මාණය කිරීම.
 * int totalSum = 0, leftSum = 0;Array එකේ මුළු එකතුව තබා ගැනීමට totalSum ද, වම් පැත්තේ එකතුව තබා ගැනීමට leftSum ද සාදා ගනී
 * (ආරම්භක අගය 0 වේ).for (int num : arr) totalSum += num;Array එකේ ඇති සියලුම අංක එකතු කරයි.
 * (මෙහිදී $1 + 3 + 5 + 2 + 2 = 13$ වේ. එනම් totalSum = 13).for (int i = 0; i < arr.length; i++)Index 0 සිට අවසානය
 * දක්වා එකින් එක පරික්ෂා කිරීමට Loop එක ආරම්භ කරයි.totalSum -= arr[i];වත්මන් අංකය මුළු එකතුවෙන් අඩු කරයි.
 * එවිට totalSum තුළ ඉතිරි වන්නේ දකුණු පැත්තේ අංකවල එකතුව (rightSum) ය.if (leftSum == totalSum)වම් පැත්තේ
 * එකතුව (leftSum) සහ දකුණු පැත්තේ එකතුව (totalSum) සමානදැයි බලයි.
 * සමාන නම් එය Equilibrium Index එකයි!leftSum += arr[i];ඊළඟ Index එකට යාමට පෙර,
 * වත්මන් අංකය leftSum එකට එකතු කරයි.
 */
public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};
        int totalSum =0;
        int leftSum=0;

        for(int num :arr){
            totalSum+=num;
        }

        for(int i =0;i<arr.length;i++){
            totalSum-=arr[i];
            if(leftSum==totalSum){
                System.out.println("Equilibrium Index is :"+i);
                return;
            }
            leftSum+=arr[i];
        }

    }
}
