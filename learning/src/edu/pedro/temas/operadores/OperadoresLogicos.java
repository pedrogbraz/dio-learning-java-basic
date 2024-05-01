package edu.pedro.temas.operadores;

public class OperadoresLogicos {
  public static void main(String[] args) {
    int a = 1, b = 2;
    boolean and = a > b && a < b; // false pois A não é maior que B (Tem que ter as duas condições como true para resultar em true)
    boolean or = a > b || a < b; // true pois A é menor que B (Tem que ter apenas uma true para resultar em true)
  }
}
