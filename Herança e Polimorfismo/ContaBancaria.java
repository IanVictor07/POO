public class ContaBancaria {
	
	protected int numero;
	protected int senha;
	protected Pessoa cliente;
	protected Double saldo;
	
	//construtor
	public ContaBancaria(int numero, Pessoa cliente, int senha){
		this.numero = numero;
		this.cliente = cliente;
		this.senha = senha;
		this.saldo = 0.0;
		}
	
	//getters
	public int getNumero(){
		return numero;
		}
	public int getSenha(){
		return senha;
		}
	public Pessoa getCliente(){
		return cliente;
		}
	
	//setters
	public void setNumero(int numero){
		this.numero = numero;
		}
	public void setSenha(int senha){
		this.senha = senha;
		}
	public void setCliente(Pessoa cliente){
		this.cliente = cliente;
		}
		
	//métodos
	public String sacar(int senha, Double saque){
		if (this.senha == senha){
			System.out.println("SALDO: "+saldo);
			if (saque <= saldo){
				saldo -= saque;
				return "Saque no valor de R$ "+saque+" realizado com sucesso!!!";
			}else{
				return "Saldo insuficiente!!!";
			}
		}
		return "Senha incorreta!!!";
	}
	
	public String Depositar(Double deposito){
		saldo += deposito;
		return "Depósito de R$ "+deposito+" realizado com sucesso!!!";
		}
		
	public String consultaSaldo(int senha){
		if (this.senha == senha){
			return "SALDO: "+saldo;
		}
		return "Senha incorreta!!!";
	}
}
