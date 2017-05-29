package controle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Utils {

	// Encontra o maior valor dentro do vetor
	private int findMaxValue(int[] vector) {
	    int max = vector[0];
	    for (int i = 0; i < vector.length; i++) {
	        if (vector[i] > max) {
	            max = vector[i];
	        }
	    }
	    
	    return max;
	}
	
	// Algoritmo de ordenação tipo Bucket Sort
	public int[] ordenaBucket(int[] vector) {
		
		int maxValue;
		int vectorSize;
		int bucketSize;
		int numBucket;
		
		maxValue	= findMaxValue(vector); 
		vectorSize	= vector.length;
		bucketSize	= Integer.parseInt(Math.ceil(maxValue / vectorSize)+"");
		if (bucketSize >= vectorSize) 
			bucketSize++;
		numBucket	= Integer.parseInt(Math.ceil(maxValue / bucketSize)+"");
		
		// Cria a matriz de baldes
		int[][] buckets = new int[numBucket][bucketSize];
		
		for (int i = 0; i < vector.length; i++) {
			
		}
		
		return vector;
	}

}
