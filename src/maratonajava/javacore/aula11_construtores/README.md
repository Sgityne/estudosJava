## Aula 11 - Orientação a Objetos - Construtores

### Introdução

- **É um inicializador dos objetos, é o responsável pela criação**
- Serve para inicializar o objeto de uma determinada classe seguindo um determinado padrão
<br><br>
- Todas as vezes que se está criando um objeto, na verdade se está construindo um objeto, independente de se ver um construtor na classe
- Se precisa de um construtor para dar origem a um objeto
- Mesmo não adicionando um construtor, o Java no momento da compilação, criará um
  <br><br>
**Sintaxe**

    ```java
    (modificadorDeAcesso) (NomeDaClasse)() {
    
    }
    ```

    ```java
    public Anime() {
    
    }
    ```

    - Não se pode ter retorno, caso coloque, ele passa a ser um método
      <br><br>
- Os construtores te forçam a seguir regras, como precisar obrigatoriamente ter algum atributo

    ```java
    public Anime(String nome) {
    	this.none = nome;
    }
    ```

    - Nesse exemplo, para construir a classe Anime, obrigatoriamente se é necessário dar um atributo nome ao objeto
      <br><br>
- O construtor é sempre executado antes de qualquer método
- No momento que se adiciona um construtor, ele obrigatoriamente vai ter que seguir essa regra, O java não era adicionar outro construtor
- Ou seja, ele só podem inicializar se respeitada essa regra
  <br><br>
- Da mesma forma que se pode fazer sobrecarga de método, se pode fazer sobrecarga de construtores

### Sobrecarga

- Para chamar um construtor, é so colocar `this();` dentro de outro construtor, assim ele referenciará o próprio objeto na memória
- O java sabe o construtor que está sendo referenciado baseado no números e quais parâmetros estão sendo passados no `this();`
- Não se consegue usar essa sintaxe fora de construtores
- Se tiver que chamar outro construtor, obrigatoriamente precisa ser a primeira linha executável do corpo do construtor