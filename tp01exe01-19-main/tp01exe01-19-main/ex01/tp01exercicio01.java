/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua 
  área. 
*/

import java.util.Scanner;

public class tp01exercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = sc.nextDouble();
        double area = base* altura;
        System.out.println("A area do retangulo é: "+area);
        sc.close();
    }
}
