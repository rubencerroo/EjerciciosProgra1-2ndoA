package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el primer numero: ");
        num1 = sc.nextInt();

        System.out.println("Elija el segundo numero: ");
        num2 = sc.nextInt();
        sc.close();
        // 1
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);

        // 2
        int producto = num1 * num2;
        System.out.println("El Producto: " + producto);

        // 3 1>2
        if (num1 > num2) {
            System.out.println("El primer numero es mayor que el segundo");
        } else
            System.out.println("El primer numero no es mayor que el segundo");

        // 4
        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else
            System.out.println("Los numeros no son iguales");

        // 5
        if (num1 % 2 == 0) {
            System.out.println("El numero1 es par");
        } else
            System.out.println("El numero1 no es par");
        if (num2 % 2 == 0) {
            System.out.println("El numero2 es par");
        } else
            System.out.println("El numero2 no es par");

        // 6 Divisibles?

        // 7
        if (num1 >= 1 && num1 <= 10) {
            System.out.println("El valor del primer numero ESTA comprendido en el intervalo [1, 10]");
        } else
            System.out.println("El valor del primer numero NO ESTA comprendido en el intervalo [1, 10]");

        // 8
        if (num1 >= 1 && num1 <= 10 && num2 >= 1 & num2 <= 10) {
            System.out.println("Ambos numeros ESTAN comprendidos en el intervalo [1, 10]");
        } else
            System.out.println("Ambos numeros NO ESTAN comprendidos en el intervalo [1, 10]");

        // 9
        num1 += num2;
        System.out.println("num1 incrementado: " + num1);
    }
}
