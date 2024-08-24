public class Empregado{
   private String nome;
   private char cargo;
   private int idade;
   
   public Empregado(String n, char c, int i){
      nome = n;
      cargo = c;
      idade = i;  
   }
   public String getNome() {return nome;}
   public char getCargo() {return cargo;}
   public int getIdade() {return idade;}
   
   public void setNome(String n) { nome = n; }
   public void setCargo(char c) { cargo = c; }
   public void setIdade(int i) { idade = i; }
}