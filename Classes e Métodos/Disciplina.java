import java.util.*;

public class Disciplina {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno("Ian",1, 6.0);

		System.out.println(aluno.resultadoFinal());
	}
}

