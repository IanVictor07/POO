public class ContaPoupanca extends ContaBancaria {
	
	private int dataBase;
	
	public ContaPoupanca(int dataBase, int numero, Pessoa cliente, int senha){
		super(numero, cliente, senha);
		this.dataBase = dataBase;
	}
	
	public int getDataBase(){
		return dataBase;
		}
	
	public void setDataBase(){
		this.dataBase = dataBase;
		}
	
	public Double calculaRendimento(int dia, int rendimento){
		if (dia > dataBase){
			saldo+=(saldo * rendimento)/100;
			return (saldo*rendimento)/100;
		}
		return 0.0;
	}
}

