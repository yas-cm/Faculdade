// Nos mesmos moldes dos exemplos para as classes
// anteriores, criar a classe triângulo (com cálculo também
// de área e perímetro: usar a fórmula de Heron para a área),
// e a respectiva classe cliente para teste.
// Validar os dados de entrada (medidas dos lados dos triângulos): todos
// devem ser positivos e devem poder formar um triângulo
// (validação no construtor).

class Triangulo{
   private double la;
   private double lb;
   private double lc;

   public Triangulo(double a, double b, double c){
      setLados(a,b,c);
   }
   
   public void setLados(double a, double b, double c){
      if((a <= 0) || (b <= 0) || (c <- 0)){
         System.out.println("Lado =< 0. Programa encerrado");
         System.exit(1);
      } else if (((a + b) < c)||((b + c) < a)||((a + c) < b)){
         System.out.println("Os lados informados nao formam um triangulo. Programa encerrado");
         System.exit(1);
      } else {
         la = a;
         lb= b;
         lc = c;
      }
   }
   
   public double getLa() {return la;}
   public double getLb() {return lb;}
   public double getLc() {return lc;}
   public double area() {
      double p = (la + lb + lc)/2;
      return Math.sqrt(p*(p-la)*(p-lb)*(p-lc));
   }
   public double perimetro() {return la+lb+lc;}
}