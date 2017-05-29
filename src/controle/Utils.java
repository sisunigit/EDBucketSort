package controle;

public class Utils {
	
	// TODO: Verifica se o vetor j� est� ordenado
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
		
		int maiorValor;
		int tamanhoDoVetor;
		int tamanhoDoBalde;
		int qtdBaldes;
		
		maiorValor	= encontraMaiorValor(vetor); 
		tamanhoDoVetor	= vetor.length;
		tamanhoDoBalde	= Integer.parseInt(Math.ceil(maiorValor / tamanhoDoVetor)+"");
		if (tamanhoDoBalde >= tamanhoDoVetor) 
			tamanhoDoBalde++;
		qtdBaldes	= Integer.parseInt(Math.ceil(maiorValor / tamanhoDoBalde)+"");
		
		// Cria a matriz de baldes
		int[][] baldes = new int[qtdBaldes][tamanhoDoBalde];
		
		for (int i = 0; i < vetor.length; i++) {
			
		}
		
		return vetor;
	}

}
