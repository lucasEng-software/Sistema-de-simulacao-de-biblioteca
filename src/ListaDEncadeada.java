
public class ListaDEncadeada {

	NoLista inicio;
	NoLista fim;
	int contador = 0;

	public void adicionaFim(Pessoa funcionario) {
		NoLista novo = new NoLista();
		novo.pessoa = funcionario;

		if (contador == 0) {
			inicio = novo;
			fim = novo;

		} else {
			fim.prox = novo;
			novo.ant = fim;
			fim = novo;

		}

		contador++;
	}

	public String buscar(int id, int cpf, String senha, Hash hash) {

		for (int i = 0; i < hash.hash.length; i++) {
			if (hash.hash[i] != null) {
				NoLista aux = hash.hash[i].inicio;
				for (int j = 0; j < hash.hash[i].contador; j++) {

					if (senha.equals(aux.pessoa.senha) && cpf == aux.pessoa.cpf && id == aux.pessoa.trabalho) {
						return aux.pessoa.nome;
					} else
						aux = aux.prox;
				}
			}

		}

		return null;

	}
}
