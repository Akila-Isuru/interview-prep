package StringManipulation;

//Check Anagrams (ඇනග්‍රෑම් පරීක්ෂාව):
//වචන දෙකක තියෙන්නේ එකම අකුරු ටිකද කියලා බලන්න. (උදා: "listen" සහ "silent" කියන්නේ Anagrams).
public class CheckAnagrams {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";
        String [] str1 =  word1.split("");
        String [] str2 =  word2.split("");

        if(str1.length != str2.length){
            System.out.println("Not anagram");
            return;
        }

        boolean isAnagram =true;

        for(int i =0;i<str1.length;i++){
            boolean found = false;

            for(int j =0;j<str2.length;j++){
                if(str1[i].equals(str2[j])){
                    found = true;
                    str2[j]=" ";
                    break;
                }
            }
            if(!found){
                isAnagram = false;
                break;
            }

        }

        if(isAnagram){
            System.out.println("Anagram");
        }else {
            System.out.println("Not anagram");
        }
    }
}
