public class PlanoFamiliar extends Plano {
	
	private int usuarios;
	
	public PlanoFamiliar(Double precoBase, int usuarios){
		super(precoBase);
		this.usuarios = usuarios;
		}
		
	//get
	public int getUsuarios(){
		return usuarios;
		}
	
	//set
	public void setUsuarios(int usuarios){
		this.usuarios = usuarios;
		}
	
	//métodos
	@Override
	public Double calculaPreco(){
		return precoBase + (5*usuarios);
	}
}

