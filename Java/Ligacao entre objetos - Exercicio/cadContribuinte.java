import java.util.ArrayList;
   public class cadContribuinte{
   public static void main(String[] args) {
      ArrayList<Contribuinte> cont=new ArrayList<Contribuinte>();
      Contribuinte c0 = new Contribuinte("Pedro de Lara");
      Contribuinte c1 = new Contribuinte("Maria Cardoso");
      Contribuinte c2 = new Contribuinte("Roberto Oliveira");
      
      
      // Contribuinte 0.
      c0.incluiDep("Maria de Lara",13);
      c0.incluiDep("Jose de Lara",15);
      c0.incluiImovel("Rua Tupi, 101, Curitiba",133);
      cont.add(c0);
      
            
      // Contribuinte 1.
      c1.incluiDep("Pedro Cardoso",11);
      c1.incluiDep("Giovanna Cardoso",16);
      c1.incluiImovel("Rua Guarani, 121, Curitiba",466);
      cont.add(c1);
      
      // Contribuinte 2.
      cont.add(c2);
      
      for(Contribuinte c:cont){
         System.out.println("Contribuinte cadastrado:  "+c.getNome());
      }
      
      System.out.println("\n--- CADASTRO ---");
      
      for(Contribuinte c:cont)
         c.imprime();
      }
}

// No final, os dependentes estarao ligados ao contribuinte (na classe dele),
// e o contribuinte vai ligar com o cadastro contribuinte ("carregando o dependente junto")
