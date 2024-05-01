package edu.pedro.temas.operadores;

public class OperadoresAtribuicao {
  public static void main(String[] args) {
    int age = 16;
    age = age += 2; // Resultará em age sendo 17, pois com esse operador, eu adicionei 2 números ao valor anterior
    System.out.println(age);
    age = age -= 4; // Resultará em age sendo 14, pois com esse operador, eu subtrai 4 números ao valor anterior
    System.out.println(age);
  }
}
