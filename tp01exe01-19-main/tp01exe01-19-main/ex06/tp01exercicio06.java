/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão 
  digitados. 
*/

import java.util.Scanner;

public class tp01exercicio06 {
    public static void main(String[] args) {
        double valor1, valor2, valor3, valor4, media;
		
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextDouble();
		
        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextDouble();
		
        System.out.print("Digite o terceiro valor: ");
        valor3 = sc.nextDouble();
		
        System.out.print("Digite o quarto valor: ");
        valor4 = sc.nextDouble();
		
        media = (valor1 + valor2 + valor3 + valor4) / 4;
		
        System.out.print("A média dos valores digitados é: " + media);
		
        sc.close();
    }
}
