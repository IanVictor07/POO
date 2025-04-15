public class PlanoExclusivo extends PlanoPremium{
	
	private boolean conteudoExtra;
	
	public PlanoExclusivo(Double precoBase, int dispositivos, boolean conteudoExtra){
		super(precoBase, dispositivos);
		this.conteudoExtra = conteudoExtra;
		}
		
	//get
	public boolean getConteudoExtra(){
		return conteudoExtra;
		}
	//set
	public void setConteudoExtra(boolean conteudoExtra){
		this.conteudoExtra = conteudoExtra;
		}
	
	//métodos
	@Override
	public Double calculaPreco(){
		if (dispositivos > 3 && conteudoExtra == true){
			return precoBase + (precoBase * 0.15) + 20;
		}
		if (dispositivos <= 3 && conteudoExtra == true){
			return precoBase + (precoBase * 0.05) + 20;
		}
		return precoBase;
	}
}



