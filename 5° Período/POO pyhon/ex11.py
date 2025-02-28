

#  Escreva em Python uma classe Conta que contenha o nome do cliente, o número da
# conta, o saldo, seu salário mensal e o limite de saque.
# Estes valores deverão ser informados no construtor, sendo que o limite não
# poderá ser maior que o valor do salário mensal do cliente (corrigir automaticamente).
# Faça um método deposito e um método retira. O método
# retira irá devolver true ou false dependendo se o cliente pode retirar (saque deve ser menor
# que o menor entre limite e saldo). Faça um método saldo que retorne o saldo do cliente, e
# outro que imprima todos os dados do cliente. Crie um programa de teste que use todos os
# métodos da classe.

class Conta:
    def __init__(self,a, b, c, d, e):
        self._nome = a
        self._conta = b
        self._saldo = c
        self._salario = d
        self._limite = e
