// Escreva um programa que crie um vetor de Strings
// (tipo/classe String) de tamanho 3 para conter nomes de
// pessoas, defina os nomes para cada elemento no próprio
// código, e após imprima o vetor na forma mostrada abaixo
// usando uma repetição adequada

public class Nomes{
   public static void main(String[] args){
   int k;
      String[] nome = new String[3];
      
      nome[0] = "Jose Josildo";
      nome[1] = "Mara Maravilha";
      nome[2] = "Pedro Pedroviski";
   
      for(k = 0; k < 3; k++){
         System.out.print(nome[k]);
         if(k < 2) System.out.print("  -  ");
      }
   }
}