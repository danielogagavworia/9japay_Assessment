import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assessment_TenTest {

    @Test
    public void To_SentenceCase(){
        //validate that the first character in string/sentence is converted to upper case
        Assessment_Ten assement= new Assessment_Ten();

        String word= "autority";
        String expected_result= "Autority";

        String actual_result= assement.convertToSentenceCase(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void To_SentenceCase_Test2(){
        //validate that the uppercase characters not in the beginning of the string are converted to lowercase
        Assessment_Ten assement= new Assessment_Ten();

        String word= "autoRITy";
        String expected_result= "Autority";

        String actual_result= assement.convertToSentenceCase(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void To_SentenceCase_Test3(){
        //validate that the string/sentences that begin with special characters are not affected and the next character is still in lowercase
        Assessment_Ten assement= new Assessment_Ten();

        String word= "9jaPay are The Best";
        String expected_result= "9japay are the best";

        String actual_result= assement.convertToSentenceCase(word);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void To_SentenceCase_Test4(){
        //Validate that the sentence/string beginning with an uppercase is unaffected
        Assessment_Ten assement= new Assessment_Ten();

        String word= "JaPay are The Best";
        String expected_result= "Japay are the best";

        String actual_result= assement.convertToSentenceCase(word);
        assertEquals(expected_result,actual_result);
    }

}