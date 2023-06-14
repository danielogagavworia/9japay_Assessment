import java.util.LinkedHashSet;

public class Assessment_Six {
    /**Write a function that removes repeated characters from a string
     * */

    public static void main(String[]args){

        String word= "Concatenate";
        removeRepeatedStr(word);
    }

    public static void removeRepeatedStr(String word) {
        // Convert the string to lower case
        String lowercaseStr = word.toLowerCase();

        //Created LinkedHashSet of type character. It doesn't accept  duplicate characters
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        //Add each character of the string into LinkedHashSet
        for (int i = 0; i < word.length(); i++) {
            set.add(lowercaseStr.charAt(i));
        }


        StringBuilder build_word = new StringBuilder();
        String new_word = null;
        for (Character ch : set) {

            build_word.append(ch);
            new_word = build_word.toString();
        }

        //Converts the first letter back to uppercase and concatenate it back to the rest of the string
        String firstCharUppercase = Character.toUpperCase(new_word.charAt(0)) + new_word.substring(1);
        System.out.println(firstCharUppercase);
    }
}
