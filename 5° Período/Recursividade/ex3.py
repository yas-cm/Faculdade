# Escreva fuma função que calcule recursivamente o
# somatório 𝑠 = 1³ + 2³ + 3³ + ⋯ + (𝑛 − 1)³ + 𝑛³, 𝑛
# natural. Testar a função.


def funcao(n):
    if (n == 0):
        return 0
    else:
        return n**3 + funcao(n-1)
    
print(f'-> {funcao(3)}')