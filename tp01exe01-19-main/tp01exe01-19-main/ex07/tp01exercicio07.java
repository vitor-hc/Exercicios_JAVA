/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  7. Calcular e exibir a média geométrica de dois valores quaisquer que serão 
  digitados.
*/

import java.util.Scanner;

public class tp01exercicio07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o primeiro valor: ");
        double prim = sc.nextDouble();
		
        System.out.print("Digite o segundo valor: ");
        double seg = sc.nextDouble();
		
        double media = Math.sqrt(prim*seg);
        System.out.println("a média dos valores é: "+media);
		
        sc.close();
    }
}
