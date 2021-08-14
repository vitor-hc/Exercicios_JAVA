/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da 
  base que serão digitados.
*/

import java.util.Scanner;

public class tp01exercicio12 {
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
		
        System.out.print("Dgite o raio do cone: ");
         double raio = sc.nextDouble();
		 
        System.out.print("Digite a altura do cone: ");
        double altura = sc.nextDouble();
		
        double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
		
        System.out.print("O volume do cone é: " + volume);
		
		sc.close();
    }
}
