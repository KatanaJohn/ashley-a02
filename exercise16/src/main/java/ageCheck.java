public class ageCheck {

    public void check(int age)
    {
        String result = (age >= 16) ? "are" : "are not";

        System.out.printf("You %s old enough to legally drive.", result);
    }
}
