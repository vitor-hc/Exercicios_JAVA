/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio 
  “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão 
  digitados.  
*/

import java.util.Scanner;

public class tp01exercicio14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a aresta do cubo: ");
        double a = sc.nextDouble();
		
        System.out.print("Digite o raio da esfera: ");
        double r = sc.nextDouble();
		
        double volumeL = Math.pow(a, 3) - ((Math.pow(r, 3) * Math.PI * 4) / 3);
        System.out.print("O volume livre é: " + volumeL);
		
        sc.close();
    }
}
