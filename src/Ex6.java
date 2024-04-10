import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Float grauf,grauc;

        System.out.println("digite a temperatura em fahrenheit:");
        grauf=  scanner.nextFloat();

        grauc= (5*(grauf-32))/9;

        System.out.printf("graus Fahrenheit correspondem a %.1f graus Celsius\n",grauf,grauc);

    }
}
