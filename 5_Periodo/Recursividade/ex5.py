# Faça uma função recursiva que receba um número inteiro
# positivo 𝑛 e imprima todos os números pares de 0 até 𝑛
# em ordem decrescente. Testar a função.

def funcao(n):
    if (n == 0):
        return 0
    else:
        if (n % 2 == 0):
            print(n)
            return funcao(n-2)
        else:
            return funcao(n-1)
        
print(funcao(7))