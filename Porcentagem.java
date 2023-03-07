package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
		double x, y, valor;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Porcentagem");
		System.out.println("x% de y = valor");
		System.out.println("-------------------");
		
		System.out.print("Informe o valor de x: ");
		x = teclado.nextDouble();
		System.out.print("Informe o valor de y: ");
		y = teclado.nextDouble();
		valor = (x * y) / 100;
		
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));
		teclado.close();
	}
}
