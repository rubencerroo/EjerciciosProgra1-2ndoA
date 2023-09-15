package Ejercicio6;

import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21...

public class Ejercicio6 {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int num2 = 1;
        int n;
        int orden=0;
        int resultado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el valor de n:");
        n = sc.nextInt();
        sc.close();
        if (n <= 0) {
            System.out.println("El mayor termino de la sucesion de Fibonacci menor que: " + n + "es 0  con orden: 0");
        } else if (n == 1) {
            System.out.println("El mayor termino de la sucesion de Fibonacci menor que: " + n + "es 0 con orden: 1" );
        } else {
            for (int i = 2; num1 < n && n > 1; i++) {
                num = num1 + num2;
                resultado=num1;
                num1 = num2;
                num2 = num;
                orden++;
            }


        }
        System.out.println("El mayor termino de la sucesion de Fibonacci menor que: " + n + " es " + resultado + " con orden: " + orden);
    }
}

