package exercicios;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		double precoAlcool, precoGasolina;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Álcool x Gasolina");
		System.out.println("------------------------------------------");
		System.out.print("Informe o preço do litro do álcool: R$");
		precoAlcool = sc.nextDouble();
		System.out.print("Informe o preço do litro da gasolina: R$");
		precoGasolina = sc.nextDouble();
		
		if(precoAlcool < 0.7 * precoGasolina) {
			System.out.println("Abastecer com Álcool.");
		} else {
			System.out.println("Abastecer com Gasolina.");
		}		
		sc.close();
	}
}
