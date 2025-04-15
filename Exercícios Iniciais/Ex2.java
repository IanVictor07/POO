import java.util.Scanner;
public class Ex2 {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe o número total de eleitores");
	int votos = scan.nextInt();
	System.out.println("Informe a quantidade de votos válidos");
	int validos;
	do{
		validos = scan.nextInt();
	}while(validos >= votos);
	int rest = votos - validos;
	System.out.println("Votos restantes "+rest);
	System.out.println("Informe a quantidade de votos brancos");
	int brancos;
	do{
		brancos = scan.nextInt();
	} while (brancos > rest);
	System.out.println("Votos restantes "+(rest-brancos)) ;
	int nulos;
	nulos = rest - brancos;
	System.out.println("Votos totais = "+votos);
	System.out.println("Votos válidos= "+((validos*100)/votos)+ "%");
	System.out.println("Votos brancos = "+((brancos*100)/votos)+"%");
	System.out.println("Votos nulos = "+((nulos*100)/votos)+"%");
	}
}

