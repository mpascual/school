public class Calc_Int {
    public static void main(String args[]) {
        // these are the variables
        double principal;
        double rate;
        float time;
        double amount;

        // now let's assign starting values to the variables
        principal=55000.00;
        rate=.0565;
        time=2.5F;

        // now let's calculate the amount of interest generated
        amount=principal * rate * time;

        //let's output the final amount
        System.out.print(" with the amount of" + principal );
        System.out.print(" dollars placed in the bank for "+time);
        System.out.print(" years at a rate of "+rate);
        System.out.println(" percent, the total valus is " + amount);
    }
}

