package Lista3;

public class Questão15 {
	
	public static int [] Complemento (int vetX[], int vetY[]){
		
		int vetorResultante[] = new int[vetX.length];
		
		for (int i = 0; i < vetX.length; i++) {
			
			vetorResultante[i] = 10 - (vetX[i] + vetY[i]);
			
		}
		
		return vetorResultante;
		
	}

	public static void main(String[] args) {

		int vetX [] = {2, 1, 0, -1, -2, -3};
		int vetY [] = {0, 1, 2, 3, 4, 5};
		
		int vetRSL [] = Complemento(vetX, vetY);
		
		for (int i = 0; i < vetRSL.length; i++) {
			System.out.print(vetRSL[i] + "   ");
		}
	}
}