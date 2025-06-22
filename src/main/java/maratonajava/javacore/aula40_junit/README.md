## Aula 40 - Testes unitários

- Existem vários tipos de testes como unitários, integração, componente, comportamento, et
- Teste unitário é o mais básico, basicamente testa uma unidade do código geralmente um método.
- Sempre que se cria um código, se cria junto a ele um teste, e se testa todo o sistema e verifica se está alteração afetou outras partes do sistema.
- A biblioteca mais famosa para testes é a JUnit.
- Geralmente se testa a camada de negócios. Existe algo chamado cobertura de código, que é se os testes passam por todo código que foi desenvolvido.
- A notação `@BeforeEach` faz com que o método linkado a ele seja executa antes de cada teste.
    - Geralmente o nome desse método é `setUp()`.

### Record Class

- Mesma coisa que o Lombok porém…
    - Não possui setters.
    - Não se pode criar atributos ou bloco de inicialização de instância diretamente.
- Por padrão os records são imutáveis.
- Exemplo: `Manga()`

### Pattern Matching for instanceof

- Substituir a forma de instance of com casting

    ```java
    //Antigamente
    if(employeeDeveloper instanceof Developer) {
        Developer developer = (Developer) employeeDeveloper;
        assertEquals("Java", developer.getMainLanguage());
    }
    ```

    ```java
    //Nova Forma
    if(employeeDeveloper instanceof Developer developer) {
        assertEquals("Java", developer.getMainLanguage());
    }
    ```

- Exemplo: `EmployeeTest()`.