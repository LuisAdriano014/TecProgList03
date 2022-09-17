package Lista3;

public class Questão08 {

	public static int somatório (int vet[]) {
		
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		
		return soma;
	}
	
	public static int [] priorizar (int vet[]) {
		
		float media = somatório (vet)/vet.length;
		int vetorResultante[] = new int[vet.length];
		int cont = 0;
		
		for (int i = 0; i < vet.length; i++) {
			
			if(vet[i] > media) {
				vetorResultante [cont] = vet[i];
				cont++;
			}
		}
		
		return vetorResultante;
		
	}
	
	public static void main(String[] args) {
		
		int vet [] = {10, 20, 30, 40, 50, 60, 70};
		System.out.println("O vetor resultado é: ");
		int vetorResultante[] = priorizar (vet);
		for (int i = 0; i < vetorResultante.length; i++) {
			System.out.println(vetorResultante[i] + "   ");
		}
	}

}
