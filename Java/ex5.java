// Construa um programa Java que, considerando os n
// primeiros inteiros positivos, realize a soma de todos
// aqueles que são primos.

public class ex5{
   public static void main(String[] args){
   
   int n = Integer.parseInt(args[0]);
   
   int i = 1, j;
   while(i < n){
      for(j = 2; j < n; j ++){
         if(j != i && i % j == 0) System.out.print("Nao primo");
      
      
      
         }
         
      }
      
      
      
   }
}