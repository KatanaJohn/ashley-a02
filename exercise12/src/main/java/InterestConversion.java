public class InterestConversion {


    double total;

    public double calculation(int principal, double interest, int years)
    {
        interest = interest / 100.0;
        total = Math.ceil(principal * (1+ interest * years) * 100) / 100;

        return total;
    }

}
