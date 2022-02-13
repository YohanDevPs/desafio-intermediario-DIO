/*
Maria acabou de iniciar seu curso de graduação na faculdade de medicina
e precisa de sua ajuda para organizar os experimentos de um laboratório
o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias
foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram
realizados,o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
		
Entrada:
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de
teste que vem a seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15)
que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'),
indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
		
Saída:
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada
e o percentual de cada uma em relação ao total de cobaias utilizadas,
sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char ch;
		int s = 0, r = 0, c = 0;
		int animais;
		int soma = 0;

		for (int i = 0; i < n; i++) {
			animais = 0;
			animais = input.nextInt();
			ch = input.next().charAt(0);
			if (ch == 'C') {
				c += animais;
			}
			if (ch == 'R') {
				r += animais;
			}
			if (ch == 'S') {
				s += animais;
			}
			soma += animais;
		}
		double percentCoelhos = ((double) c * 100) / (double) soma;
		double percentSapos = ((double) s * 100) / (double) soma;
		double percentRatos = ((double) r * 100) / (double) soma;

		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percentCoelhos) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f", percentRatos) + " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f", percentSapos) + " %");
		input.close();
	}
}
