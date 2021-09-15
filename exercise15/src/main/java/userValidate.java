public class userValidate {

    String correctPassword = "abc$123";


    public void passwordCheck(String password)
    {
        if(password.equals(correctPassword))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you");
        }
    }

}
