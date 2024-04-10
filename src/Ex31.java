import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        float num1,num2,num3,num4,media;

        System.out.println("digite o primeiro numero:");
        num1= leitor.nextFloat();
        System.out.println("digite o segundo numero:");
        num2= leitor.nextFloat();
        System.out.println("digite o terceiro numero:");
        num3= leitor.nextFloat();
        System.out.println("digite o quarto numero:");
        num4= leitor.nextFloat();

         media= ((num1+num2+num3+num4)/4);

        System.out.printf("a media arithmetic e: %.2f",media);
    }
}
