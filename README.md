Sistema de Biblioteca
Este é um sistema de biblioteca simples desenvolvido em Java para gerenciamento de empréstimo de livros. O sistema permite a dois tipos de usuários — Bibliotecários e Usuários — interagir com a biblioteca via terminal. O bibliotecário pode cadastrar livros, enquanto o usuário pode visualizar livros disponíveis, pegar emprestado e devolver livros.

Funcionalidades
Para Bibliotecários:
Registrar novos livros no sistema.
Para Usuários:
Visualizar todos os livros disponíveis.
Pegar livros emprestados.
Devolver livros.
Estrutura do Projeto
O projeto está estruturado da seguinte forma:

application.Program: Classe principal que gerencia a execução do programa.
entities.Book: Representa um livro na biblioteca, com informações de título, autor, e disponibilidade.
entities.User: Representa um usuário da biblioteca, com informações pessoais e métodos para gerenciar empréstimos.
entities.Library: Responsável pelo gerenciamento de usuários e livros, além das operações de empréstimo e devolução.
entities.exception.LibraryException: Classe para tratamento de exceções personalizadas do sistema.
Como Usar
Pré-requisitos
Ter o Java JDK instalado na versão 8 ou superior.
Ter um ambiente de desenvolvimento Java como Eclipse, IntelliJ IDEA, ou outro.
Configuração
Clone o repositório ou baixe o código-fonte do projeto.
Importe o projeto para sua IDE.
Compile o projeto para garantir que não há erros.
Executando o Sistema
Execute a classe application.Program.
O sistema apresentará um menu inicial com as opções de acesso para Bibliotecário e Usuário.
Escolha uma das opções:
Para Bibliotecário, insira 1.
Para Usuário, insira 2.
Para encerrar o programa, insira 0.
Exemplo de Uso
Como Bibliotecário:
Ao escolher a opção "1", você poderá cadastrar um novo livro fornecendo o título e o autor.
Como Usuário:
Ao escolher a opção "2", você poderá:
Ver todos os livros disponíveis.
Pegar emprestado um livro digitando o título do livro.
Devolver um livro digitando o título do livro que deseja devolver.
Exceções Tratadas
LibraryException: Lançada quando há problemas como tentativa de pegar um livro que não está disponível ou devolver um livro que não foi emprestado.

Autor
Este sistema foi desenvolvido como um exercício de aprendizado de Java. Sinta-se à vontade para contribuir ou sugerir melhorias!

