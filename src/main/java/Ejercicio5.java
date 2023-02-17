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
    /*
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

     */
    /*
    Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.
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
                    switch ((int) (Math.random() * 3)) {
                        case 0:
                            System.out.println("Cuidado, es una auténtica carnicería");
                            break;
                        case 1:
                            System.out.println("Lo peor de los miedos es que te hace prisionero y te impide hacer lo que quieres");
                            break;
                        case 2:
                            System.out.println("La gente teme lo que no comprende");
                            break;
                    }
                    break;
                case 2:
                    switch ((int) (Math.random() * 3)) {
                        case 0:
                            System.out.println("Me llamo Bond, James Bond");
                            break;
                        case 1:
                            System.out.println("Ponga las dos manos en el volante, soy un pasajero muy nervioso.");
                            break;
                        case 2:
                            System.out.println("¿Por qué las chinas tenéis distinto sabor que las otras chicas? Sois diferentes, como el pato de Pekín es distinto del caviar ruso, pero las dos cosas me encantan.");
                            break;
                    }
                    break;
                case 3:
                    switch ((int) (Math.random() * 3)) {
                        case 0:
                            System.out.println("Es sorprendete como el dinero puede encontrar un camino");
                            break;
                        case 1:
                            System.out.println("La vida es un largo río tranquilo, agnes");
                            break;
                        case 2:
                            System.out.println("Que es lo que quieres que te diga?");
                            break;
                    }
                    break;
                case 4:
                    switch ((int) (Math.random() * 3)) {
                        case 0:
                            System.out.println("No, yo soy tu padre");
                            break;
                        case 1:
                            System.out.println("Yo nunca me cuestiono algo… Hasta después de hacerlo");
                            break;
                        case 2:
                            System.out.println("Que la fuerza esté contigo… siempre");
                            break;
                    }
                    break;
            }
        }while (opcion != 5);
    }
}
