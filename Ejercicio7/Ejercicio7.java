package Ejercicio7;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de n: ");
        BigInteger valorDado = sc.nextBigInteger();
        BigInteger numero = BigInteger.ONE;
        BigInteger factorial = BigInteger.ONE;

        while (factorial.compareTo(valorDado) <= 0) {
            numero = numero.add(BigInteger.ONE);
            factorial = factorial.multiply(numero);
        }

        numero = numero.subtract(BigInteger.ONE);

        System.out.println("El mayor número cuyo factorial es menor que " + valorDado + " es: " + numero);
        sc.close();
    }
}