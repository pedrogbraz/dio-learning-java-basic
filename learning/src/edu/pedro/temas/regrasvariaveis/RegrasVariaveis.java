package edu.pedro.temas.regrasvariaveis;

public class RegrasVariaveis {
    public static void main(String[] args) throws Exception {
        float pi = 3.14f; // Toda variável que é float, deverá conter um F no final para indicar que é um float
        long cpf = 12345678900l; // Toda variável que é um long, deverá conter um L no final para indicar que é um long

        String nameOne = "Pedro"; // Pode ser alterado normalmente
        nameOne = "João";

        final String NAME_TWO = "Larissa"; // Toda vez que tiver o final, o nome da variavel deverá sem em CAIXA_ALTA e tambem, não poderá ser alterado o valor
        // NAME_TWO = "Julia"; // Resultará em erro
    }
}
