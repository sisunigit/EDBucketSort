package dominio;

public class ListaLinearSequencial {
	private int[] lista;
	private int ultimaPos; // ÍNDICE DA ÚLTIMA POSIÇÃO PREENCHIDA

	public ListaLinearSequencial(int tamanho) {
		this.lista	= new int[tamanho];
		ultimaPos	= -1; // LISTA VAZIA
	}
	
	public int[] getLista() {
		return this.lista;
	}

	public void setLista(int[] lista) {
		this.lista = lista;
	}

	public int getUltimaPos() {
		return this.ultimaPos;
	}

	public void setUltimaPos(int ultimaPos) {
		this.ultimaPos = ultimaPos;
	}

	// MÉTODO PARA VERIFICAR SE A LISTA ESTÁ CHEIA
	public boolean listaCheia() {
		if (this.ultimaPos == lista.length - 1)
			return true;
		else
			return false;
	}

	// MÉTODO PARA VERIFICAR SE A LISTA ESTÁ VAZIA
	public boolean listaVazia() {
		if (this.ultimaPos == -1)
			return true;
		else
			return false;
	}

	// INSERE "ELEMENTO" NA LISTA LINEAR SEQUENCIAL SE TIVER ESPAÇO
	public boolean inserirElemento(int elemento) {
		if (listaCheia()) 
			return false;
		else {
			this.lista[++ultimaPos] = elemento;
			
			return true;
		}
	}

	// REMOVE A PRIMEIRA OCORRÊNCIA DO ELEMENTO
	public boolean removeElemento(int elemento) {
		if (listaVazia())
			return false;
		else {
			int achou = this.buscaElemento(elemento);
			
			if (achou >= 0)
				this.lista[achou] = this.lista[ultimaPos--];
			
			return true;
		}
	}

	// BUSCAR DE FORMA SEQUENCIAL
	public int buscaElemento(int elemento) {
		if (listaVazia())
			return -1;
		else {
			for (int indice = 0; indice < ultimaPos + 1; indice++) {
				if (elemento == this.lista[indice])
					return indice;
			}
			
			return -2; // -2 QUANDO SE PROCURA E NÃO ACHA 
		}
	}
}