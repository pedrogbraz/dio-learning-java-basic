package edu.pedro.temas.operadores;

public class OperadoresUnarios {
  public static void main(String[] args) {
    int increment = 1; // 1
    boolean isTrue =  true;
    ++increment; // Para adicionar +1 no valor default, que resultara em 2
    --increment; // Para subtrair -1 no valor default, que resultara em 1 
    boolean isFalse = !isTrue; // Resultara em isFalse sendo false

    System.out.println(increment); // 1
    System.out.println(++increment); // 2 
    System.out.println(--increment); // 1
  }
}
