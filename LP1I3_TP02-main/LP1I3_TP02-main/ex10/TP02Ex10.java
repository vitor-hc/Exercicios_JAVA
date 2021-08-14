import java.util.Scanner;


public class TP02Ex10 {

   
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      int m;
      
      System.out.println("Digite a quantidade de linhas da matriz quadratica");
      m=sc.nextInt();
      while(m < 2 || m > 10)
      {
      System.out.println("Digite a quantidade de linhas  da matriz quadratica");
      m=sc.nextInt();
      }
    
      double num[][]=new double[m][m];
      
      for(int linha=0; linha < m; linha++)
      {
        for(int coluna=0; coluna < m; coluna++)     
        {  
          System.out.println("Digite os numeros");
          num[linha][coluna]=sc.nextInt();
        }
      }
       
      System.out.println("Valores Originais ");
       
      for(int linha= 0; linha < m; linha++)
      {
        for(int coluna=0; coluna < m; coluna++)
        {     
          System.out.printf("|%s",num[linha][coluna]+"| ");
        }
        System.out.println();
      }
      System.out.println("==================");
      System.out.println("Matriz Inversa ");

      double numIn[][] = new double[m][m];
      double numAdj[][] = new double [m][m];
      double det = 1/teoremaLaplace(num);
      if(det != 0) {

      for(int l = 0; l < m; l++) {
        for(int c = 0; c < m; c++) {
          numAdj[l][c] = Math.pow(-1, l+c) * teoremaLaplace(menor(num, l, c));
        }
      }

      numAdj = transpose(numAdj);
       
      for(int l=0; l < m ; l++){
        for(int c=0; c < m; c++){
          numIn[l][c] = numAdj[l][c] * det;
          System.out.printf("|%s",numIn[l][c]+"| ");   
        }
        System.out.println();
      }
      }else {
        System.out.println("Não pussui matriz inversa.");
      }
         
        sc.close();
    }

    public static double teoremaLaplace(double[][] matriz) {
        
      double determinante = 0;

      switch (matriz.length) {
          case 1:
              determinante = matriz[0][0];
              break;
          case 2:
              determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
              break;
          case 3:
              determinante =    matriz[0][0] * matriz[1][1] * matriz[2][2]
                              + matriz[0][1] * matriz[1][2] * matriz[2][0]
                              + matriz[0][2] * matriz[1][0] * matriz[2][1]
                              - matriz[0][2] * matriz[1][1] * matriz[2][0]
                              - matriz[0][0] * matriz[1][2] * matriz[2][1]
                              - matriz[0][1] * matriz[1][0] * matriz[2][2];
              break;
          default:
              double[][] aux;
              int i_aux, j_aux, linha, coluna, i;

              for (i = 0; i < matriz.length; i++) {
                  if (matriz[0][i] != 0) {
                      aux = new double[matriz.length - 1][matriz.length - 1];
                      i_aux = 0;
                      j_aux = 0;
                      for (linha = 1; linha < matriz.length; linha++) {
                          for (coluna = 0; coluna < matriz.length; coluna++) {
                              if (coluna != i) {
                                  aux[i_aux][j_aux] = matriz[linha][coluna];
                                  j_aux++;
                              }
                          }
                          i_aux++;
                          j_aux = 0;
                      }
                      determinante += Math.pow(-1, i) * matriz[0][i] * teoremaLaplace(aux);
                  }
              }
              break;
      }
      return determinante;
  }

  private static double[][] transpose(double[][] matrix) {
		double[][] transpose = new double[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[i].length; j++)
				transpose[j][i] = matrix[i][j];
		return transpose;
	}

  public static double[][] menor(double[][] matriz, int l, int c) {
    double[][] menor = new double[matriz.length - 1][matriz.length - 1];

    for (int i = 0; i < matriz.length; i++)
			for (int j = 0; i != l && j < matriz.length; j++)
				if (j != c)
					menor[i < l ? i : i - 1][j < c ? j : j - 1] = matriz[i][j];

    return menor;
  }
}