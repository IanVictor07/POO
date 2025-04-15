public class Plano4K extends PlanoPremium{
	
	private boolean hdr;
	
	public Plano4K(Double precoBase, int dispositivos, boolean hdr){
		super(precoBase, dispositivos);
		this.hdr = hdr;
		}
		
	//get
	public boolean getHdr(){
		return hdr;
		}
	//set
	public void setHdr(boolean hdr){
		this.hdr = hdr;
		}
	
	//métodos
	@Override
	public Double calculaPreco(){
		if (dispositivos > 3 && hdr == true){
			return precoBase + (precoBase * 0.15) + (precoBase + (precoBase * 0.15)*0.25);
		}
		if (dispositivos <= 3 && hdr == true){
			return precoBase + (precoBase * 0.05) + (precoBase + (precoBase * 0.15)*0.25);
		}
		return precoBase;
	}
}

