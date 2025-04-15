import java.util.*;

public class Locadora{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		Veiculo veiculo1 = new Veiculo("ABC", "Corsa", "ECONOMICO", 500);
		Veiculo veiculo2 = new Veiculo("DEF", "Duster", "SUV", 100);
		Veiculo veiculo3 = new Veiculo("GHI", "Ferrari", "LUXO");
		int carro, dias, aluguel, km, seg, opt;
		boolean novo = true, seguro;
		do{
			do{
				System.out.printf("Bem vindo a Locadora, qual carro deseja?\n");
				System.out.println("1 - " + veiculo1.exibirDetalhes());
				System.out.println("2 - " + veiculo2.exibirDetalhes());
				System.out.println("3 - " + veiculo3.exibirDetalhes());
				carro = scan.nextInt();
			}while(carro<0 || carro>3);
			
			do{
				System.out.printf("1 - Aluguel sem km informado\n2 - Aluguel com km informado\n3 - Aluguel com km informado e seguro\n");
				aluguel = scan.nextInt();
			}while (aluguel<0 || aluguel>3);
			
			System.out.printf("Qual a quantidade de dias?\n");
			dias = scan.nextInt();
			switch (carro){
				case 1:
					switch (aluguel){
						case 1:
							System.out.println("R$: " + veiculo1.calcularLocacao(dias));
							break;
						case 2:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.println("R$: " + veiculo1.calcularLocacao(dias,km));
							break;
						case 3:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.printf("Deseja seguro?\n1 - Sim\n2 - Não\n");
							seg = scan.nextInt();
							if (seg == 1)
								System.out.println("R$: " + veiculo1.calcularLocacao(dias,km,true));
							else
								System.out.println("R$: " + veiculo1.calcularLocacao(dias,km,false));
							break;
						default:
							break;
					}
					break;
				case 2:
					switch (aluguel){
						case 1:
							System.out.println("R$: " + veiculo2.calcularLocacao(dias));
							break;
						case 2:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.println("R$: " + veiculo2.calcularLocacao(dias,km));
							break;
						case 3:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.printf("Deseja seguro?\n1 - Sim\n2 - Não\n");
							seg = scan.nextInt();
							if (seg == 1)
								System.out.println("R$: " + veiculo2.calcularLocacao(dias,km,true));
							else
								System.out.println("R$: " + veiculo2.calcularLocacao(dias,km,false));
							break;
						default:
							break;
					}
					break;
				case 3:
					switch (aluguel){
						case 1:
							System.out.println("R$: " + veiculo3.calcularLocacao(dias));
							break;
						case 2:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.println("R$: " + veiculo3.calcularLocacao(dias,km));
							break;
						case 3:
							System.out.printf("Qual a quantidade de km?\n");
							km = scan.nextInt();
							System.out.printf("Deseja seguro?\n1 - Sim\n2 - Não\n");
							seg = scan.nextInt();
							if (seg == 1)
								System.out.println("R$: " + veiculo3.calcularLocacao(dias,km,true));
							else
								System.out.println("R$: " + veiculo3.calcularLocacao(dias,km,false));
							break;
							
						default:
							break;
					}
					break;
				default:
					break;
			}
			System.out.println("1 - " + veiculo1.exibirDetalhes());
			System.out.println("2 - " + veiculo2.exibirDetalhes());
			System.out.println("3 - " + veiculo3.exibirDetalhes());
			System.out.printf("Novo aluguel?\n1 - Sim\n2 - Não\n");
			opt = scan.nextInt();
			if(opt == 2)
				novo = false;
		}while(novo);

	}
}


