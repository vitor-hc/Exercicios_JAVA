/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as 
  seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo. 
  Lembre-se que uma função trigonométrica trabalha em radianos.
*/

import java.util.Scanner;

public class tp01exercicio16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite o ângulo em graus: ");
        double angulo = sc.nextDouble();
		
        angulo = (angulo * Math.PI) / 180;
        double sen = Math.sin(angulo);
        double cos = Math.cos(angulo);
        double tang = Math.tan(angulo);
        double sec = 1 / cos;
		
        System.out.println("O seno é: " + sen);
        System.out.println("O coseno é: " + cos);
        System.out.println("A tangente é: " + tang);
        System.out.println("A secante é: " + sec);
		
        sc.close();
    }
}
