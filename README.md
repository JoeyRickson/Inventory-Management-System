# Sistema de Gerenciamento de Estoque

Este é um Sistema de Gerenciamento de Estoque onde os usuários podem adicionar, editar, remover e visualizar itens no estoque.

## Funcionalidades

O programa oferece as seguintes funcionalidades:

1. **Adicionar novo produto:** Permite aos usuários adicionar um novo produto ao estoque, inserindo o nome do produto, data de fabricação, data de validade, quantidade e tipo.

2. **Editar produto existente:** Ainda não implementado.

3. **Remover produto do estoque:** Ainda não implementado.

4. **Visualizar todos os produtos no estoque:** Ainda não implementado.

5. **Sair:** Encerra o programa.

## Estrutura do Projeto

O projeto é organizado da seguinte forma:

- `src/`: Contém o código-fonte do programa.
  - `DAO/`: Diretório com classes relacionadas ao acesso a dados.
    - `InventoryDAO.java`: Classe responsável pela manipulação dos dados do inventário.
  - `entity/`: Diretório com as classes de entidade do sistema.
    - `Inventory.java`: Classe que representa um item do inventário.
  - `App.java`: Classe principal que contém o método `main` e implementa a interface do usuário via linha de comando.
  - `conexaoSimulado/`: Diretório com um exemplo de conexão simulada com o banco de dados.

- `bin/`: Diretório onde os arquivos compilados são armazenados.

## Dependências

O programa atualmente não possui dependências externas além do Java SE.

Certifique-se de fornecer uma conexão com o banco de dados válido para a aplicação. Dentro do diretório `src/conexaoSimulado`, há um exemplo de como você pode implementar uma conexão simulada. O usuário deve configurar a conexão com o banco de dados real e, se necessário, adicionar drivers JDBC ao diretório `lib/`.

## Executando o Programa

Para executar o programa, compile o arquivo `App.java` e execute-o. Certifique-se de que o Java esteja instalado no seu sistema.

## Observações

- Este código ainda não está completo, pois requer um banco de dados real para armazenar os dados. O usuário é responsável por configurar a conexão com o banco de dados real.
- As funcionalidades de edição e remoção de produtos ainda não estão implementadas e exibem uma mensagem indicando que estão pendentes.
- Lembre que dentro src existe a conexao e ela está lá como um exemplar onde pode ser renomeada e o usuário vai adicionar os dados do banco real que vai refletir na adição de mais strings na DAO que vai refletir para app , fica a mercer do usuário as mudanças/adições.
- Lembre do usuário dos drives que ele tem que levar para lib qual seja a conexão ou usar outras opções como:
  - Você pode criar uma classe de conexão simulada que estende uma classe abstrata de conexão;
  - Você pode criar um mock usando uma biblioteca de teste como Mockito;
  - Você pode Apenas retornar null para indicar que é uma conexão simulada.

