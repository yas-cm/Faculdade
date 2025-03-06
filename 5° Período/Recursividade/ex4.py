# Escreva uma função que inverta uma frase
# recursivamente. Testar a função. Exemplo: de “pedro
# silva” para “avlis ordep”.
# Dica para Python:
# s="abcde"
# print(s[1:]) # Imprime "bcde".
# print(s[0]) # Imprime "a".

def funcao(s):
    tam = len(s) - 1
    if (tam < 0):
        return '' # Return 0 da errado 
    else:
        return s[tam] + funcao(s[:tam])

s = "Yasmin Cardoso"
print(funcao(s))
