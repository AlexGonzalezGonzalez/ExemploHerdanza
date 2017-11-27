
package exemploherdanza;

public class Persoa {
   private String nome;
   public String apelido;
   private int edade;
   public Persoa(String nome,String apelido, int edade){
       this.nome=nome;
       this.apelido=apelido;
       this.edade=edade;
       
   } 
   public String getNome(){
       return nome;
   }
   public String getApelido(){
       return apelido;
   }
   public int getEdade(){
       return edade;
   }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }
   
    
}
