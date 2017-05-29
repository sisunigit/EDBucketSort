package controle;

import dominio.ListaLinearSequencial;

public class testaBucketSort {

	public static void main(String[] args) {

		Utils util = new Utils();

//		int[] vetor = {5,20,17,8,1,11,9,22,13,4,12,10,6,21,23,2};
		
		ListaLinearSequencial l = new ListaLinearSequencial(16);
		l.inserirElemento(5);
		l.inserirElemento(20);
		l.inserirElemento(17);
		l.inserirElemento(8);
		l.inserirElemento(1);
		l.inserirElemento(11);
		l.inserirElemento(9);
		l.inserirElemento(22);
		l.inserirElemento(13);
		l.inserirElemento(4);
		l.inserirElemento(12);
		l.inserirElemento(10);
		l.inserirElemento(6);
		l.inserirElemento(21);
		l.inserirElemento(23);
		l.inserirElemento(2);
		
		int[] vetor = l.getLista();
		
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
