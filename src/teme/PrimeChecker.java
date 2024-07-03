package teme;

public class PrimeChecker {
    public boolean checker (int number) {
        boolean prime = true;
        for (int i=2; i<=number/2; i++) {
            if (number%i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
