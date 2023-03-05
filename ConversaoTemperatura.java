package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversão de Temperatura");
		System.out.print("Informe a temperatura em Fahrenheit: ");
		fahrenheit = teclado.nextDouble();
		celsius = (5 * (fahrenheit - 32)) / 9;
		DecimalFormat formatador = new DecimalFormat("#0.0");
		System.out.println("Temperatura em Celsius: " + formatador.format(celsius) + "°C");
		teclado.close();
	}
}
