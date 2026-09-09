package StringManipulation;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String word = "programming";
        int [] count = new int[256];

        for(int i =0;i<word.length();i++){
            count[word.charAt(i)]++;
        }
        for(int i =0;i<256;i++){
            if(count[i]>1){
                System.out.println((char)i+" ");
            }
        }
    }


}
