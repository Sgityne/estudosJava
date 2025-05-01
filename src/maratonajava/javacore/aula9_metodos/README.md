## Aula 09 - Orientação a Objetos - Métodos e Modificadores de Acesso

### Introdução

```java
(modificadorDeAcesso) (retorno) (nomeDoMétodo)
```

```java
public void soma() {}
```

- Como Executar

    ```java
    (variávelDeReferência).(nomedoMétodo)
    ```

    ```java
    calculator.sum();
    ```


### Parâmetros

```java
(modificadorDeAcesso) (retorno) (nomeDoMétodo)((parâmetros))
```

```java
public void multiply(int num1, int num2) {}
```

- Quando no contexto de atribuição se chama parâmetro
- Quando no contexto de chamada se chama argumento

### Retorno

- Se coloca um tipo primitivo
- Void: não retorna nada

    ```java
    public double divide(double num1, double num2) {}
    ```

- O retorno de um método é como se estivesse inicializando uma variável com aquele atributo

    ```java
    double result = calculadora.divide(20,2);
    ```


### Parâmetros tipo primitivo

- Quando se passa valores do tipo primitivo para um método, não se passa a referência daquele objeto em memória, se está fazendo um cópia

  Exemplo: `ChangeNumbers();`


### Parâmetros tipo referência

- Quando se trabalha com objetos de tipo primitivo, se passa uma cópia, porém quando se usa objetos do tipo referência, se passa a cópia da referência

  Exemplo: `printer.print(studant);`
<br><br>
- Quando se usar parâmetros via referência, tudo que se faz dentro de um objeto será alterado em escopo global
- Caso se altera um atributo studant dentro da class PrinterStudant, o atributo será alterado globalmente
- As boas práticas dizem para não alterar os dados de dentro do objeto no método, caso precise fazer esse tipo de alteração, faça um cópia do objeto e retorna um novo objeto com estado alterado

### Referência this

Exemplo: `studant.print();`
- Se refere a instância daquele objeto

### Modificador de acesso private, get e set

- A representatividade de um classe quanto menos, melhor
- Acoplamento é quanto um classe conhece e estar conectada com outra
<br><br>
- private: Só podem ser acessados dentro do objeto (mesma classe)
- protected: Só pode ser acessado por classe dentro do mesmo pacote, classe e subclasse
- public: Qualquer classe pode acessar o atributo
- default: Só pode ser acessado por classe dentro do mesmo pacote e classe
<br><br>
- A finalidade dos getters e setters é proteger a lógica do código dentro da classe do objeto, não acessando diretamente o original
- O pilar (pilares da orientação a objeto) que ele se relaciona é o encapsulamento