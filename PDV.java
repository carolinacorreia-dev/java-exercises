package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		double valorProduto, desconto, totalDesconto, valorPago, troco;
		
		System.out.println("PDV");
		System.out.print("Valor do produto: R$");
		valorProduto = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		
		totalDesconto = valorProduto - (valorProduto * desconto) / 100;
		
		System.out.println("Total com desconto: R$" + formatador.format(totalDesconto));
		
		System.out.println("_______________________________");
		System.out.print("Valor pago: R$");
		valorPago = teclado.nextDouble();
		
		if(valorPago > totalDesconto) {
			troco = valorPago - totalDesconto;
		} else {
			troco = 0;
		}
		
		System.out.println("Troco: R$" + formatador.format(troco));	
		
		teclado.close();
	}
}
