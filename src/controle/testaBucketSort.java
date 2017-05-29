package controle;

public class testaBucketSort {

	public static void main(String[] args) {

		Utils util = new Utils();

		int[] vetor = {5,20,17,8,1,11,9,22,13,4,12,10,6,21,23,2};
		
		for (int i : vetor) {
			System.out.print(i+"|");
		}
		
		vetor = util.ordenaBucket(vetor);
		
//		System.out.println(vetor);
	}

}
