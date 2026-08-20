import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String input = "akila";

        String [] word = input.split("");
        System.out.println(Arrays.toString(word));

        int mid = word.length/2;
        boolean isPalindrome = false;

        for(int i =0;i<=mid;i++){
            if(word[i].equals(word[word.length-1-i])){
                isPalindrome = true;
            }else {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("palindrome");
        }else  {
            System.out.println("not palindrome");
        }


    }
}
