import java.util.Scanner;

public final class Hora {

    Scanner ler = new Scanner(System.in);
    
    private int hora;
    private int min;
    private int seg;

    public Hora() {

    }

    public Hora(int h, int mi, int s) {
        this.hora = h;
        this.min = mi;
        this.seg = s;
    }
    
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHor(int h) {
        this.hora = h;
    }

    public void setMin(int mi) {
        this.min = mi;
    }

    public void setSeg(int s) {
        this.seg = s;
    }
 
    public void setHor() {
        do {
            
            System.out.println("Digite a hora: ");
            hora = ler.nextInt();
        } while (hora > 24 || hora < 0);
       
    }

    public void setMin() {
        do {
            System.out.println("Digite os minutos: ");
            min = ler.nextInt();
        } while (min > 60 || min < 0);

    }

    public void setSeg() {
        do {
            System.out.println("Digite os segundos: ");
            seg = ler.nextInt();
        } while (seg > 60 || seg < 0);

    }

    public String getHora() {
        String periodo;
         if (this.hora < 12) {
            periodo = "AM";
        } else {

            periodo = "PM";
        }
        String hr1 = (this.hora + ":" + this.min + ":" + this.seg + "(" + periodo + ")");
        return hr1;
    }

   public static void main(String[] args)
    {
        Hora hora = new Hora ();
        hora.getHora();
    }
}