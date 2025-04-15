
public class Livro extends Publicacao{
	
	private String autor;
	private String editora;
	
	@Override
	public String emprestar(int dia, int mes){
		dia += 10;
		if(dia > 30){
			dia -= 30;
			mes++;
			if(mes > 12){
				mes -= 12;
			}
		}
		return "Devolver dia "+dia+"/"+mes;
	}
	
	public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public Livro(int isbn, String nome, int numeroDeCopias, int copiasEmprestadas, String autor, String editora){
		super(isbn, nome, numeroDeCopias, copiasEmprestadas);
		this.autor = autor;
		this.editora = editora;
		tipo = 'L';
	}
}

