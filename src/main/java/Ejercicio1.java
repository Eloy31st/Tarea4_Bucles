import java.util.Scanner;

public class Ejercicio1 {
    /*Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.

A continuación se muestra un ejemplo de posibles visualizaciones y valores introducidos, durante una ejecución del algoritmo (los valores introducidos por el usuario, están escritos en negrita y cursiva):

Introduzca el número de notas:

3

Nota:

12

Nota:

17,5

Nota:

14

La media es 14,5


    public static void main(String[] args) {
        int n;
        double nota, suma, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de notas:");
        n = teclado.nextInt();
        suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Nota:");
            nota = teclado.nextDouble();
            suma = suma + nota;
        }
        media = suma / n;
        System.out.println("La media es " + media);
    }

     */
    /*
    El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.

Ejemplo de ejecución del algoritmo:

¿Nota (-1 para terminar)?

9

¿Nota (-1 para terminar)?

18

¿Nota (-1 para terminar)?

-1

La nota media es 13,5
     */
    public static void main(String[] args) {
        double nota, suma, media;
        int n;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        n = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        nota = teclado.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            System.out.println("¿Nota (-1 para terminar)?");
            nota = teclado.nextDouble();
        }
        media = suma / n;
        System.out.println("La nota media es " + media);
    }
}
