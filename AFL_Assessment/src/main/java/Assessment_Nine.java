import java.util.LinkedHashSet;

public class Assessment_Nine {
    /**create a function that converts any string value to upper case. Then write a unit
     test that checks the function's correctness.
     * */

    public static void main(String[]args){

        String word= "In the early 90's, things weren't this bad!!!@";
        String result=convertToUpperCase(word);
        System.out.println(result);
    }

    public static String convertToUpperCase(String word) {
        // Convert the string to Upper case
        String uppercaseStr = word.toUpperCase();
        return uppercaseStr;
    }

}
