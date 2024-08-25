import java.util.ArrayList;
import java.util.Scanner;


public class ListaEmpregados{
   private static ArrayList <Empregado> empregados;  
   
   private static void PrintCompleto(){
      System.out.println("--- Lista de empregados ---");
      for (Empregado e : empregados){
         System.out.println(e.getNome() + "," + e.getIdade() + " anos, Cargo: " + nomeCargo(e.getCargo()) + ".");
      }
   }
   
   private static String nomeCargo(char c){
      switch(c){
         case 'A' : return "Analista";
         case 'D' : return "Desenvolvedor";
         case 'G' : return "Gerente";
         default: return "Cargo inexistente";
      }
   }
   
   private static void filtro(char cargo){
      if(cargo != 'G' && cargo != 'D' && cargo != 'A'){
      System.out.println("Cargo nao encontrado");
      return;
      }
      System.out.println("--- Empregados com cargos de " + nomeCargo(cargo) + " ---");
      int cont = 0;
      for(Empregado e : empregados){
         if(e.getCargo() == cargo){
            System.out.println(e.getNome() + ", " + e.getIdade() + " anos" + ".");
            cont ++;
         }
      }
      if (cont == 0) System.out.println("Nenhum empregado encontrado");
      
   }
   
   
   
   public static void main(String[] args){      
      
      empregados = new ArrayList<Empregado>();
      
      empregados.add(new Empregado("Ciclano",'D', 40));
      empregados.add(new Empregado("Deltrano",'A', 50));
      empregados.add(new Empregado("Fulano", 'G', 30));
      
      PrintCompleto();
      
      System.out.println("\n--- MENU ---");
      System.out.println("[1] Cadastrar empregado\n[2] Remover empregado\n[3] Atualizar empregado\n[4] Listar todos os empregados\n[5] Listar empregados pelo cargo\n[6] Encerrar o programa");
      System.out.print("\n-> ");
      int op = Console.lerInt();
      switch(op){
         case 1:
            System.out.println("--- Cadastrar empregado ---");
            System.out.print("Nome -> ");
            String nome = Console.lerString(); 
            System.out.print("\nCargo -> "); 
            char cargo = Console.lerChar();
            System.out.print("\nIdade -> ");
            int idade = Console.lerChar();
            empregados.add(new Empregado(nome,cargo,idade));
            PrintCompleto();
            break;
        case 2:
            System.out.println("--- Remover empregado ---");
            System.out.println("Digite o indice do empregado que deseja excluir -> ");
            int indice = 0;
            indice = Console.lerInt();
            System.out.println(indice);
            String nominho = empregados.get(indice).getNome();
            System.out.println(nominho);
      }
      
   
     
    //   
//       System.out.println("(-- Ciclano excluido, adicionando Tetrano como Desenvolvedor--)");
//       
//       empregados.remove( );
//       empregados.add(new Empregado("Tetrano",'D', 20));
//       
//       PrintCompleto();
//       
//       System.out.println("(-- Atualizando cargo de Deltrano para Gerente--)");
//       empregados.get(1).setCargo('G');
//       
//       PrintCompleto();
//       
//       System.out.println("(-- Filtrando empregados com o cargo de gerente --)");
//       filtro('G');
//       
//       System.out.println("(-- Tentando filtrar cargo invalido --)");
//       filtro('X');
    }

}