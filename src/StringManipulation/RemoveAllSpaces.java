package StringManipulation;

//Remove All Spaces (හිස්තැන් ඉවත් කිරීම):
//වාක්‍යයක තියෙන හැම Space එකක්ම අයින් කරලා එක දිගට ලියන්න.
//        (උදා: "java intern interview" -> "javainterninterview"). (replace() නැතුව ලොජික් එකෙන් කරන්න).
public class RemoveAllSpaces {
    public static void main(String[] args) {
        String word = "java intern interview";
        String result = "";

        int n = word.length();

        for(int i =0;i<n;i++){
            if (word.charAt(i) != ' ') {
                 result += "" +word.charAt(i);
            }
        }
        System.out.println(word);
        System.out.println(result);

    }
}
