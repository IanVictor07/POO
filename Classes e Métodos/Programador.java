public class Programador {
	
	private int matricula;
	private String nome;
	private String cargo;
	private Double salarioBase;
	
	public Programador(int matricula, String nome, Double salarioBase){
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = "Sem cargo";
		}
	
	public Programador(int matricula, String nome, Double salarioBase, String cargo){
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		}
		
	public Double calculaSalario(int projetos){
		if (projetos > 10){
			projetos = 10;
		}
		if (cargo = "Coordenador"){
			return (salarioBase + (salarioBase * 50/100) * projetos);
		}else{
			return (salarioBase + (salarioBase * 20/100) * projetos);
		}
		
	}
	
	public Double calculaSalario(int projetos, int experiencia){
		if (projetos > 5 ){
			projetos = 5;
		}
		if (experiencia > 25){
			experiencia = 25;
		}
		return (experiencia * (salarioBase * 10/100) * projetos);
	}
	
	public Double calculaSalario(int projetos, Double comissao){
		if (projetos > 5)
		{
			return salarioBase + comissao;
		}
		
	public Double calculaSalario(int projetos, int experiencia, Double comissao){
		if (projetos > 5 ){
			projetos = 5;
		}
		if (experiencia > 25){
			experiencia = 25;
		}
		salarioBase = calculaSalario(projetos, experiencia);
		
		if (projetos > 5)
		
			return salarioBase += comissao;
	}
	public int getMatricula(){
		return matricula;
		}
	public void setMatricula(int matricula){
		this.matricula = matricula;
		}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome ){
		this.nome = nome;
		}
	public String getCargo(){
		return Cargo;
	}
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	public double getSalarioBase(){
		return salarioBase;
		}
	public void setSalarioBase(Double salarioBase){
		this.salarioBase = salarioBase;
		}
}

