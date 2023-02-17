import java.util.Scanner;

public class Ejercicio7 {
    /*
    El arte ASCII consiste en hacer un diseño usando solo caracteres. Una de las formas más primitivas de este arte son los emoticonos: los caracteres :-) dibujan una carita sonriente.

Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.

Ejemplo de ejecución:

¿Anchura?

8

¿Altura?

5

¿Carácter?

#

########

########

########

########

########
     */
    public static void main(String[] args) {
        int anchura, altura;
        char caracter;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Anchura?");
        anchura = teclado.nextInt();
        System.out.println("¿Altura?");
        altura = teclado.nextInt();
        System.out.println("¿Carácter?");
        caracter = teclado.next().charAt(0);
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
