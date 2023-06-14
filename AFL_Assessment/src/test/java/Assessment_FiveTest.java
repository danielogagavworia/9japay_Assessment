import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assessment_FiveTest {

    @Test
    public void palindrome_Test1(){
        //Validate that the word racecar is a palindrome
        Assessment_Five assement= new Assessment_Five();

        String word="Racecar";
        String expected_result= "racecar";

        String actual_result= assement.palindrome(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void palindrome_Test2(){
        //Validate that the word hello is not a palindrome
        Assessment_Five assement= new Assessment_Five();

        String word="hello";
        String expected_result= "hello";

        String actual_result= assement.palindrome(word);
        assertNotEquals(expected_result,actual_result);
    }

    @Test
    public void palindrome_Test3(){
        //Validate that the function is not case sensitive
        Assessment_Five assement= new Assessment_Five();

        String word="LEVEL";
        String expected_result= "level";

        String actual_result= assement.palindrome(word);
        assertEquals(expected_result,actual_result);
    }

}