//    Construa um programa Java que, considerando os n
// primeiros inteiros positivos, realize a soma de todos
// aqueles que são múltiplos de um outro número inteiro
// positivo dado, m.
public class ex4{
   public static void main(String[] args){
   
      int n = Integer.parseInt(args[0]); // n = 30
      int m = Integer.parseInt(args[1]); // m = 4
      
      int soma = 0, i = 1, mult;

      System.out.println("Multiplos de "+m);
      while(i < n){
         if(m * i <= n){
            mult = m * i;
            System.out.print(mult+" ");
            soma = soma + mult;
            i++;
         } else i++;
      }
      System.out.println("\nSoma dos numeros ate "+n+" multiplos de "+m+" = "+soma);
   }
}