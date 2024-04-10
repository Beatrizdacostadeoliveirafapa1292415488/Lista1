import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        int num1,num2,num3,num4;

        System.out.println("digite o primeiro numero:");
        num1= leitor.nextInt();
        System.out.println("digite o segundo numero:");
        num2= leitor.nextInt();
        System.out.println("digite o terceiro numero:");
        num3= leitor.nextInt();
        System.out.println("digite o quarto numero:");
        num4= leitor.nextInt();

        float media= (float) ((num1+num2+num3+num4)/4);

        System.out.printf("a media arithmetic e: %.2f",media);

    }
}
