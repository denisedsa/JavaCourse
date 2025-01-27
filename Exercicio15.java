package mavenproject1.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        // Variável para armazenar o número digitado
        int numero;

        // Inicialização do Scanner
        Scanner leitorScanner = new Scanner(System.in);

        // Solicitação do número ao usuário
        System.out.println("Digite um número inteiro para verificar se está no intervalo [100, 200]:");
        numero = leitorScanner.nextInt();

        // Verificação do intervalo
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo de 100 a 200.");
        } else {
           
