
public class PREGUNTA2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Se solicita el ingreso de los consumos al usuario
        System.out.println("Ingrese los consumos del cliente:");
        System.out.print("Consumo1: ");
        int consumo1 = sc.nextInt();
        System.out.print("Consumo2: ");
        int consumo2 = sc.nextInt();
        System.out.print("Consumo3: ");
        int consumo3 = sc.nextInt();
        System.out.print("Consumo4: ");
        int consumo4 = sc.nextInt();

        // Crear crea un objeto de la clase Cliente
        Cliente cliente = new Cliente(consumo1, consumo2, consumo3, consumo4);

        // Mostrar salida del resultado
        System.out.println("\nResultados:");
        System.out.println("Total: " + cliente.calcularTotal());
        System.out.println("Promedio: " + cliente.calcularPromedio());
        System.out.println("Mayor: " + cliente.calcularMayor());
        System.out.println("Menor: " + cliente.calcularMenor());
    }
}
