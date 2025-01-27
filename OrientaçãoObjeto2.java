package com.mycompany.estrutura_escolha;

public class Pessoa {
    private float peso;
    private float altura;

    // Método para definir o peso
    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Método para definir a altura
    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public float calcularIMC() {
        if (altura > 0) {
            return peso / (altura * altura);
        }
        return 0; // Retorna 0 em caso de altura inválida (0)
    }
}
