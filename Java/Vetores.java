public class Vetores{
   public static void main(String[] args) {
   int k,j;
   int[] vet = new int[10]; // Elementos iguais a zero (default).
   
   for(k = 0 ; k < 10 ; k++)
      vet[k]=(int)Math.pow(k+1,2); // Redefine valores.
      
   for(k = 0 ; k < 10 ; k++)
      System.out.print(vet[k]+" "); // Imprime novos valores
      
   // Redefine o vetor vet.
   vet = new int[5]; // Elementos iguais a zero.
   System.out.println();
   for(k = 0 ; k < 5 ; k++)
      System.out.print(vet[k]+" "); // Reimprime vet, mostrando que agora seus valores estao 0 dnv
   }
}