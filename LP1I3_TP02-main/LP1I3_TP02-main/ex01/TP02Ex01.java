import java.util.Scanner;

public class TP02Ex01 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Digite o primeiro valor:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int numero2 = sc.nextInt();

        while(numero2<=numero1)
        {
        System.out.println("Digite o segundo valor, ele deve ser maior que o primeiro:");
        numero2 = sc.nextInt();
        }
         System.out.println("Primeiro valor: "+numero1+" - Segundo valor:"+numero2);
        sc.close();
    }
    
}
