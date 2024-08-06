// Programa que recebe dois números distintos e informa qual
// é o maior entre eles.
public class exemploIf{
   public static void main(String[] args) {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("Numeros fornecidos: "+a+" e "+b+".");
      if (a>b) // Comando análogo ao da linguagem C.
      System.out.println("O maior eh "+a+".");
      else
      System.out.println("O maior eh "+b+".");
   }
}