# Escrever a classe Complexo de parte real a e parte imaginária b. Os métodos deverão ser:
# construtor (a, b padrão nulos), soma, subtração e multiplicação, os três últimos
# implementados como operadores (métodos __add__, __sub__ e __mul__, respectivamente).
# Definir também o método __str__. Escrever cliente para teste que execute essas três
# operações sobre dois números complexos dados, c1 e c2. 

# a = self._a / b = self._b / c = c._a / d = c._b

class Complexo:
    def __init__(self,a=0,b=0):
        self._a = a
        self._b = b
    def __add__(self,c):
        s=Complexo()
        s._a = self._a + c._a
        s._b = self._b + c._b
        return s
    def __sub__(self,c):
        s=Complexo()
        s._a = self._a - c._a
        s._b = self._b - c._b
        return s
    def __mul__(self,c):
        s=Complexo()
        s._a = (self._a * c._a) - (self._b * c._b)
        s._b = (self._a * c._b) + (self._b * c._a)
        return s
    # (a + bi)(c - di)
    # (c + di)(c - di)
    # a = self._a / b = self._b / c = c._a / d = c._b
    def __truediv__(self,c):
        s=Complexo()
        i = (c._a**2) + (c._b**2)
        if i > 0:
            s._a = round((self._a*c._a + self._b*c._b)/i,2)
            s._b = round((self._b*c._a - self._a*c._b)/i,2)
            return s
        else:
            return f'INDETERMINACAO'
    def __str__(self):
         return f'{self._a} + {self._b}i'


c1 = Complexo(3,4)
c2 = Complexo(1,1)
c = c1 + c2
d = c1 - c2
e = c1 * c2
f = c1 / c2
print(f"Soma = {c}")
print(f"Sub = {d}")
print(f"Mult = {e}")
print(f"Div = {f}")
