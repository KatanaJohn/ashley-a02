public class currencyConversion {

    double rate = 0;

    public double conversion(double c_from, double c_to)
    {
        rate = Math.ceil(c_to * c_from * 100) / 100;
        //rate = Math.round(rate * 100.0 / 100.0);
        return rate;
    }

}
