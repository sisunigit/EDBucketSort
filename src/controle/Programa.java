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

		while (opcMenu < 8) {
			System.out.println("\n\n1 - Inserir Elemento");
			System.out.println("2 - Remover Elemento");
			System.out.println("3 - Busca Sequencial");
			System.out.println("4 - Busca Binária");
			System.out.println("5 - Exibir Lista");
			System.out.println("6 - Ordena Crescente");
			System.out.println("7 - Ordena Decrescente");
			System.out.println("8 - Sair");

			System.out.println("\nDigite o número referente a opção desejada: ");
			opcMenu = entrada.nextInt();
			boolean resp;
			int caracter;

			switch (opcMenu) {
			case 1:
				System.out.println("\n\n*** Inserção ***");

				System.out.println("Digite o caracter a ser armazenado: ");
				caracter = entrada.nextInt();

				resp = listaLinearSeq.inserirElemento(caracter);
				System.out.println("Inserão realizada! selecione exibir para ver o conteúdo inserido");
				if (!resp) {
					System.out.println("Inserão n�o realizada! Lista Cheia!");
				}
				break;
				
			case 2:
				System.out.println("\n\n*** Exclusão ***");
				System.out.println("Digite o caracter a ser removido: ");
				caracter = entrada.nextInt();
				resp = listaLinearSeq.removeElemento(caracter);
				
				if (resp)
					System.out.println("Exclusão realizada!");
				else
					System.out.println("Exclusão não realizada!");
				break;
				
			case 3:
				System.out.println("\n\n*** Busca Sequencial ***");
				
				System.out.println("Digite o caracter a ser encontrado: ");
				caracter = entrada.nextInt();
				
				/* Cronometrando o tempo de execução */
				long tempoInicial4 = System.currentTimeMillis();

				int indice = listaLinearSeq.buscaElemento(caracter); // execução do método
				
				long tempoTotal4 = System.currentTimeMillis() - tempoInicial4;		
				/* Fim do cronômetro */				
								
				if (indice > -1) {
					System.out.println("Caracter Encontrado: ");
					System.out.println("Valor: " + listaLinearSeq.getLista()[indice] + " | Índice: " + indice);
					System.out.println("Busca concluida em [" + tempoTotal4 + "] milissegundos");
				} else if (indice == -2) {
					System.out.println("Caracter não encontrado.");
				} else {
					System.out.println("Lista vazia.");
				}
				break;
				
			case 4:
				System.out.println("\n\n*** Busca Binária ***");

				System.out.println("Digite o caracter a ser encontrado: ");
				caracter = entrada.nextInt();
				
				/* Cronometrando o tempo de execução */
				long tempoInicial3 = System.currentTimeMillis();

				int indice2 = listaLinearSeq.buscaBinaria(caracter); // execução do método
				
				long tempoTotal3 = System.currentTimeMillis() - tempoInicial3;		
				/* Fim do cronômetro */				

				if (indice2 > -1) {
					System.out.println("Caracter Encontrado: ");
					System.out.println("Valor: " + listaLinearSeq.getLista()[indice2] + " | Índice: " + indice2);
					System.out.println("Busca concluida em [" + tempoTotal3 + "] milissegundos");
				} else if (indice2 == -2) {
					System.out.println("Caracter não encontrado.");
				} else {
					System.out.println("Lista vazia.");
				}
				break;
				
			case 5:
				System.out.println("\n\n*** Exibição ***");
				if (!listaLinearSeq.listaVazia()) {
					for (int i = 0; i < listaLinearSeq.getUltimaPos() + 1; i++) {
						System.out.print(listaLinearSeq.getLista()[i] + "|");
					}
				} else {
					System.out.println("Lista Vazia! Exibição Impossível!");
				}
				break;
				
			case 6:
				System.out.println("\n\n*** Ordenação Crescente ***");
				
				Utils util = new Utils();

				/* Cronometrando o tempo de execução */
				long tempoInicial = System.currentTimeMillis();

				listaLinearSeq.setLista(util.ordenaBucket(listaLinearSeq.getLista(), 'c')); // execução do método
				
				long tempoTotal = System.currentTimeMillis() - tempoInicial;		
				/* Fim do cronômetro */				
				
				System.out.println("Ordenação concluida em [" + tempoTotal + "] milissegundos");
				
				break;
				
			case 7:
				System.out.println("\n\n*** Ordenação Decrescente ***");

				Utils util2 = new Utils();

				/* Cronometrando o tempo de execução */
				long tempoInicial2 = System.currentTimeMillis();

				listaLinearSeq.setLista(util2.ordenaBucket(listaLinearSeq.getLista(), 'd')); // execução do método
				
				long tempoTotal2 = System.currentTimeMillis() - tempoInicial2;		
				/* Fim do cronômetro */				
				
				System.out.println("Ordenação concluida em [" + tempoTotal2 + "] milissegundos");
				
				break;
								
			default:
				System.out.println("Valor Inválido - Fim de Execução!");
			}

		}
	}
}
