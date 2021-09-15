public class InterestConversion {


    double compoundedInterest = 0;

    public double calculation(int principal, double rate, int years, int timesCompounded)
    {
        rate = rate / 100.0;
        double exponent = Math.pow(1+(rate / timesCompounded), (timesCompounded * years));
        compoundedInterest =  Math.ceil(principal * exponent * 100) / 100.0;
        return compoundedInterest;
    }
}
