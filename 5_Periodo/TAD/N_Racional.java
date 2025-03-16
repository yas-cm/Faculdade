public class N_Racional {
    private int n;
    private int d;

    public void N_Rac_cria(int numerador, int denominador) {
        if (denominador != 0) {
            this.n = numerador;
            this.d = denominador;
        } else {
            System.out.println("ERRO! DIVISAO POR 0");
            this.n = 0;
            this.d = 1;
        }
    }

    public void N_Rac_simplifica() {
        int mdc = mdc(Math.abs(n), Math.abs(d));
        n /= mdc;
        d /= mdc;
    }

    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public N_Racional N_Rac_soma(N_Racional q) {
        N_Racional resultado = new N_Racional();
        resultado.N_Rac_cria(
            this.n * q.d + q.n * this.d,
            this.d * q.d
        );
        resultado.N_Rac_simplifica();
        return resultado;
    }

    public N_Racional N_Rac_subtrai(N_Racional q) {
        N_Racional resultado = new N_Racional();
        resultado.N_Rac_cria(
            this.n * q.d - q.n * this.d,
            this.d * q.d
        );
        resultado.N_Rac_simplifica();
        return resultado;
    }

    public N_Racional N_Rac_multiplica(N_Racional q) {
        N_Racional resultado = new N_Racional();
        resultado.N_Rac_cria(
            this.n * q.n,
            this.d * q.d
        );
        resultado.N_Rac_simplifica();
        return resultado;
    }

    public N_Racional N_Rac_divide(N_Racional q) {
        N_Racional resultado = new N_Racional();
        if (q.n != 0) {
            resultado.N_Rac_cria(
                this.n * q.d,
                this.d * q.n
            );
            resultado.N_Rac_simplifica();
        } else {
            System.out.println("ERRO! DIVISAO POR 0");
            resultado.N_Rac_cria(0, 1);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return n + "/" + d;
    }
}
