public class misc{
   public static int primo(int a){
      int i;
      System.out.println("Teste se eh primo:");
      for(i = 2; i < a; i ++){
         if(a % i == 0) return 0;
         }
      return 1;
   } 
   
   public static int pares(int a, int b){
      int i, cont = 0;
      System.out.println("Pares: ");
      for(i = a; i <=b; i ++){
         if(i % 2 == 0) cont = cont + 1;
         }     
      return cont; 
   }
   
   
}