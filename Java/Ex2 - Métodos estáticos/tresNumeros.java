public class tresNumeros{
   static int menor(int a, int b, int c){
      int menor;
      if(a < b && a < c) menor = a;
      else if(b < a && b < c) menor = b;
      else menor = c;
      return menor;        
   }
   static int intermediario(int a, int b, int c){
      int inter = 0;
      if((a < b && a > c)||(a > b && a < c)) inter = a;
      else if((b > a && b < c)||(b < a && b > c)) inter = b;
      else if((c < a && c > b)||(c > a && c < b)) inter = c;
      return inter;   
   }
   static int maior(int a, int b, int c){
      int maior;
      if(a > b && a > c) maior = a;
      else if(b > a && b > c) maior = b;
      else maior = c;
      return maior;   
   }

}