package Lista3;

public class Questão04 {

	public static int Somatorio (int vet[]) {
	
		int somatorio = 0;
		
		for(int i = 0; i < vet.length; i++) {
			somatorio += vet[i];
		}
		
		return somatorio;
		
	}
		
	public static void main(String[] args) {
		
		int vet [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		
		System.out.println("O somatório de todos os elementos é: " + Somatorio (vet));
	}

}
