package desafio10;

import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor: ");
		Integer valorTotal = sc.nextInt();
		Integer valorDecomposto = valorTotal;

		Integer nota100 = 0;
		Integer nota50 = 0;
		Integer nota20 = 0;
		Integer nota10 = 0;
		Integer nota5 = 0;
		Integer nota2 = 0;
		Integer nota1 = 0;

		while (valorDecomposto > 0) {
			if (valorDecomposto >= 100) {
				nota100++;
				valorDecomposto -= 100;
			} else if (valorDecomposto >= 50) {
				nota50++;
				valorDecomposto -= 50;
			} else if (valorDecomposto >= 20) {
				nota20++;
				valorDecomposto -= 20;
			} else if (valorDecomposto >= 10) {
				nota10++;
				valorDecomposto -= 10;
			} else if (valorDecomposto >= 5) {
				nota5++;
				valorDecomposto -= 5;
			} else if (valorDecomposto >= 2) {
				nota2++;
				valorDecomposto -= 2;
			} else {
				nota1++;
				valorDecomposto -= 1;
			}
		}

		System.out.println("Valor a ser decomposto: " + valorTotal + "\nQuantidade de notas: \nNotas de 100: " + nota100
				+ "\nNotas de 50: " + nota50 + "\nNotas de 20: " + nota20 + "\nNotas de 10: " + nota10
				+ "\nNotas de 5: " + nota5 + "\nNotas de 2: " + nota2 + "\nNotas de 1: " + nota1);

		sc.close();
	}

}
