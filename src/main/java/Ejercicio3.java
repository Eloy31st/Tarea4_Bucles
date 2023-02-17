import java.util.Scanner;

public class Ejercicio3 {
    /*
    Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.

a

Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?

-

Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?

=

Fenomenal, lo he encontrado después de 4 intentos.
     */
    public static void main(String[] args) {
        int intento, min, max, numIntentos;
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.nextLine();
        numIntentos = 0;
        min = 1;
        max = 100;
        intento = (min + max) / 2;
        System.out.println("Pruebo con " + intento + ", ¿es mayor, menor o es el número (+/-/=)?");
        respuesta = teclado.nextLine().charAt(0);
        while (respuesta != '=') {
            if (respuesta == '+') {
                min = intento + 1;
            } else {
                max = intento - 1;
            }
            numIntentos ++;
            intento = (min + max) / 2;
            System.out.println("Pruebo con " + intento + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = teclado.nextLine().charAt(0);
        }
        System.out.println("Fenomenal, lo he encontrado después de " + numIntentos + " intentos.");
    }
}
