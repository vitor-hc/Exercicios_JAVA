import java.util.Arrays;
import java.util.Scanner;


public class TP02Ex08 {

   
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       int num[][]=new int[3][4];
       int mLinha=3; 
       int mColuna=4;
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
               
           {  
               System.out.println("Digite os numeros");
               num[linha][coluna]=sc.nextInt();
               
               
              
           
           }
      
       }
        System.out.println("Digite o multiplicador: ");
        int multiplicador=sc.nextInt();
       
       System.out.println("Valores Originais ");
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
           {  
               
              
               System.out.printf("%s",num[linha][coluna]);
               System.out.print("\n");
               
           
           }
           
      
       }
        
       
       
       for(int linha=0;linha<mLinha;linha++)
       {
           for(int coluna=0;coluna<mColuna;coluna++)
           {  
               
              
              num[linha][coluna]=multiplicador*num[linha][coluna];
             
               
           
           }
           
      
       }
       
       
       System.out.println("==================");
        System.out.println("Valores Multiplicados ");
       
          System.out.print(Arrays.deepToString(num));
            
              
               
       
      
   
   
         
        sc.close();
    }
    
}