class Cliente {
    // Atributos
    private int consumo1;
    private int consumo2;
    private int consumo3;
    private int consumo4;
    // Métodos que se usaran get y set para cada consumo
    public int getConsumo1() {
        return consumo1;
    }
    public void setConsumo1(int consumo1) {
        this.consumo1 = consumo1;
    }
    public int getConsumo2() {
        return consumo2;
    }
    public void setConsumo2(int consumo2) {
        this.consumo2 = consumo2;
    }
    public int getConsumo3() {
        return consumo3;
    }
    public void setConsumo3(int consumo3) {
        this.consumo3 = consumo3;
    }
    public int getConsumo4() {
        return consumo4;
    }
    public void setConsumo4(int consumo4) {
        this.consumo4 = consumo4;
    }
    // Método para calcular el total de los consumos
    public int calcularTotal() {
        return consumo1 + consumo2 + consumo3 + consumo4;
    }
    // Método para calcular el promedio
    public double calcularPromedio() {
        return calcularTotal() / 4.0;
    }
    // Método para encontrar el mayor consumo
    public int calcularMayor() {
        return Math.max(Math.max(consumo1, consumo2), Math.max(consumo3, consumo4));
    }
    // Método para encontrar el menor consumo
    public int calcularMenor() {
        return Math.min(Math.min(consumo1, consumo2), Math.min(consumo3, consumo4));
    }
}
public class PREGUNTA3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // Crear un objeto de la clase Cliente
        Cliente cliente = new Cliente();
        // Solicitar los consumos al usuario y registrarlos 
        System.out.println("Ingrese los consumos del cliente:");
        System.out.print("Consumo1: ");
        cliente.setConsumo1(sc.nextInt());
        System.out.print("Consumo2: ");
        cliente.setConsumo2(sc.nextInt());
        System.out.print("Consumo3: ");
        cliente.setConsumo3(sc.nextInt());
        System.out.print("Consumo4: ");
        cliente.setConsumo4(sc.nextInt());
        // Mostrar la salida de los resultados
        System.out.println("\nResultados:");
        System.out.println("Total: " + cliente.calcularTotal());
        System.out.println("Promedio: " + cliente.calcularPromedio());
        System.out.println("Mayor: " + cliente.calcularMayor());
        System.out.println("Menor: " + cliente.calcularMenor());
    }
}
