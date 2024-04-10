import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        int num1,num2,num3,produto;

        System.out.println("digite o primeiro numero:");
        num1= leitor.nextInt();
        System.out.println("digite o segundo numero:");
        num2= leitor.nextInt();
        System.out.println("digite o terceiro numero:");
        num3= leitor.nextInt();

        produto= num1+num2+num3;

    }
}
