package controle;

import dominio.ListaLinearSequencial;

public class Utils {
	
	// TODO: Verifica se o vetor já está ordenado
	public boolean estaOrdenado(int[] vetor) {
		
		return false;
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
	
	// Encontra o menor valor dentro do vetor
	private int encontraMenorValor(int[] vetor) {
	    int min = encontraMaiorValor(vetor);
	    
	    for (int i = 0; i < vetor.length; i++) {
	        if ((vetor[i] < min) && vetor[i] != 0) {
	            min = vetor[i];
	        }
	    }
	    
	    return min;
	}
	
	// Todo: Algoritmo de ordenação tipo Bucket Sort
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
		
		// TODO: Ordenando os baldes que ainda estão desordenados
		for (int i = 0; i < qtdBaldes; i++) {
			
			if (!estaOrdenado(baldes[i])) {
				// Preparando um balde auxiliar
				ListaLinearSequencial bAux = new ListaLinearSequencial(tamanhoDoBalde);
				// Copiando os valores do balde
				for (int j = 0; j < tamanhoDoBalde; j++) {
					bAux.inserirElemento(baldes[i][j]);
				}
				
				// Preenchendo o balde auxiliar ordenadamente
				for (int j = 0; j < tamanhoDoBalde; j++) {
					
					int menorValor = encontraMenorValor(bAux.getLista());
					
					if (menorValor != 0)
						baldes[i][j] = menorValor;
					else
						baldes[i][j] = 0;
					
					bAux.removeElemento(menorValor);					
				}
			}
			
		}
		
		// Devolvendo os itens para o vetor original
		
		return vetor;
	}

}
