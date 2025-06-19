## Aula 12 - Orientação a Objetos - Blocos de Inicialização

- Também chamado de bloco de inicialização de instância, porque ele é executado toda vez que se cria um instância desse objeto
- Ele é executado antes do construtor
- Funcionado independente do construtor chamado
<br><br>
**Sintaxe**

    ```java
    {
    
    }
    ```


### Ordem de execução

1. Alocado espaço em memória pro objeto
2. Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
3. Bloco de inicialização é executado
4. Construtor é executado