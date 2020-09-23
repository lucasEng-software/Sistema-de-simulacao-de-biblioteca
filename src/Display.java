
import java.util.*;




public class Display {

	Scanner s = new Scanner(System.in);
    ListaDocumento lista = new ListaDocumento();
	Heap heap = new Heap();
	Hash hash;
	ListaDEncadeada l = new ListaDEncadeada();
	
	
	public Display(Hash hash) {
		this.hash = hash;	
		menu();
		
	}

	
	public void menu() {
		
		System.out.println("1-Cadastrar Documento       ");
		System.out.println("2-Remover Documento da Lista de Documentos para Heap");
		System.out.println("3-Remover Documento da Heap");	
		System.out.println("0-sair                     ");

		int opcao = Integer.parseInt(s.nextLine());

		switch (opcao) {
		case 1:
			
			adicionaDocumento();
			menu();
			break;

		case 2:
			verificaSecretario();
			menu();
			break;

		case 3:
          
			if(verificaTranportador() != null) {
				imprime (heap.remove());
			} else {
				System.out.println("login errado");
			}
			
			menu();
			break;

		case 0:
			break;
		
		}
	}
	
	
	


	public void adicionaDocumento() {
		System.out.println(" nome do aluno:");
		String nomeAluno = (s.nextLine());

		System.out.println(" nome do livro:");
		String nomeLivro = (s.nextLine());

		System.out.println("nome do autor livro:");
		String nomeAutor = (s.nextLine());

		Aluno aluno = new Aluno(nomeAluno);
		Livro livro = new Livro(nomeLivro, nomeAutor);
		Documento documento = new Documento(aluno, livro);
        
		lista.add(documento);
	}
	
	public String verificaTranportador() {

		
		System.out.println("Cpf");
		int cpf = Integer.parseInt(s.nextLine());

		System.out.println("Senha:");
		String senha = s.nextLine();

		
		int id = 0;

		return l.buscar(id, cpf, senha, hash);
	}

	public void verificaSecretario() {

		
		System.out.println("Cpf");
		int cpf = Integer.parseInt(s.nextLine());

		System.out.println("Senha:");
		String senha = s.nextLine();

		System.out.println("=========");
		int id = 1;

		
		if (l.buscar(id, cpf, senha, hash) != null) {
			
				Documento documentoRemovido = lista.remove();
				if(documentoRemovido != null) {
				imprime(documentoRemovido);
				heap.adiciona(mudarDocumento(documentoRemovido, l.buscar(id, cpf, senha, hash)));
				}
				else {
					System.out.println("nao existe documento");
				}

		} else {
			System.out.println("login errado");
		}
	}

	public Documento mudarDocumento(Documento documento, String nome) {
		
	

		documento.responsavel = nome;;
		System.out.println("Digite a prioridade do documento:");
		documento.prioridade  = Integer.parseInt(s.nextLine());

		System.out.println("Digite o campus do aluno:");
		documento.aluno.campus = s.nextLine();

		System.out.println("Digite o campus do Livro:");
		documento.livro.campus  = s.nextLine();

		System.out.println();
		System.out.println("documentação adicionada na heap ");
		

		return documento;
	}
	
	public void imprime(Documento documento) {
		System.out.println("nome: " + documento.aluno.nome);
		System.out.println("campus do aluno: " + documento.aluno.campus);
		System.out.println("campus do livro: " + documento.livro.campus);
		System.out.println("nome livro: " + documento.livro.nome);
		System.out.println("autor livro: " + documento.livro.autor);
		System.out.println("id: " + documento.idUnico);
		System.out.println("prioridade: " + documento.prioridade);
		System.out.println("responsavel: " + documento.responsavel);

		System.out.println("Documento Removido");
		
		
		
		
	}
	
	
}
