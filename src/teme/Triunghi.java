package teme;

import java.util.Scanner;

public class Triunghi {
    Scanner scanner = new Scanner(System.in);
    double baza;
    double inaltime;

    public void setBaza (double b){
        if (b > 0) {
            baza = b;
        }
        else {
            do {
                System.out.println("Introduceti inaltimea triunghiului mai mare decat 0:");
                b = scanner.nextDouble();
            } while (b <= 0);
            baza = b;
        }
    }
    public void setInaltimea (double h){
        if (h > 0) {
            inaltime = h;
        }
        else {
            do {
                System.out.println("Introduceti inaltimea triunghiului mai mare decat 0:");
                h = scanner.nextDouble();
            } while (h <= 0);
            inaltime = h;
        }
    }
    public void aria() {
        double aria = baza*inaltime*0.5;
        System.out.println("Aria triunghiului este: " + aria);
    }
}
