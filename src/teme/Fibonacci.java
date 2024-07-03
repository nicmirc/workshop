package teme;

public class Fibonacci {
    public void sequence (int number) {
        System.out.print("Fibonacci sequence: 0");
        if (number != 0) {
            int previous=0;
            int current=1;
            int a;
            while (current <= number) {
                System.out.print(", " + current);
                a = current;
                current = current + previous;
                previous = a;
            }
        }
        System.out.println();
    }
}
