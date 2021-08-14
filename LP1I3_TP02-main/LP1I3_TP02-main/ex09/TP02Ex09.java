import java.util.Arrays;
import java.util.Scanner;


public class TP02Ex09 {

   
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int m=0;
       int n=0;
       
       System.out.println("Digite a quantidade de linhas da matriz");
       m=sc.nextInt();
       while(m>10)
       {
        System.out.println("Digite a quantidade de linhas da matriz");
        m=sc.nextInt();
       }
       System.out.println("Digite a quantidade de colunas da matriz");
       n=sc.nextInt();
       while(n>10)
       {
       System.out.println("Digite a quantidade de colunas da matriz");
       n=sc.nextInt();
       }
       int num[][]=new int[m][n];
       int mLinha=m; 
       int mColuna=n;
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
           {  
               System.out.println("Digite os numeros");
               num[linha][coluna]=sc.nextInt();
           }
       }
       
       System.out.println("Valores Originais ");
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
           {     
               System.out.printf("%s",num[linha][coluna]);
               System.out.print("\n");
           }
       }
       
       int [][] matriztransposta=new int [n][m]; 
       for(int i=0;i<mLinha;i++)
       {
           for(int j=0;j<mColuna;j++)
           {  
               
              matriztransposta[j][i]= num[i][j]; 

           }
      
       }
       
       System.out.println("==================");
        System.out.println("Matriz transposta ");
       
          System.out.print(Arrays.deepToString(matriztransposta));
         
        sc.close();
    }
    
}