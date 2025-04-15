public class PlanoBasico extends Plano {
	
	private String qualidadeMaxima;
	
	public PlanoBasico(Double precoBase, String qualidadeMaxima){
		super(precoBase);
		this.qualidadeMaxima = qualidadeMaxima;
	}
	
	//get
	public String getQualidadeMaxima(){
		return qualidadeMaxima;
		}
	
	//set
	public void setQualidadeMaxima(String qualidadeMaxima){
		this.qualidadeMaxima = qualidadeMaxima;
		}
		
	//métodos
	@Override
	public Double calculaPreco(){
		if (qualidadeMaxima.equals("FULL HD")){
			return precoBase + (precoBase * 0.10);
		}
		return precoBase;
	}
	
}

