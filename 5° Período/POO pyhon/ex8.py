# Escrever a classe Retangulo de lados a e b em python.
# Os métodos deverão ser: construtor, área, perímetro e
# __str__, esse último tal que realize a impressão na forma
# "a=?; b=?; per=?; area=?". Utilizar um cliente para teste
# que crie um objeto retângulo com valores para seus lados
# e imprima seu perímetro e sua área.

class Retangulo:
    def __init__(self,a,b):
        self._a = a
        self._b = b
    def per(self):
        return 2*(self._a + self._b)
    def area(self):
        return self._a * self._b
    def __str__(self):
        return f'a = {self._a}; b = {self._b}; per = {self.per()}; area = {self.area()}'

r = Retangulo(2,3)
print(r)