import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Float polegada,milimetros;
        System.out.println("digite o comprimento em polegadas:");
        polegada=scanner.nextFloat();
        milimetros=polegada * 25.4f;

        System.out.printf("%.1f polegadas equivalem a %.1f milímetros:",polegada,milimetros);


    }
}
