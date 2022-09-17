package Lista3;

public class Questão03 {

	public static int[] SepararValores (int vet[]) {
		
		int vetorResultante[] = new int[vet.length];
		int contar = 0;
		
		for (int i = 0; i < vet.length; i++) {
				
			if (vet[i] < 0) {
				vetorResultante[contar] = vet[i];
				contar++;
			}
			
		}
		
		for (int i = 0; i < vet.length; i++) {
			
			if (vet[i] >= 0) {
				vetorResultante[contar] = vet[i];
				contar++;
			}
			
		}
		
		return vetorResultante;
		
	}
	
	
	public static void main(String[] args) {
		
		int vet [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		
		System.out.println("Novo vetor");
		int vetorResultante[] = SepararValores(vet);
		
		
		for (int i = 0; i < vetorResultante.length; i++) {
			System.out.print(vetorResultante[i] + "   ");
		}
	}
}