package StringManipulation;

//Remove a Specific Character (අකුරක් මකා දැමීම):
//String එකකින් 'a' කියන අකුර විතරක් අයින් කරලා අලුත් String එකක් හදන්න. (උදා: "banana" -> "bnn").

public class RemoveSpecificCharacter {
    public static void main(String[] args) {

        String word = "Banana";
        String result = "";

        for(int i =0;i<word.length();i++){
            if(word.charAt(i)!='a'){
                result += word.charAt(i);
            }
        }
        System.out.println(result);

    }
}
