//public class Tests {
//    public static void main(String[] args) {
//        String s = "swiss";
//
//        for (int i = 0; i < s.length(); i++) {
//            boolean isRepeating = false;
//
//            for (int j = 0; j < s.length(); j++) {
//                // i != j කරන්නේ තමන්ගේම Index එක එක්ක Compare වෙන එක නවත්තන්න
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    isRepeating = true;
//                    break; // Repeat වෙනවා නම් මේ අකුර අතහැර inner loop එකෙන් එලියට
//                }
//            }
//
//            // Repeat වුණේ නැත්නම් ඒක තමයි පළමු අකුර!
//            if (!isRepeating) {
//                System.out.println("First Non-Repeating Character: " + s.charAt(i));
//                break; // Outer loop එකත් නවත්වනවා
//            }
//        }
//    }
//}

class Tests{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(Integer.toHexString(System.identityHashCode(s1)));
        System.out.println(Integer.toHexString(System.identityHashCode(s2)));
    }
}