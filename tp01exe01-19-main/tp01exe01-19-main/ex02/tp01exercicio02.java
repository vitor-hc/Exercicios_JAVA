/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será 
  digitado. 
*/

import java.util.Scanner;

public class tp01exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = sc.nextDouble();
        double area = aresta * aresta;
        System.out.print("A área do quadrado é: " + area);
        sc.close();
    }
}
