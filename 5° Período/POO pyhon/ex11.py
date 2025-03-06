#  Escreva em Python uma classe Conta que contenha o nome do cliente, o número da
# conta, o saldo, seu salário mensal e o limite de saque.
# Estes valores deverão ser informados no construtor, sendo que o limite não
# poderá ser maior que o valor do salário mensal do cliente (corrigir automaticamente).

# Faça um método deposito e um método retira. O método retira irá devolver 
# true ou false dependendo se o cliente pode retirar (saque deve ser menor
# que o menor entre limite e saldo).
# Faça um método saldo que retorne o saldo do cliente,
# e outro que imprima todos os dados do cliente.
# Crie um programa de teste que use todos os métodos da classe.

class Conta:
    def __init__(self,a, b, c, d, e):
        self._nome = a
        self._conta = b
        self._saldo = c
        self._salario = d
        self._limite = e
        if (self._limite > self._salario):
            self._limite = self._salario
    def deposito(self, valor):
        self._saldo = self._saldo + valor
        return self._saldo + valor
    def retira(self, valor):
        if ((valor <= self._saldo) and (valor <= self._limite)):
            self._saldo = self._saldo - valor
            return self._saldo
        else:
            return False
    def saldo(self):
        return self._saldo
    def __str__(self):
        return f'---\nNome: {self._nome}\nConta: {self._conta}\nSaldo: {self._saldo}\nSalario: {self._salario}\nLimite: {self._limite}\n---'
    
conta1 = Conta('Joao',12345,1000.0,1200,500)
print(conta1.retira(500))
print(conta1.retira(800))
print(conta1.deposito(200))
print(conta1.saldo())
print(conta1)
