import java.util.Scanner;

public class Ejercicio5 {
    /*
    El programa debe mostrar un menú con una lista de películas y una opción para salir.

Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.

Si el usuario elige salir, el programa mostrará un mensaje antes de salir.

Ejemplo de ejecución:

1 - Una cita de la ciudad del miedo

2 - Una cita de James Bond

3 - Una cita de la vida es un largo río tranquilo

4 - Una cita de Star Wars

5 - Salir de esta magnífica aplicación

2

Me llamo Bond, James Bond

1

Cuidado, es una auténtica carnicería

5

Adios

¡Por supuesto, puede elegir las películas y las citas que prefiera!
     */
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cuidado, es una auténtica carnicería");
                    break;
                case 2:
                    System.out.println("Me llamo Bond, James Bond");
                    break;
                case 3:
                    System.out.println("¿Qué es la felicidad? Un trabajo bien hecho");
                    break;
                case 4:
                    System.out.println("No, yo soy tu padre");
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 5);
    }
}
