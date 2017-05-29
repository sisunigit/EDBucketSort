package controle;

public class Utils {

	private int maxValue;
	private int vectorSize;
	private int bucketSize;
	private int numBucket;
	
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
		
		maxValue	= findMaxValue(vector); 
		vectorSize	= vector.length;
		bucketSize	= Integer.parseInt(Math.ceil(maxValue / vectorSize)+"");
		if (bucketSize >= vectorSize) 
			bucketSize++;
		numBucket	= Integer.parseInt(Math.ceil(maxValue / bucketSize)+"");
		
		int[] bucket = new int[bucketSize];
		
		for (int i = 0; i < numBucket; i++) {
			
		}
		
		return vector;
	}

}
