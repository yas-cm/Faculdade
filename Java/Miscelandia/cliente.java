public class cliente{
   public static void main(String[] args) {
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   int c = Integer.parseInt(args[2]);
   
   if(misc.primo(a) == 0) System.out.println("Nao eh primo");
   else System.out.println ("Primo");
   
   System.out.format("Quantidade de pares: %d",misc.pares(b,c));
   }
}