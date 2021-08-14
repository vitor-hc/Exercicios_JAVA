import java.util.Scanner;

public class Data {
    Scanner sc = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;

    public Data() {
 
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
     public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    public void setDia() {
        do {
            System.out.print("Digite o dia: ");
            dia = sc.nextInt();
        } while (dia > 31 || dia <= 0);
    }

    public void setMes() {
        do {
            System.out.print("Digite o mes: ");
            mes = sc.nextInt();
        } while (mes > 12 || mes <= 0);
    }

    public void setAno() {
        do {
            System.out.print("Digite o ano: ");
            ano = sc.nextInt();
        } while (ano < 0);
    }

    public String getData() {
        String dt1 = (dia + "/" + mes + "/" + ano);
        return dt1;
    }

    public static void main(String[] args) {
        Data data2 = new Data();
        data2.getData();
    }
   
}
