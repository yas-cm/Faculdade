public class Parabola {
    // Coeficientes da equação da parábola: ax^2 + bx + c
    private double a, b, c;

    // Construtor
    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para atribuir valores aos coeficientes
    public void setCoeficientes(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método para exibir a parábola no formato "ax^2 + bx + c"
    public String printar() {
        return a + "x^2 + " + b + "x + " + c;
    }

    // Método para calcular os zeros da parábola (solução da equação de segundo grau)
    public double[] zeros() {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return null; // Sem solução real
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[]{x}; // Uma solução real
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2}; // Duas soluções reais
        }
    }

    // Método para calcular o valor de y em um dado ponto x
    public double calcularY(double x) {
        return a * x * x + b * x + c;
    }

    // Método para calcular a derivada em um dado ponto x
    public double calcularDerivada(double x) {
        return 2 * a * x + b;
    }

    // Método para determinar o ponto de mínimo/máximo
    public double[] MinMax() {
        double x = -b / (2 * a);
        double y = calcularY(x);
        if (a > 0) {
            System.out.println("A parábola tem um ponto de mínimo.");
        } else {
            System.out.println("A parábola tem um ponto de máximo.");
        }
        return new double[]{x, y};
    }

    // Método para calcular a integral da parábola em um intervalo [x1, x2]
    public double calcularIntegral(double x1, double x2) {
        double integralX2 = (a / 3) * (Math.pow(x2, 3) - Math.pow(x1, 3));
        double integralX1 = (b / 2) * (Math.pow(x2, 2) - Math.pow(x1, 2));
        double integralX0 = c * (x2 - x1);
        return integralX2 + integralX1 + integralX0;
    }
}
