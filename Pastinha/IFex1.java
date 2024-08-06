// Escrever uma programa em Java que receba por linha de
// comando 3 valores distintos e informe qual é o maior
// deles.

public class IFex1{
   public static void main(String[] args){
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      
      if (a > b && a > c) System.out.println("O maior eh "+a+".");
      else if (b > a && b > c) System.out.println("O maior eh "+b+".");
      else System.out.println("O maior eh "+c+".");
   }
}