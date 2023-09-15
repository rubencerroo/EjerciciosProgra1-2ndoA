package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Elija el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Elija el tercer numero: ");
        num3 = sc.nextInt();
        sc.close();
        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1) {
            if (num1 == num2 && num1 == num3)
                System.out.println("Se puede formar un triangulo y este es EQUILATERO");
            else if (num1 == num2 || num1 == num3 || num2 == num3)
                System.out.println("Se puede formar un triangulo y este es ISOSCELES");
            else
                System.out.println("Se puede formar un triangulo y este es ESCALENO");

        } else
            System.out.println("No se puede formar un triangulo");
    }
}