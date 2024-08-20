// Escreva um programa que crie uma matriz de inteiros
// 3 x 3 e defina o valor de cada elemento como sendo a
// soma de seus índices ao quadrado mais cinco, imprimindo
// a matriz na forma mostrada abaixo.

public class matriz{
   public static void main(String[] ars){
   int[][] mat = new int[3][3];
   int i, j;
   for(i = 0; i < 3; i++){
      for(j = 0; j < 3; j++){
         mat[i][j] = (i*i + j*j) + 5;
         System.out.format("%3d ",mat[i][j]); // Formata bonitinho
         }
         System.out.println();
      } 
   }
}