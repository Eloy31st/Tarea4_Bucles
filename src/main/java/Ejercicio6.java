import java.util.Scanner;

public class Ejercicio6 {
    /*
    Escriba un programa que haga que el usuario escriba un múltiplo de tres y no se detenga hasta que el número sea correcto.

Ejemplo de ejecución del algoritmo:

Escriba un múltiplo de 3

7579

Error 7579 no es un múltiplo de 3

16427

Error 16427 no es un múltiplo de 3

51321

Ok: 51321 es un múltiplo de 3
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un múltiplo de 3");
        numero = teclado.nextInt();
        while (numero % 3 != 0) {
            System.out.println("Error " + numero + " no es un múltiplo de 3");
            System.out.println("Escriba un múltiplo de 3");
            numero = teclado.nextInt();
        }
        System.out.println("Ok: " + numero + " es un múltiplo de 3");
    }
}
