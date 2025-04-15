public class Funcionario {
	
	private String nome;
	private Double salarioBase;
	private int tempoDeServico;
	
	public Funcionario(String nome, Double salarioBase, int tempoDeServico){
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.tempoDeServico = tempoDeServico;
		}
	
	
	public Double mostraSalario(){
		if (tempoDeServico > 0 && tempoDeServico <= 10 ){
			salarioBase = salarioBase + (salarioBase * 0.12);
		}
		if (tempoDeServico > 10 ){
			salarioBase = salarioBase + (salarioBase * 0.17);
		}
		return salarioBase;
	}
		
	public Double mostraSalario(Double totalDeVendas){
		if (tempoDeServico > 0 && tempoDeServico <= 10 ){
			salarioBase = salarioBase + (salarioBase * 0.05) + (totalDeVendas * 0.015);
		}
		if (tempoDeServico > 10 ){
			salarioBase = salarioBase + (salarioBase * 0.10) + (totalDeVendas * 0.02);
		}
		return salarioBase;
	}
	
	public String getNome(){
		return nome;
		}
	public void setNome(String nome){
		this.nome = nome;
		}
	public Double getSalarioBase(){
		return salarioBase;
		}
	public void setSalarioBase(Double salarioBase){
		this.salarioBase = salarioBase;
		}
	public int getTempoDeServico(){
		return tempoDeServico;
		}
	public void setTempoDeServido(int tempoDeServico){
		this.tempoDeServico = tempoDeServico;
		}
}

