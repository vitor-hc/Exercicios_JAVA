/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será 
  digitado. 
*/

import java.util.Scanner;

public class tp01exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da diagonal do quadrado : ");
        double diag = sc.nextDouble();
        
        double area = (Math.pow(diag, 2)) / 2;
        System.out.println("A area do quadrado é: "+area);
        sc.close();
    }
}
