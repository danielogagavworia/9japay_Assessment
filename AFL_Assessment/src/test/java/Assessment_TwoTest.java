import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assessment_TwoTest {
    /**
     * Question: Create a function that calculates the power of a number. Then write a unit test to
     * check the correctness of the function.
     *
     * The function implemented can be found at src/main/java/Assessment_Two
     */
    @Test
    public void exponentialZeroIs_eql2_one(){
        //Valdating that any number raised to zero is always equal to one
        Assessment_Two assement= new Assessment_Two();

        double exp=0;
        double base=2;
        double expected_result= 1.0;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void fraction_exponenetial(){
        //Validating the result of a fractioned exponential and an integer base
        Assessment_Two assement= new Assessment_Two();

        double exp=0.5;
        double base=25;
        double expected_result= 5.0;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void integer_exponenetial(){
        //Validating the result of an integer exponential and an integer base
        Assessment_Two assement= new Assessment_Two();

        double exp=3;
        double base=5;
        double expected_result= 125.0;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void base_zero(){
        //Validating that the power of zero is zero
        Assessment_Two assement= new Assessment_Two();

        double exp=3;
        double base=0;
        double expected_result= 0.0;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void fracture_base(){
        //Validating the result of a fractured base and an integer exponential
        Assessment_Two assement= new Assessment_Two();

        double exp=4;
        double base=2.5;
        double expected_result= 39.0625;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }

    @Test
    public void fracture_base_and_exponetial(){
        //Validating the result of a fracture base and a fracture exponential
        Assessment_Two assement= new Assessment_Two();

        double exp=2.3;
        double base=2.5;
        double expected_result= 8.227388777088983;

        double actual_result= assement.power_Caculation(base,exp);
        assertEquals(expected_result,actual_result);
    }
}