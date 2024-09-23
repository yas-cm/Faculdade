public class Livro extends Colecionavel{
   private String editora;
   private int ano;
   public Livro(int id, String nomOb, String lisAut,
   String data, String editora, int ano){
   super(id,nomOb,lisAut,data);
   this.editora=editora; this.ano=ano;
   }
   public String getEditora(){return editora;}
   public int getAno(){return ano;}
   public void imprime(){
   System.out.print("LIVRO, ");
   super.imprime();
   System.out.println("Editora..: "+editora+".");
   System.out.println("Ano......: "+ano+".");
   }
}