public class IntroducaoEx2{
   public static void main(String[] args) {
      float a = Float.parseFloat(args[0]);
      float b = Float.parseFloat(args[1]);
      float c = Float.parseFloat(args[2]);
      
      double diagonal = Math.sqrt(Math.pow(Math.sqrt(Math.pow(a,2) + Math.pow(b,2)),2) + Math.pow(c,2));
      
      System.out.println("Diagonal -> "+diagonal);
    }
}
