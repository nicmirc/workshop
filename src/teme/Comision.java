package teme;

import java.util.Scanner;

public class Comision {
    public void calcComision () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti totalul vanzarilor: ");
        double vanzari = scanner.nextDouble();
        System.out.println("Introduceti cuantumul comisionului in procente: ");
        double procent = scanner.nextDouble();
        System.out.println("Valoarea comisionului este: " + vanzari*procent/100);
        System.out.println();
    }
}
