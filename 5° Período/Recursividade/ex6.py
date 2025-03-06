# Faça uma função recursiva que receba um número inteiro
# positivo 𝑛 e imprima todos os números ímpares de 0 até
# 𝑛 em ordem crescente. Testar a função.

def funcao(n):
    if (n == 1):
        return 1
    else:
        if (n % 2 != 0):
            print(n)
            return funcao(n-2)
        else:
            return funcao(n-1)
        
print(funcao(14))


