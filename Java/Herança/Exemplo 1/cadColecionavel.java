import java.util.ArrayList;
   public class cadColecionavel{
   public static void main(String[] args) {
   ArrayList<Colecionavel> colec=new ArrayList<Colecionavel>();
   colec.add(new Livro(colec.size()+1,
   "A volta dos que nao foram",
   "Jose Desaparecido","10/10/2020","Ed.Fantasma",
   1999));
   colec.add(new CD(colec.size()+1,"Coletanea de forro",
   "Ze do Baiao","1/2/2009","Forro"));
   colec.add(new DVD(colec.size()+1,"Vida leva eu",
   "Cine Atlantida","5/10/2001","Filme",
   "Trata sobre a vida nos suburbios do Rio"));
   colec.add(new Revista(colec.size()+1,"Manchete",
   "Ed. Bloch","2/12//2021",2016,34,120));
   
   for(Colecionavel c:colec) c.imprime();
   }
}