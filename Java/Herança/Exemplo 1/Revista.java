public class Revista extends Colecionavel{
   private int AnoPub, numRev, numPag;
   public Revista (int id, String nomOb, String lisAut, String data, int AnoPub, int numRev, int numPag){
   super(id,nomOb,lisAut,data);
   this.AnoPub = AnoPub;
   this.numRev = numRev;
   this.numPag = numPag;
   }
   
   public int getAno(){return AnoPub;}
   public int getNumRev() {return numRev;}
   public int getNumPag() {return numPag;}
   
   public void imprime(){
   System.out.print("Revista, ");
   super.imprime();
   System.out.println("Ano de Publicacao.....: "+AnoPub+".");
   System.out.println("Numero da Revista: "+numRev+".");
   System.out.println("Numero da pagina: "+numPag+".");
   }
   
}