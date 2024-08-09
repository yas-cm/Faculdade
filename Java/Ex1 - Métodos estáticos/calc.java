public class calc{
   static double soma(double a, double b){
      return a + b;   
   }
   static double sub(double a, double b){
      return a - b;   
   }
   static double mult(double a, double b){
      return a * b;
   }
   static double div(double a, double b){
   if(b == 0){
      System.out.println("Divisao por 0! Programa encerrado");
      System.exit(1);   
      }
   return a / b;
   }
}