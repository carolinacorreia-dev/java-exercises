package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorServico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		
		double hora, remuneracao, custo, cargaHoraria;
		
		System.out.println("Cálculo do valor da hora de um serviço");
		System.out.print("Remuneração mensal pretendida: R$");
		remuneracao = sc.nextDouble();
		System.out.print("Custo operacional mensal: R$");
		custo = sc.nextDouble();
		System.out.print("Carga horária mensal de trabalho: ");
		cargaHoraria = sc.nextDouble();
		hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;
		
		System.out.println("Valor da hora: R$" + df.format(hora));
		
		sc.close();
	}
}
