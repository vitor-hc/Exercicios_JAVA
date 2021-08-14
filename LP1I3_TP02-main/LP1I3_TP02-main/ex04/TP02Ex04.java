import java.util.Scanner;


public class TP02Ex04 {

   
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       int num[][]=new int[2][3];
       int mLinha=2; 
       int mColuna=3;
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
               
           {  
               System.out.println("Digite os nomes");
               num[linha][coluna]=sc.nextInt();
   
           }
      
       }
       
       System.out.println("Valores Originais ");
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
           {  
               
              
               System.out.printf("%s\n",num[linha][coluna]);
               
               
           
           }
           
      
       }
       
      
   
   
         
        sc.close();
    }
    
}
