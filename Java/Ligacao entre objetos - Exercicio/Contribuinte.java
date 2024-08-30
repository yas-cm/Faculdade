import java.util.ArrayList;
   public class Contribuinte{
      private String nome;
      private ArrayList<Dependente> dep=new ArrayList<Dependente>();
      private ArrayList<Imovel> imovel=new ArrayList<Imovel>();
      public Contribuinte(String nome){
      this.nome=nome;
   }
   public String getNome(){
      return nome;
   }
   public void incluiDep(String nome, int idade){
      dep.add(new Dependente(nome,idade));
   }
   public void incluiImovel(String endereco, int metragem){
      imovel.add(new Imovel(endereco,metragem));
   }
   public void imprime(){
      System.out.println("\nContribuinte: "+nome);
      if (dep.size()==0){
         System.out.println(" Dependentes: nenhum cadastrado.");
      }
      else{
         System.out.print(" Dependentes");
         System.out.println(" ("+dep.size()+"):"); // Numero de dependentes
      for(Dependente d:dep){ // d é um iterador.
         System.out.print(" - "+d.getNome()+", "); // Imprime nome de cada dependente
         System.out.println(d.getIdade()+" anos."); // Imprime idade
      }
      }
      
      if (imovel.size()==0){
         System.out.println("Imoveis: nenhum cadastrado.");
      } else {
         System.out.print("Imoveis");
         System.out.println(" ("+imovel.size()+"):");
      for(Imovel i:imovel){
         System.out.println(" - "+i.getEndereco()+" - "+i.getMetragem()+" m2");
      } 
      
      }
      }
  }

