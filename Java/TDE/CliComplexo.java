import java.util.Scanner;

public class CliComplexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // z1
        System.out.print("Parte real de z1: ");
        double real1 = scanner.nextDouble();
        System.out.print("Parte imaginaria de z1: ");
        double imaginario1 = scanner.nextDouble();

        // adiciona z1 na classe Complexo
        Complexo c1 = new Complexo(real1, imaginario1);

        // z2
        System.out.print("Parte real de z2: ");
        double real2 = scanner.nextDouble();
        System.out.print("Parte imaginaria de z2: ");
        double imaginario2 = scanner.nextDouble();

        // adiciona z2 na classe Complexo
        Complexo c2 = new Complexo(real2, imaginario2);

        // operacoes
        Complexo soma = c1.somar(c2);
        Complexo subtracao = c1.subtrair(c2);
        Complexo multiplicacao = c1.multiplicar(c2);
        Complexo divisao = c1.dividir(c2);

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);

        
    }
}
