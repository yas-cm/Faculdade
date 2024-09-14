public class Complexo {
    private double real;
    private double imaginario;

    // Construtor
    public Complexo(double r, double i) {
        real = r;
        imaginario = i;
    }

    // somar
    public Complexo somar(Complexo z2) { // Dentro do metodo ele vai chamar o z2 (que tambem eh do tipo complexo)
        double parteReal = real + z2.real;
        double parteImaginaria = imaginario + z2.imaginario;
        return new Complexo(parteReal, parteImaginaria); // Vai retornar um novo objeto complexo (a soma dos dois)
    }

    // subtrair
        public Complexo subtrair(Complexo z2) {
        double parteReal = real - z2.real;
        double parteImaginaria = imaginario - z2.imaginario;
        return new Complexo(parteReal, parteImaginaria);
    }

    // multiplicar
    public Complexo multiplicar(Complexo z2) {
        double parteReal = (real * z2.real) - (imaginario * z2.imaginario);
        double parteImaginaria = (real * z2.imaginario) + (imaginario * z2.real);
        return new Complexo(parteReal, parteImaginaria);
    }

    // dividir
    public Complexo dividir(Complexo z2) {
        double denominador = z2.real * z2.real + z2.imaginario * z2.imaginario;
        double parteReal = (real * z2.real + imaginario * z2.imaginario) / denominador;
        double parteImaginaria = (imaginario * z2.real - real * z2.imaginario) / denominador;
        return new Complexo(parteReal, parteImaginaria);
    }

    // Método para exibir o número complexo
 
    public String toString() { // Mesma logica da tostring do pbjl
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + (-imaginario) + "i";
        }
    }
}
