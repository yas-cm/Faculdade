// Herança
class A{
// Recupera o nome da classe que usa r() e s(): nC.
private String nC=this.getClass().getName();
public void r(){
System.out.println("A.r() chamado de "+nC+".");
}
public void s(){
System.out.println("A.s() chamado de "+nC+".");
}
}