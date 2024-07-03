package teme;

public class Factorial {
    public int calcFactorial (int number) {
        int result = number;
        for (int i=2; i<number; i++) {
            result = result * i;
        }
        return result;
    }
}
