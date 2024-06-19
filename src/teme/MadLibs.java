package teme;

import java.util.Scanner;

public class MadLibs {
    public void joc () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un adjectiv: ");
        String adj1 = scanner.nextLine();
        System.out.println("Introduceti o locatie: ");
        String loc1 = scanner.nextLine();
        System.out.println("Introduceti un adjectiv: ");
        String adj2 = scanner.nextLine();
        System.out.println("Introduceti un adjectiv: ");
        String adj3 = scanner.nextLine();
        System.out.println("Introduceti o piesa de imbracaminte: ");
        String haina = scanner.nextLine();
        System.out.println("Introduceti o parte a corpului: ");
        String corp1 = scanner.nextLine();
        System.out.println("Introduceti o parte a corpului: ");
        String corp2 = scanner.nextLine();
        System.out.println("Introduceti o parte a corpului: ");
        String corp3 = scanner.nextLine();
        System.out.println("Introduceti un adjectiv: ");
        String adj4 = scanner.nextLine();
        System.out.println("Introduceti un substantiv: ");
        String sub1 = scanner.nextLine();
        System.out.println("Introduceti un substantiv: ");
        String sub2 = scanner.nextLine();
        System.out.println("Apasa enter pentru a genera textul");
        scanner.nextLine();
        System.out.println("Ar trebui sa mergi in fiecare an la un consult medical. E -" + adj1 +"-. De obicei nu mai ajungi la -" + loc1 + "- din cauza asta.");
        System.out.println("In general ai parte de un docetor -" + adj2 + "- si care poarta -" + haina + "-.");
        System.out.println("O sa ti se uite la -" + corp1 + "-. -" + corp2 + "- si -" + corp3 + "-. Cateodata doctorul poate fi foarte -" + adj4 + "-.");
        System.out.println("Dupa consult, doctorul o sa iti dea cadou un/o -" + sub1 + "- si un/o -" + sub2 + "-.");
        System.out.println();
    }
}
