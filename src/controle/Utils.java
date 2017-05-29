package controle;

public class Utils {
	
	// TODO: Verifica se o vetor já está ordenado
	public boolean estaOrdenado(int[] vetor) {
		
		return true;
	}

	// Encontra o maior valor dentro do vetor
	private int encontraMaiorValor(int[] vetor) {
	    int max = vetor[0];
	    
	    for (int i = 0; i < vetor.length; i++) {
	        if (vetor[i] > max) {
	            max = vetor[i];
	        }
	    }
	    
	    return max;
	}
	
	// Algoritmo de ordenação tipo Bucket Sort
	public int[] ordenaBucket(int[] vetor) {
		
		// Definição de variáveis
		int maiorValor;
		int tamanhoDoVetor;
		int tamanhoDoBalde;
		int qtdBaldes;
		
		// Definições do balde
		maiorValor		= encontraMaiorValor(vetor); 
		tamanhoDoVetor	= vetor.length;
		tamanhoDoBalde	= (int) Math.ceil((double) maiorValor / tamanhoDoVetor);
		if (tamanhoDoBalde < tamanhoDoVetor) // Adequando o número de baldes 
			tamanhoDoBalde++;
		qtdBaldes		= (int) Math.ceil((double) maiorValor / tamanhoDoBalde);
		
		// Criando a matriz de baldes
		int[][] baldes = new int[qtdBaldes][tamanhoDoBalde];
		
		// Separando os valores nos devidos baldes
		for (int i = 0; i < vetor.length; i++) {

			// Definindo em qual balde o valor será inserido
			int indiceDoBalde = (int) Math.ceil((double) vetor[i] / tamanhoDoBalde) -1;
			
			// Correção do erro de corrida
			if ((vetor[i] % tamanhoDoBalde) == 0)
				indiceDoBalde++;

			for (int j = 0; j < tamanhoDoBalde; j++) {
				
				if (baldes[indiceDoBalde][j] == 0) {
					baldes[indiceDoBalde][j] = vetor[i];
					
					j = tamanhoDoBalde;
				}
				
			}
		}
		
		// Ordenando os baldes que ainda estão desordenados
		for (int i = 0; i < qtdBaldes; i++) {
			
		}
		
		return vetor;
	}

}
