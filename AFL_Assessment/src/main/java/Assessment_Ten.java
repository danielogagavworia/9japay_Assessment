public class Assessment_Ten {
    /**Create a function that converts any string value to a sentence case, then write a
     unit test that checks the function's correctness.
     * */

    public static void main(String[]args){

        String word= "in the early 90's, thINGs weren't this bad!!!@";
        String result=convertToSentenceCase(word);
        System.out.println(result);
    }

    public static String convertToSentenceCase(String word) {
        //Convert the string to lowercase first
        String new_word=word.toLowerCase();

        // Convert the first char in the string to upper case then concatenate it to the rest of the string/sentence
        String firstCharUppercase = Character.toUpperCase(new_word.charAt(0)) + new_word.substring(1);
        return firstCharUppercase;
    }

}
