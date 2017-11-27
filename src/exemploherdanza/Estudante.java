
package exemploherdanza;

public class Estudante extends Persoa {
    private String codigo;
    private int notaFinal;

    public Estudante(String codigo, int notaFinal,String nome, String apelido, int edade) {
        super(nome, apelido, edade);
        this.codigo=codigo;
        this.notaFinal=notaFinal;
    }
    public String getCodigo(){
        return codigo;
    }    
   public int notaFinal(){
       return notaFinal;
   }
   public void amosar(){
       System.out.println("nome : "+getNome());
       System.out.println("apelido : "+apelido);
       System.out.println("edade : "+super.getEdade());
       System.out.println("codigo : "+codigo);
       System.out.println("nota final : "+notaFinal);
   }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", notaFinal=" + notaFinal + super.toString();
    }
   
    }
    
    
    

