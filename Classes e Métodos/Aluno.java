public class Aluno {
	
	private String nome;
	private int matricula;
	private Double media;
	private String situacao;
	
	public Aluno(String nome, int matricula, Double media){
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
		this.situacao = situacao;
		verificaSituacao();
		}
		
	private void verificaSituacao(){
		if(media >= 6){
			situacao = "Aprovado";
		}else{
			situacao = "Reprovado";
		}
	}
	
	public String resultadoFinal(){
		return "Nome "+nome+"\nMatrícula "+matricula+"\nMédia "+media+"\nSituacao "+situacao;
		}
	
	public String getNome(){
		return nome;
		}
	public void setNome(String nome){
		this.nome = nome;
		}
	public int getMatricula(){
		return matricula;
		}
	public void setMatricula(int matricula){
		this.matricula = matricula;
		}
	public double getMedia(){
		return media;
		}
	public void setMedia(Double media){
		this.media = media;
		}
}
