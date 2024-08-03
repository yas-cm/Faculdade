public class soma2{
   public static void main(String[] args) {
      // Conversão dos argumentos (sempre Strings) para inteiros.
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      // Conversão dos argumentos para reais.
      // double a = Double.parseDouble(args[0]);
      // double b = Double.parseDouble(args[1]);
      System.out.println(a+" + "+b+" = "+(a+b));
   }
}
// Para rodar precisa habilitar o argumento (jGrasp)
