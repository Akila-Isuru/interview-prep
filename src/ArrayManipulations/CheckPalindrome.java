package ArrayManipulations;
//
//Check Palindrome:
//වචනයක් මුල ඉඳන් කියෙව්වත්, අග ඉඳන් කියෙව්වත් සමානද බලන්න (උදා: "madam" හෝ "racecar"). (For/While Loop, If)


public class CheckPalindrome {
//    public static void main(String[] args) {
//        String message = "yoow";
//
//        int left = 0;
//        int right = message.length()-1;
//         boolean isPalindrome = false;
//
//        while(left<right){
//            if(message.charAt(left)==message.charAt(right)){
//                left++;
//                right--;
//                isPalindrome = true;
//            }else{
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if(isPalindrome){
//            System.out.println("Palindrome");
//        }else {
//            System.out.println("Not palindrome");
//        }
//
//
//    }

    public static void main(String[] args) {
        String word = "yoow";

        String [] arr = word.split("");
        int mid = arr.length/2;
        boolean ispalindrome = true;

        for(int i =0;i<=mid;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                ispalindrome = false;
                break;

            }
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
