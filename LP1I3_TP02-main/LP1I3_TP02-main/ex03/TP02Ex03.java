import java.util.Scanner;


public class TP02Ex03 {

   
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a quantidade de numeros que sera digitado: ");
      int n=sc.nextInt();

      while (n <= 0 || n > 20) {
        System.out.println("Erro, digite um valor positivo menor que 20.");
        n = sc.nextInt();
      }

      double[] vect =new double[n];
      double maior, menor, sum, numeroPos, numeroNeg, media;
      String resp;
      boolean continua = true;

      while (continua)
      {
        maior = 0; menor = 0; sum = 0; numeroPos = 0; numeroNeg = 0; media = 0;
        for(int i=0;i<n;i++)
        {
          System.out.println("Digite o valor:");
          vect[i] = sc.nextDouble();

          if(i == 0) {
            maior = vect[0];
            menor = vect[0];
          }
          if(maior<vect[i])
          {
              maior = vect[i];
          }
          if(menor>vect[i])
          {
              menor = vect[i];
          }
          if(vect[i]>=0)
          {
              numeroPos++;
          }
          if(vect[i]<0)
          {
              numeroNeg++;
          }
          sum += vect[i];
        }
    
        media = sum / n; 
        
        System.out.println("O maior valor "+maior);
        System.out.println("O menor valor "+menor);
        System.out.println("A soma dos valores "+sum);
        System.out.println("A média aritmética dos valores "+media);
        System.out.println("A porcentagem de valores que são positivos (*incluindo 0): "+(numeroPos/n)*100+"%");
        System.out.println("A porcentagem de valores negativos: "+(numeroNeg/n)*100+"%");
        System.out.println("Deseja continuar? [S/N]");
        resp = sc.next().toUpperCase();
        
        while(!resp.equals("S") && !resp.equals("N")) {
          System.out.println("Deseja continuar? [S/N]");
          resp = sc.next().toUpperCase();
        }
        
        if(resp.equals("N")) {
          continua = false;
        }
      } 
      sc.close();
    }
    
}