# Carrinho de Compras em Java

Projeto desenvolvido em Java com o objetivo de praticar conceitos de Programação Orientada a Objetos.

O sistema simula um carrinho de compras simples, permitindo selecionar produtos, visualizar a fatura, alterar quantidades, excluir itens e finalizar a compra.

## Funcionalidades

* Exibir produtos cadastrados
* Comprar produtos pelo código
* Informar a quantidade desejada
* Visualizar os itens da fatura
* Exibir o valor total da compra
* Excluir itens da fatura
* Alterar a quantidade de um item
* Voltar aos menus sem realizar alterações
* Finalizar a compra

## Estrutura do Projeto

| Classe    | Responsabilidade                                             |
| --------- | ------------------------------------------------------------ |
| `Produto` | Armazena nome, código e preço do produto                     |
| `Item`    | Representa um produto comprado, sua quantidade e valor total |
| `Fatura`  | Armazena os itens e calcula o valor total da compra          |
| `Main`    | Controla o menu e a interação com o usuário                  |

## Conceitos de OO Utilizados

O projeto utiliza alguns conceitos de Orientação a Objetos, como:

* Classes e objetos
* Encapsulamento
* Atributos privados
* Construtores
* Métodos getters e setters
* Composição entre classes

## Tecnologias Utilizadas

* Java
* `ArrayList`
* `Scanner`
* Git
* GitHub

## Como Executar

1. Clone o repositório.
2. Abra o projeto em uma IDE compatível com Java.
3. Compile o projeto.
4. Execute a classe `Main`.
5. Utilize o menu exibido no terminal.

## Testes Realizados

| Teste                                  | Resultado |
| -------------------------------------- | --------- |
| Comprar um produto válido              | Aprovado  |
| Comprar mais de um produto             | Aprovado  |
| Visualizar a fatura                    | Aprovado  |
| Calcular o valor total da compra       | Aprovado  |
| Alterar a quantidade de um item        | Aprovado  |
| Excluir um item da fatura              | Aprovado  |
| Tentar visualizar uma fatura vazia     | Aprovado  |
| Tentar excluir item com a fatura vazia | Aprovado  |
| Tentar alterar item com a fatura vazia | Aprovado  |
| Informar código de produto inválido    | Aprovado  |
| Utilizar a opção de voltar             | Aprovado  |
| Finalizar a compra                     | Aprovado  |

## Autor

Warlley Silva Baião Braga
