public class tabelaRaizes{
   public static void main(String[] args) {
   int k = 0, n = Integer.parseInt(args[0]);
   System.out.println("Num raiz(Num)");
   System.out.println("---------------");
   while (k<n){
   k++;
   // Saída formatada no estilo do C; %n: newline.
   System.out.format("%2d %8.5f%n",k,Math.sqrt(k));
   }
   }
}