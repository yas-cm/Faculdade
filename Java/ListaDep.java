import java.util.ArrayList; // Sempre que for trabalhar com array precisa desse
public class ListaDep{
   private static ArrayList<Dependente> dep;
   
   private static void imprimeDep(){
      System.out.println("--- Lista de dependentes -------");
      
      for(Dependente d:dep){
         System.out.print(d.getNome() + ", " + d.getIdade());
         System.out.println(" anos"); }
}

// Main: solução A.
public static void main(String[] args) {
   dep=new ArrayList<Dependente>();
   // Criando objetos
   Dependente d0=new Dependente("Jose Carlos", 11);
   Dependente d1=new Dependente("Maria Ana", 9);
   Dependente d2=new Dependente("Beto Lima", 13);
   Dependente d3=new Dependente("Roberta Silva", 15);
   // Adiciona os 3 primeiros
   dep.add(d0); dep.add(d1); dep.add(d2); 
   imprimeDep();
   System.out.print("(-- Maria Ana excluida;");
   System.out.println(" Roberta Silva adicionada. --)");
   dep.remove(d1); dep.add(d3);
   imprimeDep();
   }
}