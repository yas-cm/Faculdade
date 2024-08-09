public class cliente{
   public static void main(String[] args){
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   int c = Integer.parseInt(args[2]);
   System.out.format("Numeros fornecidos: %d, %d e %d\n",a,b,c);
   System.out.format("Menor......: %d\n",tresNumeros.menor(a,b,c));
   System.out.format("Intermediario......: %d\n",tresNumeros.intermediario(a,b,c));
   System.out.format("Maior......: %d\n",tresNumeros.maior(a,b,c));
}
}