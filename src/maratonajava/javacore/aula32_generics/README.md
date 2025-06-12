## Aula 32 - Generics

### Introdução

- Até a versão 1.4 do java, se usavam List sem específica o tipo de dado que ela receberia (ele aceitava um object), que causava problemas na hora de manipular os objetos das lista, devido que havia a possibilidade de ter diferentes tipos de objetos dentro dela.
- Para manter a compatibilidade com as versões anteriores, foi criado o generics, que foi adicionado em tempo de compilação.
- Ou seja, o compilador somente aceitará o tipo de objeto definido dentro do generic `<T>`.
- Quando o java manda o bytecode para a JVM, ele vai sem o generics.
- Esse conceito é chamado de **Type erasure**, porque ele apaga o tipo depois que o código é compilado.
- O generics vai fazer a validação em tempo de compilação do tipo de dado que está sendo inserido dentro da lista, não deixando o código passar para a JVM caso passe o tipo de objeto incorreto.

### Wildcard

- Quando um método recebe como parâmetro uma superclasse e recebe um array de objetos de uma subclasse via argumento. o compilador permite porque o Java sabe o tipo de dado que está sendo recebido
    - Exemplo: `WildcardTest`
- Porém o mesmo não ocorre quando é uma List de uma subclasse. porque quando o código é compilado, o java não sabe que tipo de list se está passando por cause do Type erasure
    - Quando se passa através de parâmetros uma list é necessário passar exatamente o tipo de objeto definido na sintaxe.
    - Exemplo: `WildcardTest2`
- Para isso temos o Wildcard `<?>`.
- Quando se usa `List<? extends T>`:
    - Se está assinando um contrato que não se vai poder adicionar elemento na list dentro do método.
        - Por que pode se estar passando um subclasse. Dog ≠ Cat.
    - Mesmo que seja uma interface, a palavra sempre será extends.
    - Vai ser a classe `T` e suas subclasses.
- Quando se usa `List<? super T>`:
    - Vai ser a classe T e todas suas superclasses.
    - Dentro desse método é possível adicionar elementos a lista. Porque se têm a garantia do polimorfismo.

### Classes Genéricas

- Para fazer uma classe genérica, se coloca `<T>` (tipo) na declaração da classe, e dentro dessa classe, tudo que será trabalho será um objeto genérico `<T>` (T é so um convenção, ou seja, pode ser qualquer nome).
    - Quando se trabalha com coleções, geralmente se usa `<E>` de elemento.
- Exemplo: `ClasseGenericaTest3`

### Métodos Genéricos

- Para fazer um método genérico, se coloca um `<T>` entre o access modifier e o retorno do método.
- Se pode colocar `extends` no método genérico, basta colocar dentro do primeiro `<T>`.