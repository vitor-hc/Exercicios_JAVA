/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que 
  será digitado.
*/

import java.util.Scanner;

public class tp01exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do diâmetro da esfera : ");
        double diametro = sc.nextDouble();
        
        double vol =(4 * Math.PI * (Math.pow((diametro/2),3)) ) / 3;
        System.out.println("O volume da  esfera é: "+vol);
        sc.close();
    }
}
