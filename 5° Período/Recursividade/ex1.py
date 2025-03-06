# Escreva uma função que calcule recursivamente 3𝑛, 𝑛
# natural (0, 1, 2, 3, 4, ...). Testar a função.

def funcao(n,i):
    if (i == 0):
        return 0
    else:    
        return n + funcao(n,i-1)

n = 10
i = 3
print(f'{i}*{n} = {funcao(n,i)}')