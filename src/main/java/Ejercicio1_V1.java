import java.util.Scanner;

public class Ejercicio1_V1 {
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

     */
    public static void main(String[] args) {
        // TODO code application logic here
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
}
