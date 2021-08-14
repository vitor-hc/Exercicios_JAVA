/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/

import java.util.Scanner;

public class tp01exercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digita o diâmetro do circulo para saber sua área: ");
        double diametro = sc.nextDouble();
		
        double area = (Math.pow((diametro/2), 2)) * Math.PI;             
        
        System.out.println("A área do circulo é: "+area);
		
        sc.close();
    }
}
