## Lambda

### Predicate

- É uma interface funcional que executa uma operação e retorna um booleano.
- Para uma lambda funcionar, elas precisam obrigatoriamente que a interface que se está trabalhando seja uma interface funcional
- Uma interface funcional é uma interface onde se tem apenas um método abstrato.
- Lambda tem parâmetro e corpo
    - `(parametro) -> <expressão>`
- São anônimas.
- São funções por não estarem atreladas a alguma classe.
- Tem como objetivo deixar o código mais conciso, por reduzir a quantidade de código.
- Qualquer interface funcional pode ser utilizado lambda.

### Consumer

- É uma interface funcional parecida com predicate, a diferença é que ele executa uma operação e não retorna nada.
- Exemplo: `LambdaTest`

### Function

- É uma interface funcional que tem um tipo T e um tipo R, T é o que se recebe, R é o que se retorna.
- Exemplo: `LambdaTest2`

### Method Reference

**Referência a métodos estáticos**
- É um sintaxe para utilizar parte das lambdas que simplificar ainda mais.
- Um forma fácil de lembra é se a lambda chamar apenas um método se pode utilizar de method reference.
- Lambda basicamente só se importa com o targetType e o functionDescriptor.
    - TargetType é o contexto com que a lambda está inserida.

**Referência a métodos não estáticos**
- Basicamente a mesma coisa, porém se chama a instância ao invés da classe.

**Referência a construtor**
- Se pode usar Method Reference para instanciar um objeto utilizando Supplier, caso seu construtor esteja vazio.

    ```java
    Supplier<AnimeComparators> newAnimecomparators = AnimeComparators::new;
    AnimeComparators animeComparators = newAnimecomparators.get();
    ```

- A interface funcional Supplier recebe nenhum argumento e retorna um tipo T.
- Para instanciar usando method reference, se utiliza da interface function, T sendo o parâmetro, R sendo o objeto.

    ```java
    BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
    System.out.println(animeBiFunction.apply("Super campeões", 36));
    ```