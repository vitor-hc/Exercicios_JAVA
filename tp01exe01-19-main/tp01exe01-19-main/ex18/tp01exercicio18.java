/*
  Vitor Hugo Chaves Silva Reis
  Antonio Rodrigues Dantas Junior

  18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um 
  valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco 
  que deverá ser devolvido. 
*/

import java.util.Scanner;

public class tp01exercicio18 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Dgite o valor do produto 1: ");
        double p1 = sc.nextDouble();
		
        System.out.print("Digite o valor do produto 2: ");
        double p2 = sc.nextDouble();
		
        System.out.print("Digite o valor do produto 3: ");
        double p3 = sc.nextDouble();
		
        System.out.print("Digite o valor do produto 4: ");
        double p4 = sc.nextDouble();
		
        System.out.print("Digite o valor do produto 5: ");
        double p5 = sc.nextDouble();
        double valorTotal=p1 + p2 + p3 + p4 + p5;
        System.out.println("Valor da compra é: "+valorTotal);
		
        System.out.println("Digite a quantia que o cliente deu: ");
        double pagamento = sc.nextDouble();
		
        double troco = pagamento - (p1 + p2 + p3 + p4 + p5);
		
        System.out.println("o troco é: R$" + troco);
		
        sc.close();
    }
}
