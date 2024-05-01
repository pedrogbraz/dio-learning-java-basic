package edu.pedro.temas.operadores;

public class OperadoresRelacionais {
  public static void main(String[] args) {
    int a = 1, b = 2;
    boolean equal = a == b; // false pois A não é igual a B
    boolean notEqual = a != b; // true pois A é diferente de B
    boolean greaterThan = a > b; // falso pois A é menor que B
    boolean lessThan = a < b; // true pois A é menor que B
    boolean greaterThanOrEqual = a >= b; // false pois A não é maior e nem igual a B
    boolean lessThanOrEqual = a <= b; // true pois A é menor que B
  }
}
