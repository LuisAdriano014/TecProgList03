package Lista3;

public class Questão07 {

	public static void InversoVetor (int vetX[], int vetY[]) {
		
		int vetorResultante[] = new int[vetX.length];
		
		for (int i = 0; i < vetY.length; i++) {
				vetorResultante[i] = vetX[i];
				vetX[i] = vetY[i];
				vetY[i] = vetorResultante[i];
		}
	}
	
	public static void main(String[] args) {

		int vetX [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		int vetY [] = {20, 50, 60, 70, 80, 90, 10, 40, 60, 90, 15, 12, 13, 18, 20};
		
		InversoVetor(vetX, vetY);
		
		System.out.println("O novo vetor X é:");
		for (int i = 0; i < vetX.length; i++) {
			System.out.print(vetX[i] + "   ");
		}
		System.out.println("\nO novo vetor Y é:");
		for (int i = 0; i < vetY.length; i++) {
			System.out.print(vetY[i] + "   ");
	}
}
}
