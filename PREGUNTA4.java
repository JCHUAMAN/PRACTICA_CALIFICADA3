/*
Crear un programa en Java utilizando la programación orientada a objetos mediante una clase Adicion 
con sus atributos y métodos sobrecargados que permita registrar 
dos, tres, cuatro y cinco números dentro de un mismo método dentro de la clase,
realizar la verificación creando un objeto en otra clase para la ejecución del método con dos y tres parámetros.
*/
public class PREGUNTA4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // se crear un objeto de la clase Adicion
        Adicion adicion = new Adicion();

        //suma con dos números
        System.out.println("Ingrese dos números para la suma:");
        System.out.print("Número 1: ");
        int num1 = sc.nextInt();
        System.out.print("Número 2: ");
        int num2 = sc.nextInt();
        int resultadoDos = adicion.sumar(num1, num2);
        System.out.println("Suma de dos números: " + resultadoDos);

        // suma con tres números
        System.out.println("\nIngrese tres números para la suma:");
        System.out.print("Número 1: ");
        num1 = sc.nextInt();
        System.out.print("Número 2: ");
        num2 = sc.nextInt();
        System.out.print("Número 3: ");
        int num3 = sc.nextInt();
        int resultadoTres = adicion.sumar(num1, num2, num3);
        System.out.println("Suma de tres números: " + resultadoTres);

        // suma con cuatro numeros
        System.out.println("\nIngrese cuatro números para la suma:");
        System.out.print("Número 1: ");
        num1 = sc.nextInt();
        System.out.print("Número 2: ");
        num2 = sc.nextInt();
        System.out.print("Número 3: ");
        num3 = sc.nextInt();
        System.out.print("Número 4: ");
        int num4 = sc.nextInt();
        int resultadoCuatro = adicion.sumar(num1, num2, num3, num4);
        System.out.println("Suma de cuatro números: " + resultadoCuatro);
        // suma con cinco numeros
        System.out.println("\nIngrese cinco números para la suma:");
        System.out.print("Número 1: ");
        num1 = sc.nextInt();
        System.out.print("Número 2: ");
        num2 = sc.nextInt();
        System.out.print("Número 3: ");
        num3 = sc.nextInt();
        System.out.print("Número 4: ");
        num4 = sc.nextInt();
        System.out.print("Número 5: ");
        int num5 = sc.nextInt();
        int resultadoCinco = adicion.sumar(num1, num2, num3, num4, num5);
        System.out.println("Suma de cinco números: " + resultadoCinco);
    }
}
