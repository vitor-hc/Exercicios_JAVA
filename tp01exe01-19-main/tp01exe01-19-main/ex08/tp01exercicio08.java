/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e 
  dois metros e que um quilômetro possui mil metros, fazer um programa para 
  converter milhas marítimas em quilômetros.
*/

import java.util.Scanner;

public class tp01exercicio08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Dgite o valor de milhas marítimas: ");
        double milhas = sc.nextDouble();
		
        double km = milhas * 1.852;
		
        System.out.print("O valor em quilômetros é: "+ km);
        
		sc.close();
    }
    
}
