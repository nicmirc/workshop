package teme;

import java.util.Scanner;

public class EvenOdd {
    Scanner scanner = new Scanner(System.in);
    public void evenOdd (){
        System.out.println("Insert numbers to evaluate (insert 0 to exit). ");
        int number;
        do {
            System.out.print("number = ");
            number = scanner.nextInt();
            if (number%2 == 0) {
                System.out.println("The number is even.");
            }
            else System.out.println("The number is odd.");
        }
        while (number != 0);
    }
}
