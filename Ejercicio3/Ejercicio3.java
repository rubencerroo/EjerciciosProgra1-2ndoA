package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int num2 = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el valor de n:");
        n = sc.nextInt();
        sc.close();
        if (n <= 0) {
            System.out.println("El numero en la posicion " + n + "es 0");
        } else if (n == 1) {
            System.out.println("El numero en la posicion " + n + "es 1");
        } else {
            for (int i = 2; i <= n; i++) {
                num = num1 + num2;
                num1 = num2;
                num2 = num;
            }

        }
        System.out.println("El numero en la " + n + "posicion es: " + num1);
    }
}
