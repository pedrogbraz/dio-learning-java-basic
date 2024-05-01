package edu.pedro.temas.regrasvariaveis;

import java.util.Date;

public class RegrasVariaveis {
    public static void main(String[] args) throws Exception {
        float pi = 3.14f; // Toda variável que é float, deverá conter um F no final para indicar que é um float
        long cpf = 12345678900l; // Toda variável que é um long, deverá conter um L no final para indicar que é um long
        char gender = 'M'; // Toda variável que é char, deverá conter o valor entre aspas simples, e não dupla, e só permite um único caracter
        Date date = new Date(); // Toda vez que for preciso criar um objeto dentro de uma variável, deverá conter a palavra new antes

        String nameOne = "Pedro"; // Pode ser alterado normalmente
        nameOne = "João";

        final String NAME_TWO = "Larissa"; // Toda vez que tiver o final, o nome da variavel deverá sem em CAIXA_ALTA e tambem, não poderá ser alterado o valor
        // NAME_TWO = "Julia"; // Resultará em erro
    }
}
