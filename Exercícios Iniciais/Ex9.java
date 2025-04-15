import java.util.Scanner;
public class Ex9 {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Digite o valor do lado A ");
	int a = scan.nextInt();
	System.out.println("Digite o valor do lado B ");
	int b = scan.nextInt();
	System.out.print("Digite o valor do lado C ");
	int c = scan.nextInt();
	
	if (c > a+b ||a > b+c || b > a+c){
		System.out.println("Vai se foder");
	}
}
}
