public class comercial extends edificacao{
	
	private String localizacao;
	
	public comercial(String localizacao, String disponibilidade, String descricao, Double preco, boolean ativo){
		super(disponibilidade, descricao, preco, ativo);
		this.localizacao = localizacao;
		this.tipo = 'C';
		}
	
	//get
	public String getLocalizacao(){
		return localizacao;
		}
	//set
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
		}
		
	//método
	@Override
	public Double calculaPreco(){
		if (ativo){
			if (localizacao.equalsIgnoreCase("BAIRRO") && disponibilidade.equalsIgnoreCase("LOCAÇÃO")){
				return preco + (preco * 0.05);
			}
			if (localizacao.equalsIgnoreCase("BAIRRO") && disponibilidade.equalsIgnoreCase("COMPRA")){
				return preco + (preco * 0.07);
			}
			if (localizacao.equalsIgnoreCase("CENTRO") && disponibilidade.equalsIgnoreCase("LOCAÇÃO")){
				return preco + (preco * 0.15);
			}
			if (localizacao.equalsIgnoreCase("CENTRO") && disponibilidade.equalsIgnoreCase("COMPRA")){
				return preco + (preco * 0.20);
			}
		}
		return 0.0;
	}
	
}


