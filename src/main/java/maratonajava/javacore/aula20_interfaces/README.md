## Aula 20 - Orientação a Objetos - Interfaces

### Introdução

- Bem parecida com classes abstratas
- Quando o java foi criado, ela tinha o intuito de servir como contrato
- Sempre que implementar uma interface, se tem que colocar os métodos que estão dentro dele
<br><br>
**Sintaxe:**

    ```java
    (acessModifier) interface (name) {}
    ```

    - Não pode haver o modificador final, interfaces foram feitas para serem implementadas

    ```java
    public interface DataLoader{
    
    }
    ```
<br><br>
- Métodos por padrão dentro de interfaces são públicos e abstratos, não tendo a necessidade de declarar esses modificadores, evitando redundâncias
- Quando se trabalha com interfaces, se usa o “implements” ao invés do “extends”

### Implementando múltiplas interfaces

- Pode-se prover implementação para múltiplas interfaces em uma mesma classe
- Não existe limite para quantidade de interfaces que se pode implementar em uma classe
- A partir do Java 8, existem a funcionalidade default que se pode colocar métodos concretos (com funcionalidade) dentro de interfaces

### Atributos e métodos estáticos

- Por padrão, todos os atributos são constantes
- Métodos estáticos nunca serão sobrescritos