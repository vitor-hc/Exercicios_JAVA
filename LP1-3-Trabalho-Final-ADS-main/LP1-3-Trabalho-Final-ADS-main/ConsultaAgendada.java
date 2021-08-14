import java.util.Scanner;

public class ConsultaAgendada {

    Scanner sc = new Scanner(System.in);
    private Data data = new Data();
    private Hora hora = new Hora();
    private String nomePaciente;
    private static int quantidade = 0;
    private String nomeMedico;

    //primeiro construtor 
    public ConsultaAgendada() {
        setHora();
        setData();
        setNomePaciente();
        setNomeMedico();
        quantidade++;
    }

    //segundo construtor 
    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String me) {
        setHora(h, mi, s);
        setData(d, m, a);
        setNomePaciente(p);
        setNomeMedico(me);
        quantidade++;
    }

    // terceiro construtor
    public ConsultaAgendada(Data d, Hora h, String p, String M) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = M;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data.setDia(d);
        this.data.setMes(m);
        this.data.setAno(a);
    }

    public void setData() {
        this.data.setDia();
        this.data.setMes();
        this.data.setAno();
    }

    public void setHora(int h, int mi, int s) {
        this.hora.setHor(h);
        this.hora.setMin(mi);
        this.hora.setSeg(s);
    }

    public void setHora() {
        this.hora.setHor();
        this.hora.setMin();
        this.hora.setSeg();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomePaciente() {
        System.out.print("Digite o nome do(a) paciente: ");
        nomePaciente = sc.next();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m; 
    }

    public void setNomeMedico() {
        System.out.print("Digite o nome do(a) medico(a): ");
        nomeMedico = sc.next();
    }
 
    public int getAmostra() {
        int quantidade = ConsultaAgendada.quantidade;
        return quantidade;
    }

    public String getData()
    {
        return this.data.getData();
    }

    public String getHora()
    {
        return this.hora.getHora();
    }
    
    public String getNomePaciente()
    {
        return this.nomePaciente;
    }
    
    public String getNomeMedico()
    {
        return this.nomeMedico;
    }

    public static void main(String[] args) {

        {
            ConsultaAgendada p1 = new ConsultaAgendada(8, 50, 30, 23, 7, 2021, "Vitor", "Antonio");
            System.out.println("------------------- P1 -----------------------");
            System.out.println(p1.getData());
            System.out.println(p1.getHora());
            System.out.println( p1.getNomePaciente());
             System.out.println( p1.getNomeMedico());
            System.out.println("----------------------------------------------");

            ConsultaAgendada p2 = new ConsultaAgendada();
             System.out.println("------------------- P2 -----------------------");
            System.out.println(p2.getData());
            System.out.println(p2.getHora());
            System.out.println( p2.getNomePaciente());
             System.out.println( p2.getNomeMedico());
            System.out.println("----------------------------------------------");

            
            System.out.println("------------------- P1 -----------------------");
            System.out.println(p1.getData());
            System.out.println(p1.getHora());
            System.out.println( p1.getNomePaciente());
             System.out.println( p1.getNomeMedico());
            System.out.println("----------------------------------------------");
            p1.setData();
            p1.setHora();
            p1.setNomePaciente();
            p1.setNomeMedico();
            System.out.println("Quantidade de consultas: " + quantidade);
            
        }

    }

}
