package teme;

public class MultiplicationTable {

    public void displayTable (int numar) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(numar + " * " + i + " = " + (numar*i) + ";");
        }
    }
}
