public class ContaEspecial extends ContaComum {
	
	private Double limite;
	
	public ContaEspecial(Double limite, int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
		this.limite = limite;
		}
	
	public Double getLimite(){
		return limite;
		}
	
	public void setLimite(Double limite){
		this.limite = limite;
		}
	
	@Override
	public String sacar(int senha, Double saque){
		if (this.senha == senha){
			System.out.println("SALDO: "+saldo);
			if (saque <= saldo){
				saldo -= saque;
				return "Saque no valor de R$ "+saque+" realizado com sucesso";
			}else{
				saldo -= saque;
				return 	"Saque no valor de R$ "+saque+" realizado com sucesso + Tarifa: "+saque*0.02;

			}
		}
		return "Senha incorreta!!!";
	}
}

