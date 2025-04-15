
public class Publicacao {
	
	protected int isbn;
	protected String nome;
	protected int numeroDeCopias;
	protected int copiasEmprestadas;
	protected char tipo;
	
	public String emprestar(int dia, int mes){
		return "Devolver dia "+dia+"/"+mes;
	}
	
	public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeCopias() {
        return numeroDeCopias;
    }

    public void setNumeroDeCopias(int numeroDeCopias) {
        this.numeroDeCopias = numeroDeCopias;
    }

    public int getCopiasEmprestadas() {
        return copiasEmprestadas;
    }

    public void setCopiasEmprestadas(int copiasEmprestadas) {
        this.copiasEmprestadas = copiasEmprestadas;
    }

	public char getTipo(){
		return tipo;
	}
	
    public Publicacao(int isbn, String nome, int numeroDeCopias, int copiasEmprestadas) {
        this.isbn = isbn;
        this.nome = nome;
        this.numeroDeCopias = numeroDeCopias;
        this.copiasEmprestadas = copiasEmprestadas;
        tipo = 'P';
    }
}

