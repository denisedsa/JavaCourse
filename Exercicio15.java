package mavenproject1.exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        numero = leitorScanner.nextInt();
        
        if (numero >= 100 && numero <= 200){
            System.out.println("O numero esta no intervalo");
        } else {
            System.out.println("O numero nao esta no intervalo");
        }
    }
}