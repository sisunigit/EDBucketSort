package controle;

import java.util.Scanner;

import dominio.ListaLinearSequencial;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o tamanho da lista: ");
		int tam = entrada.nextInt();

		System.out.println("Lista de tamanho: " + tam);
		ListaLinearSequencial listaLinearSeq = new ListaLinearSequencial(tam);

		int opcMenu = 0;

		while (opcMenu < 5) {
			System.out.println("1 - Inserir Elemento");
			System.out.println("2 - Localizar Elemento");
			System.out.println("3 - Remover Elemento");
			System.out.println("4 - Exibir Lista");
			System.out.println("5 - Sair");

			System.out.println("\nDigite o n�mero referente a op��o desejada: ");
			opcMenu = entrada.nextInt();
			boolean resp;
			int caracter;

			switch (opcMenu) {
			case 1:
				System.out.println("Solicitou Inser��o");

				System.out.println("\nDigite o caracter a ser armazenado: ");
				caracter = entrada.nextInt();

				resp = listaLinearSeq.inserirElemento(caracter);
				System.out.println("Inser��o realizada! selecione exibir para v�r o conte�do inserido");
				if (!resp) {
					System.out.println("Inser��o n�o realizada! Lista Cheia!");
				}
				break;
			case 2:
				System.out.println("Solicitou Localizar");

				System.out.println("\nDigite o caracter a ser encontrado: ");
				caracter = entrada.nextInt();

				int indice = listaLinearSeq.buscaElemento(caracter);

				System.out.println("Caracter Encontrado: ");

				if (indice > -1) {
					System.out.println(listaLinearSeq.getLista()[indice]);
				} else if (indice == -2) {
					System.out.println("Caracter n�o encontrado.");
				} else {
					System.out.println("Lista vazia.");
				}
				break;
			case 3:
				System.out.println("Solicitou Exclus�o");
				System.out.println("\nDigite o caracter a ser removido: ");
				caracter = entrada.nextInt();
				resp = listaLinearSeq.removeElemento(caracter);

				if (!resp) {
					System.out.println("Exclus�o n�o realizada! Lista Cheia!");
				}
				break;
			case 4:
				System.out.println("Solicitou Exibir");
				if (!listaLinearSeq.listaVazia()) {
					for (int i = 0; i < listaLinearSeq.getUltimaPos() + 1; i++) {
						System.out.println(listaLinearSeq.getLista()[i]);
					}
				} else {
					System.out.println("Lista Vazia! Exibi��o Imposs�vel!");
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Valor Inv�lido - Fim de Execu��o!");
			}

		}
	}
}
