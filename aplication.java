package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaAbaixoMedia;

import java.util.Locale;
import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double vect[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("MEDIA DO VETOR = ");
		double media = 0.0;
		for (int i = 0; i < n; i++) {
			media += vect[i] / n;
		}
		System.out.printf("%.3f  ", media);
		
		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for (int i = 0; i < n; i++) {
			if(vect[i] < media ) {
				System.out.printf("%.3f\n", vect[i]);
			
			}
		}
		
		

		sc.close();

	}

}
