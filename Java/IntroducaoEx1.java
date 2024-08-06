public class IntroducaoEx1{
   public static void main(String[] args) {
      int raio = Integer.parseInt(args[0]);
      double area = Math.PI * raio * raio;
      double perimetro = Math.PI * 2 * raio;
      
      System.out.println("Area -> "+area);
      System.out.println("Perimetro -> "+perimetro);
   }
}
