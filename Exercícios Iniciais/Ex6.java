import java.util.Scanner;
public class Ex6 {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite quantas maças quieres");
	int macas = scan.nextInt();
	double total;
	
		if (macas > 12){
			total = macas*1;
			System.out.println("Valor total a pagar "+total);
		}
		if (macas < 12){
			total = macas*1.30;
			System.out.println("Valor total a pagar "+total);
		}
	}
}

