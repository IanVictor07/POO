public class Mamifero extends Animal {
	
    protected int idade ;
    protected int velocidade ;

    public Mamifero(int idade, int velocidade, float peso, String nome, int tipo) {
        super(nome, peso, tipo);
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public float correr() {
        return this.velocidade * (100 - this.idade) / 100 ;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
}
