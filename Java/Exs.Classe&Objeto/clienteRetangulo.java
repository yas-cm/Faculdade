public class clienteRetangulo{
   public static void main(String[] args) {
      Retangulo r1 = new Retangulo(5.0, 10.0); 
      Retangulo r2 = new Retangulo(2.0, 5.0); 
      System.out.println("Altura R1.....: " + r1.getAltura());
      System.out.println("Largura R1.....: " + r1.getLargura());
      System.out.println("Area.....: " + r1.area());
      System.out.println("Perimetro.....: " + r1.perimetro());
      r2.setLargura(20);
      System.out.println("Altura R2.....: " + r2.getAltura());
      System.out.println("Largura R2.....: " + r2.getLargura());
      System.out.println("Area.....: " + r2.area());
      System.out.println("Perimetro.....: " + r2.perimetro());
   }
}
