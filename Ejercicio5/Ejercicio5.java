package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        ArrayList<Integer> num = new ArrayList<Integer>();
        int total=0;
        System.out.println("Ingrese el multiplicando: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el multiplicador: ");
        num2 = sc.nextInt();
        sc.close();
        while (num2 >= 1) {
            if (num2 % 2 == 1) {
                num.add(num1);
            }
            num2 /= 2;
            num1 *= 2;
        }
        for (int numeros : num) {
            total+=numeros;
        }
        System.out.println("Resultado: "+ total);
    }
}
