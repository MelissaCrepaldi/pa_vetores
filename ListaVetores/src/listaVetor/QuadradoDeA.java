package listaVetor;

import java.util.Scanner;

public class QuadradoDeA {
	public static void main(String[] args) {
		Scanner suicidio = new Scanner (System.in);
		final int SUICIDIO=10;
		int a[], b[], i;
		a = new int[SUICIDIO];
		b = new int [SUICIDIO];
		
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = suicidio.nextInt();
			b[i] = a[i] * a[i];
		}
		
		System.out.print("\nB = ");
		for (i=0; i<SUICIDIO; i++) {
			System.out.print(b[i]+ "  ");
		}
		
	}
}
