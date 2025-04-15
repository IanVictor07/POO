
public class Biblioteca {
	
	public static void main (String[] args) {
		
		Publicacao[] publicacoes = new Publicacao[10];
		
		Livro livro;
		Revista revista;
		
		for(int i=0; i<5; i++){
			livro = new Livro((i*10+i), "Livro 0"+i, 10, 0, "Autor "+i, "Editora "+i);
			publicacoes[i] = livro; //Armazena livros no vetor de publicações.
		}
		
		for(int i=5; i<10; i++){
			revista = new Revista((i*10+i), "Revista 0"+i, 10, 0, 2000+i, 100+i);
			publicacoes[i] = revista;//Armazena revistas no vetor de publicações.
		}
		
		for(int i=0; i<10; i++){
			System.out.print("Publicação: "+publicacoes[i].getNome());
			if(publicacoes[i].getTipo() == 'L'){ //Verifica o tipo para fazer a conversão.
				livro = (Livro) publicacoes[i]; //Casting de publicação para livro.
				System.out.println(" Autor: "+livro.getAutor());
			}
			if(publicacoes[i] instanceof Revista){//Verifica o tipo para fazer a conversão.
				revista = (Revista) publicacoes[i]; //Casting de publicação para revista.
				System.out.println(" Ano: "+revista.getAno());
			}
		}
		
	}
}

