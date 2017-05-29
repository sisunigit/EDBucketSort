package controle;

import dominio.ListaLinearSequencial;

public class testaBucketSort {

	public static void main(String[] args) {

		Utils util = new Utils();

		int[] vetor = {82,80,12,13,11,10,9,54,56,904,128,516,514,348,9862,2,47,46,13,9,174,2508,6,77,66,98,85,};
		
//		int[] vetor = {2,47,46,13,9,174,2508,6,82,80,12,13,11,10,9,77,66,98,85,54,56,904,128,516,514,348,9862};

//		ListaLinearSequencial l = new ListaLinearSequencial(16);
//		l.inserirElemento(5);
//		l.inserirElemento(20);
//		l.inserirElemento(17);
//		l.inserirElemento(8);
//		l.inserirElemento(1);
//		l.inserirElemento(11);
//		l.inserirElemento(9);
//		l.inserirElemento(22);
//		l.inserirElemento(13);
//		l.inserirElemento(4);
//		l.inserirElemento(12);
//		l.inserirElemento(10);
//		l.inserirElemento(6);
//		l.inserirElemento(21);
//		l.inserirElemento(23);
//		l.inserirElemento(2);
		
//		int[] vetor = l.getLista();
		
		for (int i : vetor) {
			System.out.print(i+"|");
		}
		
		vetor = util.ordenaBucket(vetor);
		
		System.out.println();
		
		for (int i : vetor) {
			System.out.print(i+"|");
		}
		
//		System.out.println(vetor);
	}

}
