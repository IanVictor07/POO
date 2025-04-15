public class Fatura {
	
	int numero;
	String descricao;
	int quantidade;
	Double preco;
	
	public Fatura(int numero, String descricao, int quantidade, Double preco){
			this.numero = numero;
			this.descricao = descricao;
			this.quantidade = quantidade;
			this.preco = preco;
	}
	
	public Double getValorDaFatura(){
		if (quantidade < 0){
			quantidade = 0;
		}
		if(preco < 0){
			preco = 0.0;
		}
		return quantidade * preco;
		}
	
	public int getNumero(){
		return numero;
		}
	public void setNumero(int numero){
		this.numero = numero;
		}
	public String getDescricao(){
		return descricao;
		}
	public void setDescricao(String descricao){
		this.descricao = descricao;
		}
	public int getQuantidade(){
		return quantidade;
		}
	public void setQuantidade(){
		this.quantidade = quantidade;
		}
	public Double getPreco(){
		return preco;
		}
	public void setPreco(){
		this.preco = preco;
		}
}

