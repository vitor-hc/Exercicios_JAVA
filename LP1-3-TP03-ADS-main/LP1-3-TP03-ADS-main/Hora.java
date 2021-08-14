import java.util.Scanner;

public class Hora {

    Scanner ler = new Scanner(System.in);

    private int hora;
    private int min;
    private int seg;

    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public void setHor(int h) {
        this.hora = h;
    }

    public void setMin(int m) {
        this.min = m;
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

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        String hr = ""+this.hora, min = ""+this.min, seg = ""+this.seg;

        if(this.hora < 10) {
            hr = "0"+this.hora;
        }
        if(this.min < 10) {
            min = "0"+this.min;
        }
        if(this.seg < 10) {
            seg = "0"+this.seg;
        }

        return (hr + ":" + min + ":" + seg);
    }

    public String getHora2() {
        String hr = ""+this.hora, min = ""+this.min, seg = ""+this.seg, periodo = "AM";
        int hr2 = this.hora;

        if (this.hora >= 12) {
            periodo = "PM";
            if(this.hora > 12) {
                hr2 = this.hora - 12;
            } 
        }
        if (hr2 < 10) {
            hr = "0" + hr2;
        }
        if (this.min < 10) {
            min = "0" + this.min;
        }
        if (this.seg < 10) {
            seg = "0" + this.seg;
        }

        return hr + ":" + min + ":" + seg + " (" + periodo + ")";
    }

    public int getSegundos() {
        return (this.hora * 3600) + (this.min * 60) + this.seg;
    }

    public static void main(String[] args)
    {
        Hora hora1 = new Hora(12, 5, 39);
        System.out.println("Horario hora1: "+hora1.getHora1());

        hora1.setHor(9);
        hora1.setMin(50);
        hora1.setSeg(2);
        System.out.println("Novo horario hora1: "+hora1.getHora1());

        Hora hora = new Hora();

        System.out.println("Hora: "+hora.getHor()+" Min: "+hora.getMin()+" Seg: "+hora.getSeg());
        System.out.println("Horario AM/PM: "+hora.getHora2());
        System.out.println("Horario: "+hora.getHora1());
        System.out.println("Total em segundos: "+hora.getSegundos());
    }
}
