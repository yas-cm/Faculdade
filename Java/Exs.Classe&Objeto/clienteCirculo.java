public class clienteCirculo{
   public static void main(String[] args) {
   Circulo c1 = new Circulo(1); // Primeiro objeto circulo.
   Circulo c2 = new Circulo(2); // Segundo objeto circulo.
   System.out.println("Raio C1.....: " + c1.getRaio());
   System.out.println("Perimetro C1: " + c1.perimetro());
   System.out.println("Area C1.....: " + c1.area());
   
   System.out.println("\nRaio C2.....: " + c2.getRaio());
   System.out.println("Perimetro C2: " + c2.perimetro());
   System.out.println("Area C2.....: " + c2.area());
   c2.setRaio(4);
   System.out.println("\nRaio C2.....: " + c2.getRaio());
   System.out.println("Perimetro C2: " + c2.perimetro());
   System.out.println("Area C2.....: " + c2.area());
   Circulo c3 = new Circulo(-2); // Terceiro objeto circulo.
   }
}