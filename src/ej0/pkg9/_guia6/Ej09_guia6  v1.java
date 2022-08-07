
package ej0.pkg9._guia6;

import java.util.Scanner;

public class Ej09_guia6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int num;
        do {
            System.out.print("Ingrese el numero entero positivo a sumar (Ingrese"
                    + " 0 para finalizar la suma): ");
            num = leer.nextInt();

            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                break;
            } else {

            }
        } while (num != 0);

        System.out.println("La suma de los numeros ingresados da " + suma);
    }

}
