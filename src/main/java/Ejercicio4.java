import java.util.Scanner;

public class Ejercicio4 {
    /*
    Observe atentamente el siguiente algoritmo:

Algo Trampa
Variable numIntento : entero <- 1
Variable valorIntroducido : texto
Constante MAX_INTENTOS : entero <- 5
Inicio
   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0
         escribir("Respuesta incorrecta")
         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &
" intento(s)")
         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
   FMq
   Si MAX_INTENTOS - numIntento ≠ 0 Entonces
         escribir("Bravo")
   Si no
         escribir("Revise sus conocimientos en geografía")
   FSi
Fin
¿Qué hace?

Corrija este algoritmo para que logre lo que se podría esperar.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numIntento = 1;
        String valorIntroducido;
        final int MAX_INTENTOS = 5;
        System.out.println("¿Cuál es la capital de Francia? ");
        valorIntroducido = teclado.nextLine();
        while (!valorIntroducido.equals("París") && MAX_INTENTOS - numIntento != 0) {
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo quedan " + (MAX_INTENTOS - numIntento) + " intento(s)");
            System.out.println("¿Cuál es la capital de Francia? ");
            valorIntroducido = teclado.nextLine();
            numIntento++;
        }
        if (MAX_INTENTOS - numIntento != 0) {
            System.out.println("Bravo");
        } else {
            System.out.println("Revise sus conocimientos en geografía");
        }
    }
    //Este algoritmo pide al usuario la capital de Francia, teniendo un máximo de 5 intentos, si el usuario acierta antes de los 5 intentos, se le felicita, si no, se le dice que revise sus conocimientos en geografía.
}
