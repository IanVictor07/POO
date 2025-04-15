public class Pedido {
	
	private int codigo;
	private String cliente;
	private Double valor;
	
	public Pedido(int codigo){
		this.codigo = codigo;
		this.cliente = "Não informado";
		this.valor = 0.0;
		}
		
	public Pedido(int codigo, String cliente){
		this.codigo = codigo;
		this.cliente = cliente;
		this.valor = 0.0;
		}
		
	public String adiciona(int produto){
		switch(produto){
			case 1:
				valor += 20.0;
				break;
			case 2:
				valor += 12.0;
				break;
			case 3:
				valor += 15.0;
				break;
		}
		return "\nPedido "+ codigo+ " – Cliente: "+ cliente+ " – Total R$ "+ valor;
	}
		
	public String adiciona(int produto, Double batata){
		switch(produto){
			case 1:
				valor += 20.0;
				break;
			case 2:
				valor += 12.0;
				break;
			case 3:
				valor += 15.0;
				break;
		}
		valor += batata * 0.05;
		return "\nPedido "+ codigo+ " – Cliente: "+ cliente+ " – Total R$ "+ valor;
	}
	
	
	public String adiciona(int produto, Double batata, Double refrigerante){
		switch(produto){
			case 1:
				valor += 20.0;
				break;
			case 2:
				valor += 12.0;
				break;
			case 3:
				valor += 15.0;
				break;
		}
		valor += batata * 0.05;
		valor += refrigerante * 0.02;
		return "\nPedido "+ codigo+ " – Cliente: "+ cliente+ " – Total R$ "+ valor;
	}
	
	public String adiciona(int produto, Double batata, int cookie){
	switch(produto){
			case 1:
				valor += 20.0;
				break;
			case 2:
				valor += 12.0;
				break;
			case 3:
				valor += 15.0;
				break;
		}
		valor += batata * 0.05;
		valor += cookie * 2.0;
		return "Pedido "+ codigo+ " – Cliente: "+ cliente+ " – Total R$ "+ valor;
	}
	
	public int getCodigo(){
		return codigo;
	}
		
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getCliente(){
		return cliente;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public Double getValor(){
		return valor;
	}
	
	public void setValor(Double valor){
		this.valor = valor;
	}
}

