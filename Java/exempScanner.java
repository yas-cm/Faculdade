import java.util.Scanner; // Para usar Scanner.
import java.util.Locale; // Para usar Locale (',' ou '.' em reais).
public class exempScanner{
   public static void main(String[] args) {
      int i;
      // Cria objeto Scanner usando a vírgula para leitura de
      // decimais. O sistema operacional identifica o padrão local
      // (pt-BR). Equivalente a:
      // Locale BR=new Locale("pt","BR"); // Padrões Brasileiros.
      // Scanner input1=new Scanner(System.in).useLocale(BR);
      Scanner input1=new Scanner(System.in);
      // Cria objeto Scanner usando ponto para leitura de decimais.
      // Neste caso, redefine-se o local para EUA (US).
      Scanner input2=new Scanner(System.in).useLocale(Locale.US);
      
      // Leitura de inteiro.
      System.out.print("Digite um numero inteiro: ");
      int n=input1.nextInt(); clearBuffer(input1);
      
      // Leitura real de precisão simples (usar ',' ao invés de '.').
      System.out.print("Digite um numero real (float com ','): ");
      float x=input1.nextFloat(); clearBuffer(input1);
      
      // Leitura de real de dupla precisão (usar ',' ao invés de '.').
      System.out.print("Digite um numero real (double com ','): ");
      double xx1=input1.nextDouble(); clearBuffer(input1);
     
      // Leitura de real de dupla precisão (usar ponto).
      System.out.print("Digite outro numero real (double com '.'): ");
      double xx2=input2.nextDouble(); clearBuffer(input2);
      
      // Leitura de string.
      System.out.print("Digite seu nome: ");
      String nome=input1.nextLine();
      
      // Valores digitados.
      System.out.println("Inteiro: "+n);
      System.out.println("Real...: "+x);
      System.out.println("Double.: "+xx1);
      System.out.println("Double.: "+xx2);
      System.out.println("Nome...: "+nome);
      int v[]=new int[3];
      
      for(i=0;i<3;i++){ // Leitura de um vetor.
      System.out.printf("Digite v[%d]: ",i);
      v[i]=input1.nextInt(); clearBuffer(input1);
      }
      for(i=0;i<3;i++)
      System.out.printf("v[%d]=%d ",i,v[i]);
      } // Fim método main.
      
// Semelhante à linguagem C, é preciso limpar o buffer de
// teclado para eliminar o caractere newline após cada
// entrada para não prejudicar a próxima.
private static void clearBuffer(Scanner scanner) {
   if (scanner.hasNextLine()) {
      scanner.nextLine();
      }
   } // Fim método clearBuffer.
} // Fim classse exempScanner.