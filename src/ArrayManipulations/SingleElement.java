package ArrayManipulations;

/**
 * Problem: Array එකේ හැම අංකයක්ම දෙපාරක් එද්දී,
 * එක් පාරක් විතරක් එන එකම අංකය හොයන්න.
 * Input: [4, 1, 2, 1, 2] |
 * Output: 4Logic: Bitwise XOR (^) පාවිච්චි කරයි.
 * සමාන අංක දෙකක් XOR කළ විට 0 වේ
 */

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int result =0;

        for(int num :nums){
            result ^= num;
        }
        System.out.println(result);

    }
}
