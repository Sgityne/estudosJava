## Aula 37 - Streams

### Introdução

- É uma forma que se tem de processamento de dados.
- É uma sequência de elementos.
- Se tem várias operações, as operações de uma stream tem duas opções: intermediária e finais.
    - Ação intermediária: retorna um próprio stream, podendo encadear ações.
    - Ações finais: retorna um resultado.
- Quando se está trabalhando com stream, se está trabalhando com um espaço de tempo. Quando se fecha um stream, não se pode mais trabalha com aquele stream.
<br><br>
- **Ações intermediárias**
    - **filter()**: Selects elements based on a given predicate.
    - **map()**: Transforms each element of the stream using a given function.
    - **flatMap()**: Flattens a stream of collections into a single stream of elements.
    - **distinct()**: Removes duplicate elements from the stream.
    - **sorted()**: Sorts the elements of the stream.
    - **peek()**: Performs an action on each element as it is consumed from the stream, without modifying the stream itself.
    - **limit()**: Truncates the stream to a specified length.
    - **skip()**: Skips a specified number of elements from the beginning of the stream.
    - **takeWhile()**: (Java 9+) Takes elements from the stream while a given predicate is true.
    - **dropWhile()**: (Java 9+) Skips elements from the stream while a given predicate is true.
<br><br>
- **Ações terminais**

  **Reduction Operations:**

    - `collect()`: Gathers stream elements into a collection (e.g., List, Set, Map).
    - `reduce()`: Combines stream elements into a single value using an accumulator function.
    - `count()`: Returns the total number of elements in the stream.
    - `min()`: Returns the minimum element based on a provided comparator.
    - `max()`: Returns the maximum element based on a provided comparator.
    - `sum()`: Calculates the sum of numeric stream elements.
    - `average()`: Calculates the average of numeric stream elements.

  **Matching Operations:**

    - `anyMatch()`: Checks if at least one element matches a given predicate.
    - `allMatch()`: Checks if all elements match a given predicate.
    - `noneMatch()`: Checks if no element matches a given predicate.

  **Finding Operations:**

    - `findFirst()`: Returns an `Optional` containing the first element of the stream, if any.
    - `findAny()`: Returns an `Optional` containing any element of the stream, if any.

  **Iteration Operation:**

    - `forEach()`: Performs an action on each element of the stream.
    - `forEachOrdered()`: Performs an action on each element of the stream, maintaining the encounter order.

### FlatMap

- Basicamente faz a mesma coisa que o map, a diferença é que flatMap é utilizando quando propriedade alinhadas.
- Usado quando se tem que tirar um atributo aninhado dentro de outro atributo, ou seja, uma coleção de atributos.
- Exemplo: `StreamTest3,4`.

### Finding and Matching

- Exemplo: `StreamTest5`

### Reduce

- É uma operação terminal do streams, que possibilita obter um resultado único a parte de uma sequência de elementos, aplicando uma operação aos elementos e retornando o resultado.
- Exemplo: `StreamTest6,7`

### Gerando streams

- Exemplo: `StreamTest8,9`

### Collectors - Summarizing

- Exemplo: `StreamTest10`

### Collectors - Grouping by

- Exemplo: `StreamTest11,12,13,14`