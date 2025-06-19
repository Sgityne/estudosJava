## Aula 13 - Orientação a Objetos - Modificadores Estáticos

### Modificador static

- É um identificador que farão o atributo pertence a classe, não a instância da classe
- Quando colocado static, a variável não pertence a um objeto especifico, mas todos os objetos, pois não pertence a uma única instância
- Se alterado, mudará todas as instâncias
- Não pode ser instanciado

### Métodos estáticos

- Não deve ser referenciado com this, porque this é referência de objeto instanciado
- Não se pode acessar nenhum variável não estática dentro de um método estático, porque existe a possibilidade de não existir um objeto em memória
- O objeto sempre vai ser criado depois dos valores estáticos serem inicializados
- Quando colocar um método estático?
    - Quando os métodos não acessam um variável da instância

### Bloco de inicialização estático

- O bloco de inicialização estático é executado apenas uma vez quando a classe é carregada pela JVM
- Podemos chamar métodos estáticos dentro de blocos estáticos, ou métodos estáticos dentro de outros métodos estáticos
- Caso tenha mais de 1 bloco de inicialização, ele serão executados na ordem que eles aparecem

### Ordem de execução

1. Bloco de inicialização é executado quando a JVM carregar classe
2. Alocado espaço em memória pro objeto
3. Cada atributo de classe é criado e inicializado com valores default ou o quer for passada
4. Bloco de inicialização é executado
5. Construtor é executado