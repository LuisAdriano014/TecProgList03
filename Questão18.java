package Lista3;

public class Questão18 {
	
	public static boolean Pesquisar (int vetX[], int elemento) {
		
		for (int i = 0; i < vetX.length; i++) {
			if (elemento == vetX [i]) {
				return true;
			}
		}
		return false;
	}

	public static int Contagem (int vetX[], int elemento) {
		
		int cont = 0;
		for (int i = 0; i < vetX.length; i++) {
			if (elemento == vetX[i]) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int[] Organização (int vetX[]) {
		
		int vetorResultante[] = new int[vetX.length];
		int auxiliar = 0, cont = 0;
		
		for (int i = 0; i < vetX.length; i++) {
			auxiliar = Contagem (vetX, vetX[i]);
			if (Pesquisar(vetorResultante, vetX[i]) == false) {
				for (int j = 0; j < auxiliar; j++){
					vetorResultante [cont] = vetX[i];
					cont++;
				}
			}
		}
		return vetorResultante;
	}
	
	public static void main(String[] args) {
	
		int vetX [] = {1, 1, 2, 1, 4, 4};
		
		int vetRSL [] = Organização(vetX);
		
		System.out.println("Vetor organizado");
		
		for (int i = 0; i < vetRSL.length; i++) {
			System.out.print(vetRSL[i] + "   ");
		}
	}
}