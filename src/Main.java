import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args){
        DecimalFormat df = new DecimalFormat("#,###.00");
        int idade    = 18;
        int dias     = idade * 365;
        int horas    = dias * 24;
        int minutos  = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Você já viveu aproximadamente: ");
        System.out.println(df.format(dias) + " Dias");
        System.out.println(df.format(horas) + " Horas");
        System.out.println(df.format(minutos) + " Minutos");
        System.out.println(df.format(segundos) + " Segundos");
    }
}
