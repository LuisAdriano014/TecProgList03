package Lista3;

public class Questão06 {


	public static int[] Inverso (int vet[]) {
		
		int vetorResultante[] = new int[vet.length];
		int i, cont;
		cont = vet.length - 1;
		
		for (i = 0; i < vet.length; i++) {
				vetorResultante[cont] = vet[i];
				cont--;
		}
		
		return vetorResultante;
		
	}
	
	public static void main(String[] args) {

		int vet [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		
		int vetRSL [] = Inverso (vet);
		
		for (int i = 0; i < vetRSL.length; i++) {
			System.out.print(vetRSL[i] + "   ");
		}
	}
}