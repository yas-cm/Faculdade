class Circulo{
   private static double PI=Math.PI; // Fica o mesmo valor
   private double raio; // Nao eh o mesmo raio pra todos, por isso n eh static
   
   public Circulo(double r) { // Construtor (mesmo nome da classe)
      setRaio(r); // Define o raio
   } 
   
   public void setRaio(double r){ // Outro jeito de pegar o valor do raio (modificador).
      if (r>=0) 
         raio = r;
      else {
         System.out.println("Programa encerrado: raio < 0!"); // Para o programa
         System.exit(1);
      }
   }
   public double getRaio() {return raio;} // Getter (acessor).
   public double area() {return PI*raio*raio;}
   public double perimetro() {return 2*PI*raio;}
}

