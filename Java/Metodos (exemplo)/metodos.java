public class metodos{
   public static void main(String[] args){
   int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   int s=mat.soma(a,b); // classe.método()
   System.out.println(a+" + "+b+" = "+s);
   System.out.format("%d! = %.0f. ",s,mat.fat(s));
   }
}