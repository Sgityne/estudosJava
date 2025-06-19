## Aula 05 - Estruturas de Repetição

### While

- A condição precisa ser obrigatoriamente um valor booleano
- Sempre que estiver usando um while, é preciso trocar o estado da variável dentro do escopo do while
  <br><br>
**Sintaxe**

    ```java
    while(condicao) {
    
    }
    ```

### do while

- Vai executar pelo menos 1 vez, mesmo se a condição passada for falsa
<br><br>
**Sintaxe**

    ```java
    do {
    
    } while (condição);
    ```


### For

- Geralmente com o for, se trabalho com index
<br><br>
**Sintaxe**

    ```java
    for((tipo primitivo) (variável);(variável) (operador relacional) (condição);(incrementador) {
    
    }
    ```

  Exemplo:

    ```java
    for (int i; i < 10; i++) {
    
    }
    ```



### Break

- Interrompe o loop

### Continue

- Ignora tudo que está abaixo e voltar para o inicio do loop