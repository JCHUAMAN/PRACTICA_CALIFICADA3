/*Pregunta 1 (Utilizar arreglos bidimensionales)
Crear un programa en Java que permita registrar números enteros dentro de una matriz de 3x3 
Visualizar la suma de los números impares y la cantidad de números pares.
 Ejemplo:
1 2 3
4 5 6
7 8 9
     Resultados:
     sni=25
     cnp=4
*/
import java.util.Scanner;
public class PREGUNTA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaImpares = 0;
        int cantidadPares = 0;

        // Llenar la matriz con números ingresados por el usuario
        System.out.println("Ingrese los números enteros para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
        // Se verifica si el número es par o impar
               
                if (matriz[i][j] % 2 == 0) {
                    cantidadPares++;
                } else {
                    sumaImpares += matriz[i][j];
                }
            }
        }
        // Mostrar la matriz
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Salida de datos
        System.out.println("\nResultados:");
        System.out.println("Suma de números impares (sni): " + sumaImpares);
        System.out.println("Cantidad de números pares (cnp): " + cantidadPares);
    }
}
