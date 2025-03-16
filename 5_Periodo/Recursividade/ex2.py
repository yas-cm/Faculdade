# Escreva fuma função que calcule recursivamente o
# somatório 𝑠 = 1 + 2 + 3 + ⋯ + 𝑛 − 1 + 𝑛, 𝑛 natural.
# Testar a função.

def funcao(n):
    if (n == 0):
        return 0
    else:
        return n + funcao(n-1)
    
print(f'-> {funcao(5)}')