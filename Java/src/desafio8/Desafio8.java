package desafio8;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora e minuto de entrada (hh:mm): ");
		String in = sc.nextLine();
		System.out.print("Digite a hora e minuto de saida (hh:mm): ");
		String out = sc.nextLine();

		LocalTime entrada = LocalTime.parse(in);
		LocalTime saida = LocalTime.parse(out);

		long hora = entrada.until(saida, ChronoUnit.HOURS);
		long min = entrada.until(saida, ChronoUnit.MINUTES);

		double valor;

//		Validando se é hora inteira
		if (hora == 0) {
			hora += 1;
			min = 0;
		} else if ((min / hora) != 60) {
			hora += 1;
			min = 0;
		}

//		Cálculo do valor
		if (hora == 1) {
			valor = 4;
		} else if (hora > 2) {
			long h = hora - 2;
			valor = 6 + h;
		} else {
			valor = 6;
		}

		System.out.printf("Tempo considerado: %d horas\nValor a pagar: R$%.2f", hora, valor);

		sc.close();
	}

}
