public class DVD extends Colecionavel{
   private String tipo, desc;
   public DVD(int id, String nomOb, String lisAut,
   String data,String tipo, String desc){
   super(id,nomOb,lisAut,data);
   this.tipo=tipo; this.desc=desc;
   }
   public String getTipo(){return tipo;}
   public String getDesc(){return desc;}
   public void imprime(){
   System.out.print("DVD, ");
   super.imprime();
   System.out.println("Tipo.....: "+tipo+".");
   System.out.println("Descricao: "+desc+".");
   }
}