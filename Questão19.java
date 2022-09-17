package Lista3;

public class Questão19 {
	
	public static void Agrupar (int vetX[], int x) {
		
		int matriz[][] = new int [vetX.length/x][x];
		int j, cont = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (j = 0; j < x; j++) {
				matriz [i][j] = vetX [cont];
				cont++;
				System.out.print(matriz[i][j] + " ");
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int vetX[] = {0, 1, 2, 3, 4, 5};
		
		System.out.println("Vetor agrupado");
		
		Agrupar (vetX, 3);
	}

}
