## Aula 23 - Classes Utilitárias - Wrappers

### Classes Utilitárias

- São classes que vão melhorar o desempenho das aplicações e qualidade de código

### Wrappers

- São objetos que vão encapsular os tipos primitivos.
- Encapsulam os tipos primitivos e transforma em objetos.
- Para criar um wrapper, basta pega o nome do tipo primitivo e colocar a primeira letra maiúscula.
    - Com exceção do `int` que vira `Integer`, e do `char` que vira `Character`.
<br><br>
- Nos tipos primitivos, se trabalha com bits, e a regra da quantidade de bits (o tamanho do espaço em memória que se está alocando).
- Já nos wrapper se está trabalhando com objetos, e a regra de polimorfismo se aplica
- Quando se trabalha com classes wrapper, esse valores são relacionados ao polimorfismo, não mais aos valores dos tipos primitivos relacionados a tamanho que se pode colocar em memória.
- As boas práticas ainda dizem que quando ser é possível trabalhar com tipo primitivo, ele tem que ter a preferência

### Função

- Wrapper por ser um objeto, então quando se está trabalhando com passagem de parâmetros, se está usando passagem de parâmetros por referência.
- Serve para passar os parâmetros por referência, não mas por valor, caso queira fazer alguma alteração dentro do método.
- Também serve para quando se trabalha com estrutura de dados, do pacote de coleções, como arrayList, vetores e collections, ele não trabalham com tipos primitivos.
- Além disso, quando trabalhando com threads, principalmente no ambiente de concorrência, se precisa de objetos para trabalhar com a parte de sincronização

### Autoboxing e Unboxing

- Autoboxing é quando se tem um tipo primitivo, e se faz o java transforma esse tipo primitivo em um tipo wrapper
- Unboxing é ao contrário, o java está se encarregando de transforma um tipo wrapper em um tipo primitivo