package teme;

import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    int scor = 0;
    String raspuns1 ="c";
    String raspuns2 ="a";
    String raspuns3 ="d";
    String raspuns;
    public void joc () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1: Cate picioare are vaca?");
        System.out.println("a: 15                 b: 3");
        System.out.println("c: 4                  d: 0");
        System.out.println("Raspuns: ");
        raspuns = scanner.nextLine();
        System.out.println("-----------------------------------");
        if (Objects.equals(raspuns, raspuns1)) {
            scor = scor + 1;
        }
        System.out.println("Q2: Ce se poarta pe cap?");
        System.out.println("a: Palarie            b: Soseta");
        System.out.println("c: Manusa             d: Oala");
        System.out.println("Raspuns: ");
        raspuns = scanner.nextLine();
        System.out.println("-----------------------------------");
        if (Objects.equals(raspuns, raspuns2)) {
            scor = scor + 1;
        }
        System.out.println("Q3: Omul este ...");
        System.out.println("a: Obiect             b: Reptila");
        System.out.println("c: Extraterestru      d: Mamifer");
        System.out.println("Raspuns: ");
        raspuns = scanner.nextLine();
        System.out.println("-----------------------------------");
        if (Objects.equals(raspuns, raspuns3)) {
            scor = scor + 1;
        }
        System.out.println("Scorul tau este: "+ scor);
        System.out.println();
    }
}
