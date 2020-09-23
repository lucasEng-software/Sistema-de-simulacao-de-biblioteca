

public class ListaDocumento {

	
	NoDocumento inicio;
	NoDocumento fim;
	int contador;
	int id = 1;
	
	
	public void add(Documento documento) {
		NoDocumento novo = new NoDocumento();
		documento.idUnico = id;
		novo.documento = documento;

		if (contador == 0) {
			inicio = novo;
			fim = novo;

		} else {

			fim.prox = novo;
			novo.ant = fim;
			fim = novo;

		}
		contador++;
		id++;

	}

	public Documento remove() {
		if (contador != 0) {
			Documento retorno = fim.documento;
			fim = fim.ant;
			contador--;
			return retorno;
		} else
			return null;

	}
}
