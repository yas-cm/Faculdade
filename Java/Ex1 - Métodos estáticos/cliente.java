public class cliente{
   public static void main(String[] args){
   double a = Double.parseDouble(args[0]);
   double b = Double.parseDouble(args[1]);
   
   double s = calc.soma(a,b);
   double sub = calc.sub(a,b);
   double m = calc.mult(a,b);
      
   System.out.format("Numeros fornecidos: %.2f e %.2f\n",a,b);
   System.out.format("%.2f + %.2f = %.2f\n",a,b,s); 
   System.out.format("%.2f - %.2f = %.2f\n",a,b,sub);
   System.out.format("%.2f * %.2f = %.2f\n",a,b,m);
   System.out.format("%.2f / %.2f = %.2f\n",a,b,calc.div(a,b));
}
}