

public class Heap {
	
	 Documento heap[] = new Documento[10];
	 int contador = 0;

	public void adiciona(Documento documento) {
		heap[contador + 1] = documento;
		contador++;
		subir(contador);

	}

	public Documento remove() {
		if (contador > 0) {
			Documento retorno = heap[1];
			heap[1] = heap[contador];
			contador--;
			descer(1);

			return retorno;
		} else
			System.out.println("fila vazia");
		    return null;
	}

	public void subir(int i) {
		int j = i / 2;

		if (j >= 1) {
			if (heap[i].prioridade > heap[j].prioridade) {
				Documento aux = heap[i];
				heap[i] = heap[j];
				heap[j] = aux;
				subir(j);
			}

		}

	}

	public void descer(int i) {
		int j = i * 2;

		if (j <= contador) {
			if (j < contador) {

				if (heap[j + 1].prioridade > heap[j].prioridade) {
					j = j + 1;
				}

				if (heap[j].prioridade > heap[i].prioridade) {
					Documento aux = heap[i];
					heap[i] = heap[j];
					heap[j] = aux;
					descer(j);
				}

			}
		}

	}

}
