package Lista3;

public class Questão20 {
	
	public static boolean Pesquisar (int vetX[], int x) {
		
		for (int i = 0; i < vetX.length; i++) {
			
			if (x == vetX[i]) {
				return true;
			}
			
		}
		return false;
	}

	public static void Diferença (int vetX[], int vetY[]) {
		
		for (int i = 0; i < vetX.length; i++) {
			
			if (Pesquisar (vetY, vetX[i]) == false) {
				System.out.print(vetX[i] + " ");
			}			
		}
	}
	
	public static void main(String[] args) {
		
		int vetX[] = {0, 1, 2, 3, 4, 5, 6};
		int vetY[] = {3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Vetor diferença");
		Diferença (vetX, vetY);
	}

}
