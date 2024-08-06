// Escrever uma programa em Java que receba por linha de
// comando 3 valores distintos e informe qual é o valor
// intermediário entre eles.

public class IFex2{
   public static void main(String[] args){
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      
      if ((a > b && a < c) || (a < b && a > c)) System.out.println("O do meio eh "+a+".");
      else if ((b > a && b < c) || (b < a && b > c)) System.out.println("O do meio eh "+b+".");
      else System.out.println("O do meio eh "+c+".");
   }
}