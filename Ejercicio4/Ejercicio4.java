import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        String ast = "* ";
        int a;
        int n;
        int b;
        char cont; 

        do {
            System.out.println("Selecciona el modelo (1 | 2 | 3 | 4 | x para salir)");
            String input = sc.next();

        
            if (input.equalsIgnoreCase("x")) {
                System.out.println("Saliendo del programa...");
                break; 
            }

            opcion = Integer.parseInt(input); 

            if (opcion >= 1 && opcion <= 4) {
                System.out.println("Selecciona la altura: ");
                n = sc.nextInt();
                System.out.println("Altura del triangulo: " + n);

                if (opcion == 1) {
                    for (a = 0; a < n; a++) {
                        for (b = 0; b < n; b++) {
                            if (b <= a) {
                                System.out.print(ast);
                            }
                            if (b == a) {
                                System.out.println("");
                            }
                        }
                    }
                } else if (opcion == 2) {
                    for (a = n; a > 0; a--) {
                        for (b = 0; b < a; b++) {
                            System.out.print(ast);
                        }
                        System.out.println();
                    }
                } else if (opcion == 3) {
                   
                    for (a = 0; a < n; a++) {
                        for (b = 0; b <= n; b++) {
                            if (b <= a) {
                                System.out.print("- ");
                            } else if (b == n) {
                                System.out.print(ast);
                            }
                        }
                        System.out.println();
                    }
                } else if (opcion == 4) {
                   
                    for (a = n - 1; a >= 0; a--) {
                        for (b = 0; b <= n; b++) {
                            if (b <= a) {
                                System.out.print("- ");
                            } else if (b == n) {
                                System.out.print(ast);
                            }
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Fuera de rango.");
            }
            cont= 'a';

        }while (cont != 'x'); 
        sc.close();
    }
}
