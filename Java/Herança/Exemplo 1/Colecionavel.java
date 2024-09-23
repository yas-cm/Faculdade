public class Colecionavel{
   private int id;
   private String nomOb,lisAut,data;
   public Colecionavel(int id,String nomOb,String lisAut,
   String data){
   this.id=id; this.nomOb=nomOb;
   this.lisAut=lisAut;this.data=data;
   }
   public int getId(){return id;}
   public String getNome(){return nomOb;}
   public String getData(){return data;}
   public String getLisAut(){return lisAut;}
   public void imprime(){
   System.out.println("id: "+id+" <<<<<");
   System.out.println("Nome.....: "+nomOb+".");
   System.out.println("Autor(es): "+lisAut+".");
   System.out.println("Data.....: "+data+".");
   }
}