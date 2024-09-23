public class cliAB{
public static void main(String[] args) {
A a=new A(); B b=new B();
a.r(); // Executa A.r() a partir de A.
a.s(); // Executa A.s() a partir de A.
b.r(); // Executa A.r() a partir de B.
b.s(); // Executa A.s() a partir de B.
b.f(); // Executa A.r() e A.s() a partir de B.f().
}
}