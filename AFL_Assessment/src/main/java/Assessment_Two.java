public class Assessment_Two {
    /**
     * Question: Create a function that calculates the power of a number. Then write a unit test to
     * check the correctness of the function.
     *
     * The Unit test can be found under src/test/java/Assessment_TwoTest
     */
    public static void main(String[] args) {
        double exp= 2;
        double base= 5;

        double result= power_Caculation(base,exp);
        System.out.println(base+"^"+exp+" = "+result);
    }


    //Function that calculates the power of a number
    public static double power_Caculation(double base, double exp){
        //Calculates the power of number and then returns the result
        double result= Math.pow(base,exp);
        return result;
        }
}


