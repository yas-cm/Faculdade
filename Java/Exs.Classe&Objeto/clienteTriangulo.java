public class clienteTriangulo{
   public static void main(String[] args) {
      Triangulo t1 = new Triangulo(12,15,21);
      System.out.println("Lado a.....: " + t1.getLa());
      System.out.println("Lado b.....: " + t1.getLb());
      System.out.println("Lado c.....: " + t1.getLc());
      System.out.println("Area.....: " + t1.area());
      System.out.println("Perimetro.....: " + t1.perimetro());

   }
}