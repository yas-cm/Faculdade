#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int n;  // numerador
    int d;  // denominador
} N_Racional;

void inicializa(N_Racional* r, int n, int d) {
    if (d != 0) {
        r->n = n;
        r->d = d;
    } else {
        printf("ERRO! DIVISAO POR 0\n");
        r->n = 0;
        r->d = 1;
    }
}

void simplifica(N_Racional* r) {
    int i, divisor_comum;
    for (i = (r->d < r->n ? r->d : r->n); i >= 1; i--) {
        if (r->n % i == 0 && r->d % i == 0) {
            divisor_comum = i;
            break;
        }
    }
    r->n /= divisor_comum;
    r->d /= divisor_comum;
}

N_Racional soma(N_Racional r1, N_Racional r2) {
    N_Racional resultado;
    resultado.d = r1.d * r2.d;
    resultado.n = r1.n * r2.d + r2.n * r1.d;
    simplifica(&resultado);
    return resultado;
}

N_Racional subtrai(N_Racional r1, N_Racional r2) {
    N_Racional resultado;
    resultado.d = r1.d * r2.d;
    resultado.n = r1.n * r2.d - r2.n * r1.d;
    if (resultado.n == 0) {
        resultado.d = 1;  // para garantir que o denominador seja 1
    }
    simplifica(&resultado);
    return resultado;
}

N_Racional multiplica(N_Racional r1, N_Racional r2) {
    N_Racional resultado;
    resultado.n = r1.n * r2.n;
    resultado.d = r1.d * r2.d;
    simplifica(&resultado);
    return resultado;
}

N_Racional divide(N_Racional r1, N_Racional r2) {
    N_Racional resultado;
    if (r2.n != 0) {
        resultado.n = r1.n * r2.d;
        resultado.d = r1.d * r2.n;
        simplifica(&resultado);
        return resultado;
    } else {
        printf("ERRO! DIVISAO POR 0\n");
        resultado.n = 0;
        resultado.d = 1;
        return resultado;
    }
}

void imprime(N_Racional r) {
    printf("%d/%d", r.n, r.d);
}

int main() {
    N_Racional q1, q2, resultado;
    
    inicializa(&q1, 1, 3);
    inicializa(&q2, 7, 21);

    printf("---\nq1 = ");
    imprime(q1);
    printf("; q2 = ");
    imprime(q2);
    printf("\n---\n");

    resultado = soma(q1, q2);
    printf("q1 + q2 = ");
    imprime(resultado);
    printf("\n");

    resultado = subtrai(q1, q2);
    printf("q1 - q2 = ");
    imprime(resultado);
    printf("\n");

    resultado = multiplica(q1, q2);
    printf("q1 * q2 = ");
    imprime(resultado);
    printf("\n");

    resultado = divide(q1, q2);
    printf("q1 / q2 = ");
    imprime(resultado);
    printf("\n");

    return 0;
}
