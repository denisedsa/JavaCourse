package estruturacondicional;

public class EstruturaCondicional {

    public static void main(String[] args) {
        // Exemplo de operadores condicionais:
        // >  (maior que)
        // >= (maior ou igual)
        // <  (menor que)
        // <= (menor ou igual)
        // == (igual)
        // != (diferente)
        // && (e lógico)
        // || (ou lógico)
        // !  (não lógico)

        // Variável de exemplo
        int media = 7;

        // Estrutura condicional para avaliar a média
        if (media >= 7) { // Aprovado
            if (media == 10) {
                System.out.println("APROVADO COM NOTA MÁXIMA!");
            } else {
                System.out.println("APROVADO");
            }
        } else { // Reprovado
            System.out.println("REPROVADO");
        }
    }
}
