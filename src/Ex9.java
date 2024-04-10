import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mulher,crianca,homem,total;

        System.out.println("digite o numero de mulheres:");
        mulher= scanner.nextInt();
        System.out.println("digite o numero de crinças:");
        crianca= scanner.nextInt();
        System.out.println("digite o numero de homens:");
        homem= scanner.nextInt();

        total = total (homem, mulher, crianca);

        double totalCarneQuilos = total / 1000.0;

        System.out.println("Quantidade total de carne necessária: " + totalCarneQuilos + " kg");
    }

    public static int total(int homens, int mulheres, int criancas) {

        int carneHomens = homens * 650;
        int carneMulheres = mulheres * 420;
        int carneCriancas = criancas * 290;

        return carneHomens + carneMulheres + carneCriancas;
    }
    }

