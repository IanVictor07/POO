public class Animal {
    protected String nome ;
    protected float peso ;
    protected int tipo ;

    public Animal(String nome, float peso, int tipo) {
        this.nome = nome ;
        this.peso = peso ; 
        this.tipo = tipo ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
