
public class Revista extends Publicacao{
	
	private int ano;
	private int volume;
	
	@Override
	public String emprestar(int dia, int mes){
		dia += 3;
		if(dia > 30){
			dia -= 30;
			mes++;
			if(mes > 12){
				mes -= 12;
			}
		}
		return "Devolver dia "+dia+"/"+mes;
	}
	
	public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public Revista(int isbn, String nome, int numeroDeCopias, int copiasEmprestadas, int ano, int volume){
		super(isbn, nome, numeroDeCopias, copiasEmprestadas);
		this.ano = ano;
		this.volume = volume;
		tipo = 'R';
	}
}


