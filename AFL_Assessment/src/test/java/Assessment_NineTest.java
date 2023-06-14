import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assessment_NineTest {

    @Test
    public void lowercaseTo_uppercase(){
        //validate that all lowercase are converted to upppercase
        Assessment_Nine assement= new Assessment_Nine();

        String word= "9japay";
        String expected_result= "9JAPAY";

        String actual_result= assement.convertToUpperCase(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void uppercaseTo_uppercase(){
        //Validate that uppercases still remains uppercase
        Assessment_Nine assement= new Assessment_Nine();

        String word= "9JAPAY";
        String expected_result= "9JAPAY";

        String actual_result= assement.convertToUpperCase(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void only_LowercaseAreConverted(){
        //Validate that only the lowercases in the word are converted to uppercase
        Assessment_Nine assement= new Assessment_Nine();

        String word= "9JApay";
        String expected_result= "9JAPAY";

        String actual_result= assement.convertToUpperCase(word);
        assertEquals(expected_result,actual_result);
    }


    @Test
    public void NotAffectedbyIntegers(){
        //Validate that integers and special characters are not affected
        Assessment_Nine assement= new Assessment_Nine();

        String word= "In the early 90's, things weren't this bad!!!@";
        String expected_result= "IN THE EARLY 90'S, THINGS WEREN'T THIS BAD!!!@";

        String actual_result= assement.convertToUpperCase(word);
        assertEquals(expected_result,actual_result);
    }

}