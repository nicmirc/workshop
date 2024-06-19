package teme;

import java.util.Scanner;

public class An {
    Scanner scanner = new Scanner(System.in);

    public void anBisect() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti anul: ");
        int an = scanner.nextInt();
        if ((an % 4) == 0) {
            System.out.println("Anul este bisect");
        }
        else System.out.println("Anul nu este bisect");
    }
}
