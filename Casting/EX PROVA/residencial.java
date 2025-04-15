public class residencial extends edificacao{
	
	private String tipoResidencia;
	
	public residencial(String tipoResidencia, String disponibilidade, String descricao, Double preco, boolean ativo){
		super(disponibilidade, descricao, preco, ativo);
		this.tipoResidencia = tipoResidencia;
		this.tipo = 'R';
		}
	
	//get
	public String getTipoResidencia(){
		return tipoResidencia;
		}
	//set
	public void setTipoResidencia(String tipoResidencia){
		this.tipoResidencia = tipoResidencia;
		}
		
	//método
	@Override
	public Double calculaPreco(){
		if (ativo){
			if (tipoResidencia.equalsIgnoreCase("CASA") && disponibilidade.equalsIgnoreCase("LOCAÇÃO")){
				return preco + (preco * 0.1);
			}
			if (tipoResidencia.equalsIgnoreCase("CASA") && disponibilidade.equalsIgnoreCase("COMPRA")){
				return preco + (preco * 0.05);
			}
			if (tipoResidencia.equalsIgnoreCase("APARTAMENTO") && disponibilidade.equalsIgnoreCase("LOCAÇÃO")){
				return preco + (preco * 0.15);
			}
			if (tipoResidencia.equalsIgnoreCase("APARTAMENTO") && disponibilidade.equalsIgnoreCase("COMPRA")){
				return preco + (preco * 0.03);
			}
		}
		return 0.0;
	}
	
}

