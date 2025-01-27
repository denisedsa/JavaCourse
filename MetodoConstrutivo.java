package Encapsulamento;

public class Pessoa {
    private float peso;
    private float altura;

    // Métodos getters e setters
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public float calcularIMC() {
        if (altura > 0) {
            return peso / (altura * altura);
        }
        return 0; // Evitar divisão por zero
    }
}
