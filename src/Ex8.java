import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora,minutos,segundo,total;

        System.out.println("digite a hora:");
        hora= scanner.nextInt();
        System.out.println("digite o minuto:");
        minutos= scanner.nextInt();
        System.out.println("digite o segund:");
        segundo= scanner.nextInt();

         total = calcularTotalSegundos(hora, minutos, segundo);

        System.out.println("Total de segundos decorridos: " + total);
    }

    public static int calcularTotalSegundos(int horas, int minutos, int segundos) {
        return (horas * 60 * 60) + (minutos * 60) + segundos;





    }
}
