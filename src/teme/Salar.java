package teme;

import java.util.Scanner;

public class Salar {
    double totalOre;
    double tarifOrar;
    public void setTotalOre (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti totalul de ore: ");
        totalOre = scanner.nextDouble();
    }
    public void setTarifOrar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti tariful orar: ");
        tarifOrar = scanner.nextDouble();
    }
    public double plataOreNormale () {
        if (totalOre >= 40) {
            return 40*tarifOrar;
        }
        else return  totalOre*tarifOrar;
    }
    public double plataOreSuplimentare () {
        if (totalOre > 40) {
            return ((totalOre-40)*(tarifOrar*1.5));
        }
        else return 0;
    }
}
