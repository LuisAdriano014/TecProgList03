package Lista3;

import java.util.Random;

public class Questão16 {
	
	public static void Povoamento (int vetX[]){
		
		Random gerador = new Random ();
		
		for (int i = 0; i < vetX.length; i++) {
			vetX[i] = gerador.nextInt(101);
		}
		
	}
	
	public static int[] Polarizar (int vetX[]) {
		
		int vetorResultante[] = new int[vetX.length];
		int i, cont = 0;
		
		for (i = 0; i < vetX.length; i++) {
				if (vetX[i] % 2 != 0) {
				vetorResultante[i] = vetX[i];
				cont++;
				}
		}
		
		for (i = vetX.length - 1; i >= 0; i--) {
				if (vetX[i] % 2 == 0) {
				vetorResultante[cont] = vetX[i];
				cont++;
				}
		}
		
		return vetorResultante;
		
	}
	

	public static void main(String[] args) {
		
		int vetX[] = new int [10];
		
		Povoamento (vetX);
		
		int vetRSL [] = Polarizar(vetX);
		
		for (int i = 0; i < vetRSL.length; i++) {
			System.out.print(vetRSL[i] + "   ");
		}
	}
}