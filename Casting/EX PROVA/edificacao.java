public class edificacao extends imovel{
	
	protected String disponibilidade;
	
	public edificacao(String disponibilidade, String descricao, Double preco, boolean ativo){
		super(descricao,preco, ativo);
		this.disponibilidade = disponibilidade;
		}
	
	//get
	public String getDisponibilidade(){
		return disponibilidade;
	}
	
	//set
	public void setDisponibilidade(String disponibilidade){
		this.disponibilidade = disponibilidade;
	}
	
	/*@Override
	public Double calculaPreco(){
		if (ativo == true){
			return preco;
		}
		return 0.0;
	}*/
}

