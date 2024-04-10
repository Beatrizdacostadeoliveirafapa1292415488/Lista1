import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float raio,area;


        System.out.println("digite o raio do circulo:");
        raio= scanner.nextFloat();
        area=3.1415592f* raio * raio;
        System.out.printf("A área do círculo com raio %.2f é %.2f\n", raio, area);

    }
}
