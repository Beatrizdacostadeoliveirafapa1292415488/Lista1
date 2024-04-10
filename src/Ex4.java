import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        int x,quadradox,resto3;
        System.out.println("digite o valor o numero:");
        x= leitor.nextInt();
        System.out.println("O valor de X é: " + x);

        quadradox=x*x;
        System.out.println("o quadrado de de x e: "+quadradox);

        resto3=x % 3;
        System.out.println("o resto da diviso por 3 e:");

        float metade,produto;

        metade=x/2;
        System.out.println("a metade de x e"+metade);

        produto=x*metade;
        System.out.println("o resultado é:");
    }
}
