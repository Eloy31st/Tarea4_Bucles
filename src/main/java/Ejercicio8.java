import java.util.Scanner;

public class Ejercicio8 {
    /*
    Dibujar una de las siguientes formas, según la elección del usuario:

Ejemplo de ejecución:

¿tamaño?

5

¿Carácter?

#

¿forma?

1 - rectángulo con relleno

2 - rectángulo sin relleno

3 - cruz de San Andrés

4 - triángulo rectángulo

5 - rombo

6 - ajedrezado

2

Observe que el número de líneas es igual al número de columnas.
     */
    public static void main(String[] args) {
        int tamaño, forma;
        char caracter;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿tamaño?");
        tamaño = teclado.nextInt();
        System.out.println("¿Carácter?");
        caracter = teclado.next().charAt(0);
        System.out.println("¿forma?");
        System.out.println("1 - rectángulo con relleno");
        System.out.println("2 - rectángulo sin relleno");
        System.out.println("3 - cruz de San Andrés");
        System.out.println("4 - triángulo rectángulo");
        System.out.println("5 - rombo");
        System.out.println("6 - ajedrezado");
        forma = teclado.nextInt();
        switch (forma) {
            case 1:
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        if (i == 1 || i == tamaño || j == 1 || j == tamaño) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        if (i == j || i + j == tamaño + 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        if (i == tamaño || j == 1 || i==j) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 5:
                //formar un rombo
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= tamaño; j++) {
                        if (i == 1 || i == tamaño || j == 1 || j == tamaño || i == j || i + j == tamaño + 1 || i == tamaño / 2 + 1 || j == tamaño / 2 + 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

                break;

            case 6:
                for(int i = 1; i <= tamaño; i++){
                    for(int j = 1; j <= tamaño; j++){
                        if(i % 2 == 0){
                            if(j % 2 == 0){
                                System.out.print(caracter);
                            }else{
                                System.out.print(" ");
                            }
                        }else{
                            if(j % 2 == 0){
                                System.out.print(" ");
                            }else{
                                System.out.print(caracter);
                            }
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }
}
