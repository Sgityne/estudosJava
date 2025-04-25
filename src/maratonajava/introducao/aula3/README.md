## Aula 3 - Operadores

- São elementos do java que vão fazer com que se possa fazer operações

### Operadores Aritméticos

- São operadores que se consegue realizar matemática com números
    - Adição: +
    - Subtração: -
    - Multiplicação: *
    - Divisão: /
    - Resto da divisão: %
      <br><br>
- The + operador when used with a string will convert the non-String operands to string
  and concatenate the string together
- O operador + quando usado junto a uma string converterá operados non-String para Strings e concatenará a String junto,
há menos que seja colocando dentro de parênteses ou antes a string.
  <br><br>
- Caso divida dois valores inteiros, o resultado sempre será um inteiro.

```java
int number1 = 10;
int number2 = 20;
int result = number1 / number2;
System.out.println(result); // 0.0
```

```java
int number1 = 10;
double number2 = 20;
double result = number1 / number2;
System.out.println(result); // 0.5
```

### Operadores relacionais

- Sempre retornarão um valor booleano
    - Menor que: <
    - Maior que: >
    - Menor ou igual a: <=
    - Maior ou igual a: >=
    - Igual: ==
    - Diferente: !=

### Operadores lógicos

- AND: &&
- OR: ||
- NOT: !

### Operadores de atribuição

- Atribuição: =
- Adição e atribuição: +=
- Subtração e atribuição: -=
- Multiplicação e atribuição: *=
- Divisão e atribuição: /=
- Resto da divisão e atribuição: %=
  <br><br>
- Incremento único: ++
- Decremento único: --
  <br><br>
- Tem diferença entre coloca antes ou após a variável
    - Printa e depois incrementa

        ```java
        System.***out***.println(counter++);
        ```

    - Incrementa e depois printa

        ```java
        System.***out***.println(++counter);
        ```