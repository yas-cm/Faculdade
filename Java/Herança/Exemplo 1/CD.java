public class CD extends Colecionavel{
   private String genMus;
   public CD(int id, String nomOb, String lisAut,
   String data,String genMus){
   super(id,nomOb,lisAut,data);
   this.genMus=genMus;
   }
   public String getGenMus(){return genMus;}
   
   public void imprime(){
   System.out.print("CD, ");
   super.imprime();
   System.out.println("Gen.Mus..: "+genMus+".");
   }
}