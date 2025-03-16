# Criar a estrutura/classe N_Racional e testá-la através de um
# programa cliente.

class N_Racional:
    def __init__(self,n=0,d=1):
        if(d != 0):
            self._n = n
            self._d = d
        else:
            print('ERRO! DIVISAO POR 0')
            return 0

    def N_Rac_simplifica(self):
        divisoresd = []
        divisoresn = [] 
        for i in range (self._d,0,-1):
            if (self._d % i == 0):
                divisoresd.append(self._d/i)

        for j in range (self._n,0,-1):
            if (self._n % j == 0):
                divisoresn.append(self._n/j)
        
        
        for elemento in divisoresd[::-1]:
            if elemento in divisoresn:
                self._d = self._d/elemento
                self._n = self._n/elemento
                
                return self
    
    def __add__(self, q):
        valor = N_Racional()
        valor._d = self._d * q._d
        valor._n = round((self._n * valor._d/self._d) + (q._n * valor._d/q._d))
        valor.N_Rac_simplifica()
        return valor
    
    def __sub__(self, q):
        valor = N_Racional()
        valor._d = self._d * q._d
        valor._n = round((self._n * valor._d/self._d) - (q._n * valor._d/q._d))
        if(valor._n == 0):
            valor._d = 1
        valor.N_Rac_simplifica()
        return valor
    
    def __mul__(self, q):
        valor = N_Racional()
        valor._d = self._d * q._d
        valor._n = self._n * q._n
        valor.N_Rac_simplifica()
        return valor
    
    def __truediv__(self, q):
        valor = N_Racional()
        if(self._d != 0 and q._d != 0):
            valor._d = self._d*q._n
            valor._n = self._n*q._d
            valor.N_Rac_simplifica()
            return valor
        else:
            print('ERRO! DIVISAO POR 0')
            return 0
    
    
    
    def __str__(self):
        return f'{int(self._n)}/{int(self._d)}'

### main ###
q1 = N_Racional(1,3)
q2 = N_Racional(7,21)


print("---\nq1 = ",q1,"; q2 = ",q2,"\n---")
print(q1," + ",q2," = ",q1 + q2)
print(q1," - ",q2," = ",q1 - q2)
print(q1," * ",q2," = ",q1 * q2)
print(q1," / ",q2," = ",q1 / q2)