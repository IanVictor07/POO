public class Plano {
	
	protected Double precoBase;
	
	public Plano(Double precoBase){
		this.precoBase = precoBase;
		}
	
	//get
	public Double getPrecoBase(){
		return precoBase;
		}
	//set
	public void setPrecoBase(Double precoBase){
		this.precoBase = precoBase;
		}
	
	//métodos
	public Double calculaPreco(){
		return precoBase;
		}
}

