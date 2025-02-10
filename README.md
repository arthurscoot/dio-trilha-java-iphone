# dio-trilha-iphone
# Projeto Proposto no Bootcamp Bradesco da DIO

## Projeto Criado a Partir do Seguinte UML

![Untitled diagram-2025-02-10-211649](https://github.com/user-attachments/assets/a735cd99-b857-4d0d-9028-a193ffd9d06d)

---

## Objetivo

Este projeto foi criado com o objetivo exclusivo de demonstrar a hierarquia entre classes e a interação de interfaces. Nenhuma das classes implementa funcionalidades reais ou serviços operacionais, já que o foco principal é a estruturação e organização do código para ilustrar o uso de interfaces e a forma como elas se relacionam com as classes que as implementam.

Foi desenvolvido para fins de treinamento e aprendizado, sem nenhuma aplicação prática funcional, além de mostrar como interfaces podem ser usadas para definir contratos e como as classes concretas podem implementá-las, com o intuito de entender a arquitetura de sistemas baseados em interfaces e a hierarquia entre diferentes componentes.

---

## Versão Mais Completa do Diagrama

![Untitled diagram-2025-02-10-211558](https://github.com/user-attachments/assets/add05b66-838d-4b09-97fc-617cf4763e58)

---

## Descrição do Diagrama

O diagrama representa um `iPhone` que implementa três interfaces: `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Essas interfaces definem métodos como `tocar()`, `ligar(numero: String)`, `exibirPagina(url: String)`, entre outros. 

O `iPhone` possui atributos privados que são instâncias dessas interfaces (`reprodutorMusical`, `aparelhoTelefonico` e `navegadorInternet`), permitindo que ele execute as funcionalidades definidas por elas. 

Além disso, classes concretas como `Telefone`, `Safari` e `Spotify` implementam essas interfaces, fornecendo as funcionalidades específicas.
