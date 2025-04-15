import java.util.Scanner;
public class Ex8 {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Informe a quantidade atual em estoque ");
	int estoque = scan.nextInt();
	System.out.print("Informe a quantidade máxima de um produto ");
	int maxproduto = scan.nextInt();
	System.out.print("Informe a quantidade mínima de um produto ");
	int minproduto = scan.nextInt();
	
	int media = (maxproduto + minproduto)/2;
	
		if (media>=estoque){
			System.out.println("Não efetuar compra");
		}else{
			System.out.println("Efetuar compra");
		}
	}
}

