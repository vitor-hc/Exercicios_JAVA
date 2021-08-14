import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class Data {
    Scanner sc = new Scanner(System.in);
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        setDia();
        setMes();
        setAno();
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
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

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getmostra1() {
        String dt1 = (dia + "/" + mes + "/" + ano);
        return dt1;
    }

    public String getmostra2() {
        String dt2;
        int cont;
        int ms = this.mes;
        String meses[] = { "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        
        cont = ms - 1;

        dt2 = ("Dia " + dia + " de " + meses[cont] + " de " + ano);
        return dt2;
    }

    public String getbissexto(){
        int ano = this.ano;
        if(ano % 4 == 0 ){
            return "O ano " + ano + " eh bisexto";
        }else {
            return "O ano " + ano + " nao eh bisexto";
        }
    }

    public int getDiasTranscorridos(){
        int dia = this.dia;
        int mes = this.mes;
        int ano = this.ano;
        int dtc=0;
        int diastotal=0;
        int meses[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ano % 4 == 0)
        {
            meses[1]++;
        }
        for (int i = 0 ; i < (mes-1); i++ )
        {
            dtc += meses[i] ;
        }
        diastotal = dtc + dia;
        
        
        return diastotal;
        
    }
    public void apresentaDataAtual(){
                Calendar c = Calendar.getInstance();
		Date dat = c.getTime();

		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
		System.out.println("Data: "+ f.format(dat));
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.getmostra1();
        data.getmostra2();
        data.getbissexto();
        
        System.out.println("\n" + data.getmostra1());
        System.out.println(data.getmostra2());
        System.out.println(data.getbissexto());
        System.out.println("Quantidade de dias eh: " +data.getDiasTranscorridos());
        data.apresentaDataAtual();
        System.out.println("\n");
        System.out.println("\n");
        
        
        
        
        
       
       
         Data data1 = new Data(12, 5, 2020);      
        
        System.out.println("Exercicio 2 - Teste Metodos");
        System.out.println("\n");
        
        System.out.println("Data mostra1: "+data1.getmostra1());
        System.out.println("Data mostra2: "+data1.getmostra2());
        System.out.println("Data bissexto: "+data1.getbissexto());
        System.out.println("Quantidade de dias eh: " +data1.getDiasTranscorridos());
        data1.apresentaDataAtual();
        System.out.println("\n");
        System.out.println("\n");
        
        
        System.out.println("Exercicio 2 - Teste de Classes");
        data1.setDia(20);
        data1.setMes(12);
        data1.setAno(2020);
        System.out.println("Nova data mostra1: "+data1.getmostra1());
        System.out.println("Nova data mostra2: "+data1.getmostra2());
        System.out.println("Nova data bissexto: "+data1.getbissexto());
        System.out.println("Quantidade de dias eh: " +data1.getDiasTranscorridos());
        data1.apresentaDataAtual();
        
        
        

        
        

       

    }
   
}
