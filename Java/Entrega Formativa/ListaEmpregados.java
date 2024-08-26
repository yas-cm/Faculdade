import java.util.ArrayList;
import java.util.Scanner;


public class ListaEmpregados{
   private static ArrayList <Empregado> empregados;  
   
   private static void PrintCompleto(){
      System.out.println("\n--- Lista de empregados ---");
      for (Empregado e : empregados){
         System.out.println(e.getNome() + "," + e.getIdade() + " anos, Cargo: " + nomeCargo(e.getCargo()) + ".");
      }
      System.out.println("---------------------------");
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
      int op;
      int flag = 0;
      while(flag == 0){
      
      System.out.println("\n--- MENU ---");
      System.out.println("[1] Cadastrar empregado\n[2] Remover empregado\n[3] Atualizar empregado\n[4] Listar todos os empregados\n[5] Listar empregados pelo cargo\n[6] Encerrar o programa");
      System.out.print("\n-> ");
      
      op = Console.lerInt();
      switch(op){
         case 1:
            System.out.println("\n--- Cadastrar empregado ---");
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
            System.out.println("\n--- Remover empregado ---");
            System.out.print("Digite o indice do empregado que deseja excluir -> ");
            int indice = 0;
            indice = Console.lerInt();
            String nominho = empregados.get(indice).getNome();
            empregados.remove(indice);
            System.out.println(nominho+" removido com sucesso!");
            PrintCompleto();
            break;
        case 3:
            System.out.println("\n--- Atualizar empregado ---");
            System.out.print("Digite o indice do empregado que deseja alterar -> ");
            int indice2 = 0;
            indice2 = Console.lerInt();
            System.out.println("Alterando dados do empregado "+empregados.get(indice2).getNome()+", "+empregados.get(indice2).getIdade()+", "+nomeCargo(empregados.get(indice2).getCargo()));
            System.out.print("Alterar idade[1] ou cargo[2] -> ");
            int opp = Console.lerInt();
            if(opp == 1){
               System.out.println("-- Alterando idade --");
               System.out.print("Digite a nova idade -> ");
               int i = Console.lerInt();
               empregados.get(indice2).setIdade(i);
            } else if(opp == 2){
               System.out.println("-- Alterando cargo --");
               System.out.print("Digite o novo cargo [A][D][G] -> ");
               char c = Console.lerChar();
               empregados.get(indice2).setCargo(c);
            } else System.out.println("Opcao invalida!");
            PrintCompleto();
            break;
        case 4:
            System.out.println("\n--- Listar todos os empregados ---");
            PrintCompleto();
            break;
        case 5:
            System.out.println("\n--- Listar empregados com um determinado cargo ---");
            System.out.print("Digite o cargo que gostaria de filtrar [A][D][G] -> ");
            char filtrando = Console.lerChar();
            filtro(filtrando);
            break;
        case 6:
            flag = 1;
            break;
        default:
            System.out.println("Valor invalido!");
            break;
            }
      }
      System.out.println("\n--- Fim do programa! ---\n");
   
   }

}