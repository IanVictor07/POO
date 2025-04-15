import java.util.Scanner;
public class Ex5 {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um valor");
	int valor = scan.nextInt();
	
	if (valor > 10){
		System.out.println(valor+" É MAIOR QUE 10");
	}else
		System.out.println(valor+" NÃO É MAIOR QUE 10");
		
}

