package teme;

public class DigitsSum {
    public int calcSum (int number) {
        int sum = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number/10;
        }
        return sum;
    }
}
