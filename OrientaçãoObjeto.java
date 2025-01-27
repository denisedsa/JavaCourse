package com.mycompany.estrutura_escolha;

public class Pessoa {
    private float peso;
    private float altura;

    // Métodos setters e getters
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
            return peso / (altura * altura); // Fórmula para calcular o IMC
        }
        return 0; // Evita divisão por zero caso altura seja 0
    }
}
