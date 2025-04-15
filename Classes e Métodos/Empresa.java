public class Empresa {
	
	public static void main (String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Luis",1500.00, 15 );
		
		/*funcionario1.setNome("Luis");
		funcionario1.setSalarioBase(1500.00);
		funcionario1.setTempoDeServido(15);*/
		
		System.out.println("O salário final do gerente "+funcionario1.getNome()+" equivale a: "+funcionario1.mostraSalario());
		
		Funcionario funcionario2 = new Funcionario("Felipe", 3000.00, 15);
		
		System.out.println("O salário final do vendedor "+funcionario2.getNome()+" equivale a: "+funcionario2.mostraSalario(350.00));
	}
}
		
