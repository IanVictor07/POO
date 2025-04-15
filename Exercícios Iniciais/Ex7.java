import java.util.Scanner;
public class Ex7{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("diz teu salario");
		int sal = scan.nextInt();
		System.out.println("diz qntd tu vendeu\n");
		int val = scan.nextInt();
		if (val<1500){
			float com = (3*val)/100;
			System.out.printf("sal %.2f\n", sal + com);
		}else{
			float com1 = (3*1500)/100;
			float com2 = (5*(val-1500))/100;
			System.out.printf("sal %.2f\n", sal + com1 + com2);
		}
	}
}
