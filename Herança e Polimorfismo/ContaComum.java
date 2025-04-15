public class ContaComum extends ContaBancaria {
	
	//construtor
	public ContaComum(int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
		}
		
	//métodos
	
	@Override
	public String sacar(int senha, Double saque){
		if (this.senha == senha){
			System.out.println("SALDO: "+saldo);
			if (saque <= saldo + (saldo*0.01)){
				saldo -= saque*0.01;
				return "Saque no valor de R$ "+saque+" realizado com sucesso + Tarifa: "+saque*0.01;
			}else{
				return "Saldo insuficiente!!!";
			}
		}
		return "Senha incorreta!!!";
	}
}

