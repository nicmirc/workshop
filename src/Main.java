import teme.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-------Teme----------------");
            System.out.println("1 - Odd/Even");
            System.out.println("2 - Positive/Negative/Zero");
            System.out.println("3 - An bisect");
            System.out.println("4 - Aria triunghiului");
            System.out.println("5 - Convertor distanta");
            System.out.println("6 - Convertor temperatura");
            System.out.println("7 - Calculator comision");
            System.out.println("8 - Calculator salar");
            System.out.println("9 - Mad Libs");
            System.out.println("10 - Quiz");
            System.out.println("12 - Discount");

            System.out.println("0 - Exit");
            System.out.print("Alege tema: ");
            int tema = scanner.nextInt();
            System.out.println();

            if (tema == 1) {
                NumereIntregi nr = new NumereIntregi();
                nr.oddEven();
                System.out.println();
            }
            else if (tema == 2){
                NumereIntregi nr = new NumereIntregi();
                nr.pnz();
                System.out.println();
            }
            else if (tema == 3){
                An an = new An();
                an.anBisect();
                System.out.println();
            }
            else if (tema == 4){
                Triunghi triunghi = new Triunghi();
                System.out.println("Introduceti baza triunghiului");
                double b = scanner.nextDouble();
                triunghi.setBaza(b);
                System.out.println("Introduceti inaltimea triunghiului");
                double h = scanner.nextDouble();
                triunghi.setInaltimea(h);
                triunghi.aria();
                System.out.println();
            }
            else if (tema == 5) {
                Convertor convertor = new Convertor();
                System.out.println("Tip conversie:");
                System.out.println("1 - Km -> Mile");
                System.out.println("2 - Mile -> Km");
                System.out.println("Optiune (1/2): ");
                int optiune = scanner.nextInt();
                if (optiune == 1) {
                    System.out.println("Introduceti distanta in Km: ");
                    double d = scanner.nextDouble();
                    convertor.kmMile(d);
                }
                else if (optiune == 2) {
                    System.out.println("Introduceti distanta in Mile: ");
                    double d = scanner.nextDouble();
                    convertor.mileKm(d);
                    }
                else {
                    System.out.println("optiune gresita");
                }
                System.out.println();
            }
            else if (tema == 6) {
                Convertor convertor = new Convertor();
                System.out.println("Introduceti temperatura in grade Celsius: ");
                double t = scanner.nextDouble();
                System.out.println("Alegeti conversia:");
                System.out.println("1 - Celsius -> Fahrenheit");
                System.out.println("2 - Celsius -> Kelvin");
                System.out.println("Optiune (1/2): ");
                int optiune = scanner.nextInt();
                if (optiune == 1) {
                    convertor.cF(t);
                }
                else if (optiune == 2) {
                    convertor.cK(t);
                }
                else {
                    System.out.println("optiune gresita");
                }
                System.out.println();
            }
            else if (tema == 7) {
                Comision comision=new Comision();
                comision.calcComision();
            }
            else if (tema == 8) {
                Salar salar = new Salar();
                salar.setTarifOrar();
                salar.setTotalOre();
                System.out.println("Totalul de plata este: " + (salar.plataOreNormale()+salar.plataOreSuplimentare()));
                System.out.println();
            }
            else if (tema == 9) {
                MadLibs madLibs = new MadLibs();
                madLibs.joc();
            }
            else if (tema == 10) {
                Quiz quiz = new Quiz();
                quiz.joc();
            }
            else if (tema == 12) {
                DiscountCalculator discountCalculator = new DiscountCalculator();
                System.out.println("Introduceti pretul original: ");
                double pret = scanner.nextDouble();
                discountCalculator.setPret(pret);
                System.out.println("Introduceti discountul in procente: ");
                double discount = scanner.nextDouble();
                discountCalculator.setDiscount(discount);
                System.out.println("Pretul final este: " + discountCalculator.calcPretFinal());
                System.out.println();
            }
            else if (tema == 0) {
                System.out.println("Exiting..");
                break;
            }
            else {
                System.out.println("Tema inexistenta.");
                System.out.println();
            }
        } while (true);
    }
}