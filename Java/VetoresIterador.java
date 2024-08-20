// Iterador vai percorrer o vetor

public class VetoresIterador{
   public static void main(String[] args) {
   int k,j;
   int[] vet=new int[10]; // Elementos iguais a zero.
   
   for(k=0;k<10;k++)
      vet[k]=(int)Math.pow(k+1,2); // Redefine valores.
   
   for(int v:vet) // Uso do iterador v.
      System.out.print(v+" "); 
      
   // Redefine o vetor vet.
   vet=new int[5]; // Elementos iguais a zero.
   System.out.println();
   for(int v:vet) // Uso do iterador v.
      System.out.print(v+" ");
   }
}