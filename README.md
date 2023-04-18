# Gestão de Projetos - Java

Este é um projeto de exemplo de um sistema simples de gestão de projetos em Java.

## Funcionalidades

- Adicionar projetos com nome, descrição e membros.
- Listar os projetos cadastrados.

## Requisitos de ambiente

- Java Development Kit (JDK) 8 ou superior instalado.
- Ambiente de desenvolvimento Java configurado.

## Como executar o projeto

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em um ambiente de desenvolvimento Java.
3. Compile e execute a classe `GestorProjeto.java` para rodar o programa.
4. Siga as instruções apresentadas no console para interagir com o sistema de gestão de projetos.

## Exemplo de uso

```java
// Adicionando projetos
String[] membrosProjeto1 = {"João", "Maria"};
gestorProjeto.adicionarProjeto("Projeto1", "Projeto de desenvolvimento web", membrosProjeto1);

String[] membrosProjeto2 = {"Pedro", "Ana", "Carlos"};
gestorProjeto.adicionarProjeto("Projeto2", "Projeto de análise de dados", membrosProjeto2);

// Listando projetos
gestorProjeto.listarProjetos();
