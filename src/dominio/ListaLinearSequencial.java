package dominio;

import java.awt.font.LayoutPath;

public class ListaLinearSequencial {
	private int[] lista;
	private int ultimaPos; /* INDICE DA ULTIMA POSI��O PEENCHIDA */

	public int[] getLista() {
		return lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public int getUltimaPos() {
		return ultimaPos;
	}

	public void setUltimaPos(int ultimaPos) {
		this.ultimaPos = ultimaPos;
	}

	public ListaLinearSequencial(int tamanho) {
		this.lista = new int[tamanho];
		ultimaPos = -1; /* LISTA VAZIA */
	}

	/* M�TODO PARA VERIFICAR SE A LISTA EST� CHEIA */
	public boolean listaCheia() {
		if (ultimaPos == lista.length - 1)
			return true;
		else
			return false;
	}

	/* M�TODO PARA VERIFICR SE EST� VAZIO */
	public boolean listaVazia() {
		if (ultimaPos == -1)
			return true;
		else
			return false;
	}

	/* INSERE "ELEMENTO" NA LISTA LINEAR SEQUENCIAL SE TIVER ESPA�O */
	public boolean inserirElemento(int elemento) {
		if (listaCheia()) {
			return false;
		} else {
			this.lista[++ultimaPos] = elemento;
			return true;
		}
	}

	/* REMOVE A PRIMEIRA OCORRENCIA DO ELEMENTO */
	public boolean removeElemento(int elemento) {
		if (listaVazia()) {
			return false;
		} else {
			int achou = this.buscaElemento(elemento);
			if (achou >= 0) {
				this.lista[achou] = this.lista[ultimaPos--];
			}
			return true;
		}
	}

	/* BUSCAR DE FORMA SEQU�NCIAL */
	public int buscaElemento(int elemento) {
		if (listaVazia()) {
			return -1;
		} else {
			for (int indice = 0; indice < ultimaPos + 1; indice++) {
				if (elemento == this.lista[indice]) {
					return indice;
				}
			}
			return -2; /*-2 QUANDO SE PROCURA E N�O ACHA*/ 
		}
	}

}