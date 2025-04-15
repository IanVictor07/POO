public class Idade {
	
	public static void main (String[] args) {
		
	Pessoa pessoa1 = new Pessoa("Meliodas");
	
	System.out.print(pessoa1.mostraIdade());
	
	Pessoa pessoa2 = new Pessoa("Malenia","Feminino", 3, 2003);
	
	System.out.println(pessoa2.mostraIdade(11, 2022));

	
	}
	
}

