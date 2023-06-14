public class Assessment_Four {
    /**Question: Writing a well-documented code creates a function that calculates simple
     interest.

     Answer: To calculate simple interest, Multiply principal amount by interest rate and time period then divide by 100.
     Where:

     Parameter Principal: The initial amount of money or the principal sum.
     Parameter Rate: The interest rate per period (typically per year).
     Parameter Time: The time period for which the interest is calculated, usually in years.
     Parameter SI: (Principal × Rate × Time) / 100
     * */

    public static void main(String[] args) {
        Assessment_Four cal = new Assessment_Four();

        double principle_amount=10.0;
        double interest_rate=2.0;
        double time_period=3;

        double Simple_Interest= cal.Calculate_SI(principle_amount,interest_rate,time_period);

        System.out.println("Principal Amount: "+principle_amount+",\nInterest Rate: "+interest_rate+"%,\nTime Period: "+time_period+"\nSimple Interest: "+ Simple_Interest);
    }

    public double Calculate_SI(double principal, double rate, double time){

        //Throws an Illegal argument exception if any of the argument is less that 0
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Principal, rate, and time must be non-negative.");
        }

        //Calculates the simple interest
        double SI= (principal * rate * time) / 100;

        return SI;
    }
}
