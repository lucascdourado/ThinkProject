package desafio9;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a hora e minuto do inicio do jogo: (hh:mm): ");
		String in = sc.nextLine();
		System.out.print("Digite a hora e minuto do final do jogo: (hh:mm): ");
		String out = sc.nextLine();

		LocalTime entrada = LocalTime.parse(in);
		LocalTime saida = LocalTime.parse(out);

		long hora = entrada.until(saida, ChronoUnit.HOURS);
		long min = entrada.until(saida, ChronoUnit.MINUTES);

		long minDeJogo = min;

//		Validação pra saber se o jogo terminou no mesmo dia que começou
		if (min < 0) {
			minDeJogo = 1440 + min;
		}

//		Validando se é hora inteira		
		if ((min / hora) != 60) {
			long rest = min - (hora * 60);
			if (rest < 0 && rest > -30) {
				rest = -rest;
				minDeJogo -= rest;
				minDeJogo += 60;
			} else if (rest > 0) {
				minDeJogo -= rest;
				minDeJogo += 60;
			} else {
				minDeJogo -= rest;
			}
		}

		minDeJogo = minDeJogo / 60;

		System.out.println("O jogo durou aproximadamente " + minDeJogo + " horas");

		sc.close();
	}

}
