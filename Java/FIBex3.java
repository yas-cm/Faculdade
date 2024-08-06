//    Construa um programa Java que imprima os n primeiros
// termos da série de Fibonacci.
//    Se n for 10, então a série é:
// 1 1 2 3 5 8 13 21 34 55.

public class FIBex3{
   public static void main(String[] args){
      int n = Integer.parseInt(args[0]);
      int aux2 = 0, fibo = 1, k, aux = 1;
      //System.out.println(i);
      
      for(k = 0; k < n; k++){
         System.out.println(fibo);
         fibo = aux + aux2;
         aux2 = aux;
         aux = fibo;
        
      }     
   }
}