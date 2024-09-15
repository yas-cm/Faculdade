import java.util.Arrays;
import java.util.Scanner;

public class CliParabola {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            // Solicitando os coeficientes da parábola
            System.out.print("Digite o coeficiente da equação da parábola a: ");
            double a = leitor.nextDouble();
            System.out.print("Digite o coeficiente da equação da parábola b: ");
            double b = leitor.nextDouble();
            System.out.print("Digite o coeficiente da equação da parábola c: ");
            double c = leitor.nextDouble();

            // Criando o objeto Parabola
            Parabola parabola = new Parabola(a, b, c);

            // Exibindo a equação
            System.out.println("Equação da parábola: " + parabola.printar());

            // Calculando e exibindo os zeros da parábola
            double[] zeros = parabola.zeros();
            if (zeros == null) {
                System.out.println("A parábola não tem soluções reais (zeros).");
            } else {
                System.out.println("Zeros da parábola: " + Arrays.toString(zeros));
            }

            // Solicitando um valor de x para calcular y
            System.out.println("Digite um valor para x para calcular y:");
            double x = leitor.nextDouble();
            System.out.println("O valor de y para x = " + x + " é: " + parabola.calcularY(x));

            // Calculando a derivada em um dado ponto x
            System.out.println("A derivada em x = " + x + " é: " + parabola.calcularDerivada(x));

            // Determinando o ponto de mínimo ou máximo
            double[] extremo = parabola.MinMax();
            System.out.println("O ponto de extremo é em x = " + extremo[0] + ", y = " + extremo[1]);

            // Solicitando um intervalo para calcular a integral
            System.out.print("Digite o intervalo x1 para calcular a integral: ");
            double x1 = leitor.nextDouble();
            System.out.print("Digite o intervalo x2 para calcular a integral: ");
            double x2 = leitor.nextDouble();
            System.out.println("O valor da integral da parábola no intervalo [" + x1 + ", " + x2 + "] é: " + parabola.calcularIntegral(x1, x2));

       
        leitor.close();
    }
}
