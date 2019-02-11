package adivina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int adivinar = (int) Math.floor(Math.random() * (1 - (500 + 1)) + (500));
        int intentos = 0;
        int numUser = 0;
        boolean error = false;

        System.out.println("Intenta adivinar el numero, introduce uno.");
        System.out.println(adivinar);

        do {
            intentos++;
            try {
                Scanner sc = new Scanner(System.in);
                numUser = sc.nextInt();

            } catch (InputMismatchException ex) {
                System.out.println("Error, numero no entero.");
                error = true;
            }

            if (error == false) {

                if (numUser < adivinar) {
                    System.out.println("El numero a adivinar es mas alto.");
                } else {
                    System.out.println("El numero a adivinar es mas bajo.");
                }
            }

        } while (numUser != adivinar || error == true);

        System.out.println("Numero de intentos: " + intentos);

    }

}
