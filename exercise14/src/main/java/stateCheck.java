public class stateCheck {


    public void wisconsinCheck(String state, double subtotal, double tax)
    {
        double total = subtotal;
        if(state.equals("WI"))
        {
            tax = subtotal * (tax / 100);
            total = subtotal + tax;
            total = Math.ceil(total *100)/100.0;
            System.out.printf("The subtotal is $%.2f\n", subtotal);
            System.out.printf("The tax is $%.2f\n", tax);

        }
        System.out.printf("The total is $%.2f\n", total);
    }


}
