public class imovel {
	
	protected String descricao;
	protected Double preco;
	protected boolean ativo;
	protected char tipo;
	
	public imovel(String descricao, Double preco, boolean ativo){
		this.descricao = descricao;
		this.preco = preco;
		this.ativo = ativo;
		this.tipo = 'I';
		}
	
	//getters
	public String getDescricao(){
		return descricao;
		}
	public Double getPreco(){
		return preco;
		}
	public boolean getAtivo(){
		return ativo;
		}
	public char getTipo(){
		return tipo;
		}
		
	//setters
	public void setDescricao(String descricao){
		this.descricao = descricao;
		}
	public void setPreco(Double preco){
		this.preco = preco;
		}
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
		}
		
	//métodos
	public Double calculaPreco(){
		if (ativo){
			return preco;
		}
		return 0.0;
	}
}

