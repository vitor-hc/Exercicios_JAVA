/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos 
  valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/

import java.util.Scanner;

public class tp01exercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a resistência: ");
        double resistencia = sc.nextDouble();
		
        System.out.print("Digite a corrente elétrica : ");
        double corrente = sc.nextDouble();
                
        double tensao = corrente * resistencia;
		
        System.out.println("A tensão do circuito é: "+tensao+"V");
		
        sc.close();
    }
}
