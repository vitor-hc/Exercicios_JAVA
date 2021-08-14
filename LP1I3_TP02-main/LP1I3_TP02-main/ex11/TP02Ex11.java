import java.util.Scanner;

public class TP02Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = 0;

        System.out.println("Digite a quantidade de linhas da matriz quadratica");
        m = sc.nextInt();
        while (m > 10 || m < 1) {
            System.out.println("Digite a quantidade de linhas  da matriz quadratica (menor que 10 e maior que 0)");
            m = sc.nextInt();
        }
        System.out.println();

        double matriz[][] = new double[m][m];

        System.out.println("Digite os numeros:");
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int x = 0; x < m; x++) {
                System.out.print("Matriz["+(i+1)+"]["+(x+1)+"]: ");
                matriz[i][x] = sc.nextInt();
                System.out.println();
            }
        }

        System.out.println("==================");

        System.out.println("Determinante da matriz: "+ teoremaLaplace(matriz));

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
}
