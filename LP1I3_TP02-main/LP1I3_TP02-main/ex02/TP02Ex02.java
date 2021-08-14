import java.util.Scanner;

public class TP02Ex02 {
   
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       double[] vect =new double [10]; 
       double sum = 0, media = 0, maior = 0;
       
        for(int i=0;i<vect.length;i++)
        {
          System.out.println("Digite um valor positivo:");
          vect[i] = sc.nextDouble();

          while(vect[i]<0)
          {
          System.out.println("Digite um valor positivo!!");
          vect[i] = sc.nextDouble();
          }

          if(i == 0) {
            maior = vect[i];
          }
         
          if(maior<vect[i])
          {
            maior=vect[i];
          }

          sum += vect[i];
        }  

        media = sum / 10;        
        
        System.out.println("O maior valor: "+maior);
        System.out.println("A soma dos valores: "+sum);
        System.out.println("A média aritmética dos valores: "+media);
         
        sc.close();
    }
    
}