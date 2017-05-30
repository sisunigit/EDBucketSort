package controle;

import dominio.ListaLinearSequencial;

public class testaBucketSort {

	public static void main(String[] args) {

		Utils util = new Utils();

//		int[] vetor = {
//				128,516,514,348,9862,2,47,46,13,9,174,2508,6,77,66,98,85,36,
//				811,17,59,99,18,277,26,666666,999,3,17,140,421,505,798,197,405,
//				72,14,88,25,30,5,33,274,20,700,82,80,12,13,11,10,92006,56,904,
//				25,632,94,29,54,65,195,7,170,5942,1,66,757,4,2139,142,22,9001,
//				365179,10001,9684,23,79,1000,95,3,4656,700,23,4821,10,7780,8
//		};
		
//		int[] vetor = {
//				72,14,88,25,30,5,33,274,20,700,82,80,12,13,11,10,9,54,56,904,
//				128,516,514,348,9862,2,47,46,13,9,174,2508,6,77,66,98,85,36,
//				25,632,94,29,54,65,195,7,170,5942,2,66,757,4,2139,142,22,9001,
//				365179,10001,9684,23,79,1000,95,3,4656,700,23,4821,10,7780,8
//		};
		
//		int[] vetor = {2,47,46,13,9,174,2508,6,82,80,12,13,11,10,9,77,66,98,85,54,56,904,128,516,514,348,9862};
		
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
		
		System.out.println();
		
		/* Cronometrando o tempo de execução */
		long tempoInicial = System.currentTimeMillis();

		vetor = util.ordenaBucket(vetor, 'c'); // execução do método
		
		long tempoTotal = System.currentTimeMillis() - tempoInicial;		
		/* Fim do cronômetro */
		
		for (int i : vetor) {
			System.out.print(i+"|");
		}
		
		System.out.println("\n\nOrdenação concluida em [" + tempoTotal + "] milissegundos");		
	}

}
