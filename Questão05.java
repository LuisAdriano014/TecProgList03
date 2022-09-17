package Lista3;

public class Questão05 {

	public static int[] Juntar (int vetX[], int vetY[]) {
		
		int vetorResultante[] = new int[vetX.length + vetY.length];
		int i, j;
		
		for (i = 0; i < vetX.length; i++) {
				vetorResultante[i] = vetX[i];
		}
		
		for (j = 0; j < vetY.length; j++) {
				vetorResultante[i] = vetY[j];
				i++;
		}
		
		return vetorResultante;
		
	}
	
	
	public static void main(String[] args) {
		
		int vetX [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		int vetY [] = {20, 50, 60, 70, 80, 90, 10};
		
		int vetRSL [] = Juntar(vetX, vetY);
		
		for (int i = 0; i < vetRSL.length; i++) {
			System.out.print(vetRSL[i] + "   ");
		}
	}
}