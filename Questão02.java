package Lista3;

public class Questão02 {

	public static int Pesquisar (int vet [], int indice) {
		
		if (indice >= vet.length) {
			
				return -999999;
				
			}
		
		return vet[indice];
		
	}
	
	
	public static void main(String[] args) {
		
		int vet [] = {1, 2, 3, 4, 5, 6, 8, 9, 10, -1, -2, -3, -4, -5, 11};
		
		System.out.println("A elemnto na posição escolhida é: " + Pesquisar (vet, 10));
		
	}
}
