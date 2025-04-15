public class PlanoPremium extends Plano {
	
	protected int dispositivos;
	
	public PlanoPremium(Double precoBase, int dispositivos){
		super(precoBase);
		this.dispositivos = dispositivos;
		}
		
	//get
	public int getDispositivos(){
		return dispositivos;
		}
	
	//set
	public void setDispositivos(int dispositivos){
		this.dispositivos = dispositivos;
		}
		
	//métodos
	@Override
	public Double calculaPreco(){
		if (dispositivos > 3){
			return precoBase + (precoBase * 0.15);
		}
		if (dispositivos <= 3){
			return precoBase + (precoBase * 0.05);
		}
		return precoBase;
	}
}

