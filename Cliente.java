class Cliente {
    // Atributos
    private int consumo1;
    private int consumo2;
    private int consumo3;
    private int consumo4;

    // Constructor
    public Cliente(int consumo1, int consumo2, int consumo3, int consumo4) {
        this.consumo1 = consumo1;
        this.consumo2 = consumo2;
        this.consumo3 = consumo3;
        this.consumo4 = consumo4;
    }

    public int calcularTotal() {
        return consumo1 + consumo2 + consumo3 + consumo4;
    }

    public double calcularPromedio() {
        return calcularTotal() / 4.0;
    }

    public int calcularMayor() {
        return Math.max(Math.max(consumo1, consumo2), Math.max(consumo3, consumo4));
    }

    public int calcularMenor() {
        return Math.min(Math.min(consumo1, consumo2), Math.min(consumo3, consumo4));
    }
}