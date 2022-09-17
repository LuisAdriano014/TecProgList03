package Lista3;

public class Questão17 {

	public static int Soma (int vet[]) {
		
		int somatorio = 0;
		
		for(int i = 0; i < vet.length; i++) {
			somatorio += vet[i];
		}
		
		return somatorio;
		
	}
		
	public static int [] Explosão (int vetX[]) {
		
		int vetY[] = new int [Soma(vetX)];
		
		int cont = 0;
		
		for (int i = 0; i < vetX.length; i++) {
			
			for (int j = 0; j < vetX[i]; j++) {
				
				vetY[cont] = vetX[i];
				cont++;
			}
			
		}
		
		return vetY;
	}
	
	public static void main(String[] args) {

		int vetX [] = {1, 2, 3, 4, 5};
		
		int vetorResultante[] = Explosão(vetX);
		
		System.out.println("Vetor explosão\n");
		for (int i : vetorResultante) {
			System.out.print(i + "   ");
		}
	}
}