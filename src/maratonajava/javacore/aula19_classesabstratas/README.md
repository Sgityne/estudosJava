## Aula 19 - Orientação a Objetos - Classes abstratas

### Introdução

- Como se fosse um template, que não pode ser instanciada
- Basicamente uma classe criada para ser uma super classe

### Métodos abstratos

- Significa que um método não pode ter corpo
- Serve como uma flag, um sinal de que quando estender desta classe, aquele método deve ser implementado
- Ou seja, quando se estende de uma classe abstrata com um método abstrato, se precisa prover uma implementação
- Classes abstrata podem ter tanto métodos abstratos quanto não abstratos (concreto).
- Métodos abstratos só podem existir dentro de classes abstratas

### Regras

- Caso tenha uma classe abstrata, e uma outra classe abstrata estender ela, não é necessário implementar os métodos abstratos, mas a classe concreta que estender essa classe precisa
- Só é necessário implementar a classe abstrata uma única vez
    - Exemplo: `Person`