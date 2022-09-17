package Lista3;

public class Questão01 {

	public static int Pesquisar (int vet [], int elemento) {
		
		for(int i = 0; i < vet.length; i++) {
			
			if (elemento == vet[i]) {
				return i;
			}
		}
		
		return -100;
		
	}
	
	public static void main(String[] args) {
		int vet [] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
		System.out.println("A posição do elemento é: " + Pesquisar (vet, 8));
	}
}
