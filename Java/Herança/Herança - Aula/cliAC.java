public class cliAC{
   public static void main(String[] args) {
   A a = new A(); C c = new C();
   a.r(); // Executa A.r() a partir de A.
   a.s(); // Executa A.s() a partir de A.
   c.r(); // Executa C.r().
   c.s(); // Executa A.s() a partir de C.
   }
}