// Nos mesmos moldes do
// exemplo para a classe
// círculo, criar a classe
// retângulo que calcula
// área
// perímetro
// respectiva classe cliente
// para teste

class Retangulo{
   private double largura;
   private double altura;
   
   public Retangulo(double l, double a){
      setLargura(l);
      setAltura(a);
   }
   
   public void setLargura(double l){ 
      if (l>=0){
         largura = l;
      } else {
         System.out.println("Programa encerrado: lagura < 0!"); 
         System.exit(1);
      }
   }
   
    public void setAltura(double a){ 
      if (a>=0){
         altura = a;
      } else {
         System.out.println("Programa encerrado: altura < 0!"); 
         System.exit(1);
      }
   }
   

   public double getLargura() {return largura;}
   public double getAltura() {return altura;}
   public double area() {return largura*altura;}
   public double perimetro() {return 2*(largura+altura);}
   
}