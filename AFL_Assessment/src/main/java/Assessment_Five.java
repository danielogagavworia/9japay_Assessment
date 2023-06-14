public class Assessment_Five {

    public static void main(String[] args) {
        String input = "Madam";
        palindrome(input);
    }

    public static String palindrome(String input) {
        //Converts the input to lower case first
        String lowercaseStr = input.toLowerCase();

        //Instantiate the string builder
        StringBuilder reversedString = new StringBuilder(lowercaseStr);

        //Reverses the lowercaseStr to read from behind
        reversedString.reverse();

        //Converts into a string and saves in a variable
        String Reversed= reversedString.toString();

        //Checks if both strings are equal
        if(lowercaseStr.equals(Reversed)){
            System.out.println("The Word: '"+input+"' is a palindrome.");
        }
        else {
            System.out.println("The Word: '"+input+"' is not a palindrome.");
        }
        return Reversed;
    }
}
