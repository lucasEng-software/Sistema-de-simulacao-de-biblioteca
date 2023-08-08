# Projeto de estrutura de dados em JAVA para a simulação de uma biblioteca

## No projeto foi utilizado:
* linguagem java
* conceitos de Orientação a objetos
* Hash Map
* Lista encadeada
* Lista duplamente encadeada
* Heap 
______________________________________

# Sistema de Biblioteca da UFC - README

Este é um projeto que simula um sistema para a biblioteca do campus da UFC (Universidade Federal do Ceará) conseguir alocar livros para alunos de outros campus. O sistema passa por três fases para realizar a encomenda de livros.

## Fase 1: Encomenda de Livro - Criação do Processo

Nesta fase, o aluno procura a biblioteca do seu campus para criar um processo de encomenda de livro. O aluno é atendido por um estagiário, que fica encarregado de criar a documentação inicial do processo de encomenda e colocá-lo em uma lista de processos que serão avaliados por secretários da biblioteca.

### Detalhes importantes desta fase:

1. O documento de um processo possui um padrão que consta de: um código identificador único, um campo de prioridade (prioridade que a encomenda possui para envio), nome do aluno, nome do campus onde está o livro, o nome do campus onde está o aluno, nome do responsável pela encomenda (bibliotecário), e um campo com detalhes sobre o livro (ex: nome, autor, dentre outros).
2. O estagiário é responsável por preencher apenas o nome do aluno e o campo com detalhes sobre o livro. O código identificador único é criado pelo sistema assim que o estagiário cadastra o documento na lista de processos.
3. Para cadastrar o documento no sistema (cadastrar na lista de processos), o estagiário não precisa estar logado no sistema, ou seja, não é necessária a verificação da pessoa que está cadastrando o documento no sistema.
4. A lista de processos será implementada com uma lista duplamente encadeada com ponteiros no início e no fim. O aluno deve decidir a ordem de inserção e a ordem de remoção dessa lista.

## Fase 2: Avaliação dos Processos pelos Secretários

Nesta fase, qualquer um dos secretários da biblioteca pode remover um processo da lista de processos, avaliá-lo e cadastrar o documento na fila de processos, atribuindo um valor de token de 0 a 100 para representar a prioridade da encomenda.

### Detalhes importantes desta fase:

1. Assim que o secretário pedir para remover um documento, o sistema pedirá que ele se identifique, requisitando seu CPF e senha. Esta verificação será processada através de uma tabela hash de tamanho 11, com função hash e tratamento de colisão definidos pelo aluno.
2. Os dados dos secretários da biblioteca devem estar pré-cadastrados no sistema. O aluno deverá criar pelo menos 3 secretários fictícios, armazenando para cada secretário: nome, CPF, senha e um campo para garantir que esta pessoa é de fato um secretário no sistema.
3. Quando o secretário remover um documento da fila, automaticamente o sistema adicionará seu nome no campo "nome do responsável pela encomenda" do documento removido.
4. O token de prioridade atribuído pelo secretário será colocado em uma fila de prioridades, implementada utilizando heap máxima.

## Fase 3: Execução do Transporte da Encomenda

Nesta fase, qualquer um dos transportadores pode remover um documento da fila de prioridade de processos a serem transportados e dar início aos pedidos formais para executar o transporte da encomenda do livro.

### Detalhes importantes desta fase:

1. Assim que o transportador pedir para remover um documento da fila de prioridade de processos, o sistema pedirá que ele se identifique, requisitando seu CPF e senha. Esta verificação será processada através da mesma tabela hash definida na fase 2.
2. Os dados dos transportadores do sistema devem estar pré-cadastrados no sistema. O aluno deve criar pelo menos 5 transportadores fictícios, armazenando para cada transportador: nome, CPF, senha e um campo para garantir que esta pessoa é de fato um transportador no sistema.
3. O transportador removerá sempre o documento de maior prioridade da fila de processos. Após a remoção, nada mais será feito pelo sistema.

**Nota**: Este é um projeto fictício criado apenas para fins educacionais, simulando o funcionamento de um sistema para alocar livros para alunos de diferentes campus da UFC.
