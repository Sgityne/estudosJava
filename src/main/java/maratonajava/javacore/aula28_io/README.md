## Aula 28 - Classes Utilitárias - IO

- Entrada e saída de dados
- Classes:
    - File → Trabalhar com arquivo em si
    - FileWriter → Escrever um arquivo, de forma mais simples (não é tão optimizada)
    - FileReader → Ler um arquivo
    - BufferedWriter → Escrever um arquivo, com mais performance e trabalhando com dados e memória
    - BufferedReader → Mesma coisa, Ler em memória, tem uma performance melhor

### File

- **Sintaxe:**

    ```java
    File file = new File(pathname)
    ```

    - Colocar somente o nome, o arquivo irá ser criado onde o programa está sendo executado.
    - Para salvar em um lugar especifico, e necessário para o absolute path.

### BufferedWriter

- FileWriter recebe um file dentro do construtor.
- BufferedWriter recebe um FileWriter dentro do construtor.

### BufferedReader

- FileReader recebe um file dentro do construtor.
- BufferedReader recebe um FileReader dentro do construtor.