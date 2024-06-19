package teme;

import java.util.Scanner;

public class NumereIntregi  {
    Scanner scanner = new Scanner(System.in);

    public void oddEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int a = scanner.nextInt();
        if ((a%2) == 0) {
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }
    }
    public void pnz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Numarul este zero");
        }
        else if (a < 0) {
            System.out.println("Numarul este negativ");
        }
        else System.out.println("Numarul este pozitiv positive");
    }
}
