

public class Hash {

	


		public ListaDEncadeada hash[] = new ListaDEncadeada[11];

		public int h(int chave) {

			return chave * (37 / 32) % 11;

		}

		public void add(Pessoa funcionario) {

			int chave = h(funcionario.cpf);

			if (hash[chave] == null) {
				hash[chave] = new ListaDEncadeada();
				hash[chave].adicionaFim(funcionario);
			} else {
				hash[chave].adicionaFim(funcionario);
			}

		}

	

}
