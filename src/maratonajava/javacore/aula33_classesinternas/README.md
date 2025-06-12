## Aula 33 - Classe Internas

### Introdução

- É basicamente uma classe dentro da outra.
- Usasse usando se tem dois objetos diferentes, porém fortemente acoplados.
- É como se fosse um método mais poderoso, podendo declara atributos, e acessar todos os objetos da classe externa.
- Existem casos que há duas classe onde somente uma classe A irá acessa a classe B, não havendo motivo de B existe fora de A.
- Para criar um objeto da classe interna, se precisa de um objeto da classe externa.

    ```java
    OuterClass outer = new OuterClass();
    Inner inner = outer.new Inner();
    ```

  OU

    ```java
    Inner inner = new OuterClass().new Inner();
    ```

- `this` se refere ao contexto da classe que ele se encontra.
- Para referenciar a classe externa dentro da classe interna, se chama o nome da classe.this.

    ```java
    class Inner {
            public void printOuterClass() {
                System.out.println(OuterClass.this);
            }
    }
    ```


### Classes Locais

- É quando se tem um classe dentro de um método ou de um bloco de inicialização.
- Quando se tem uma classe local, caso tente acessá-la da forma acima, não se terá mais acesso a ela quando o método terminar.
- Sempre que se cria um classe local, é preciso iniciar essa classe diretamente no método, se não, não se ter mais acesso a essa classe a partir do momento que o método terminar.
- Somente se pode usar os modificadores de acesso abstract e final dentro das classes locais.
- Caso tenha algum atributo dentro do método com a classe local, esse atributo tem que ser final.
    - Mesmo que não seja final, não se pode fazer nenhuma alteração nesse valor.
    - O mesmo serve para parâmetros, eles tem que ser efetivamente final (não sofrerem alterações).

### Classe Anônimas

- São classes que vão existir brevemente por um determinado período de tempo no código e que não podem ser reutilizadas no código em nenhum outro lugar.
- Servem para alterar o comportamento de algum método em algum lugar específico
- Para criar uma classe Anônima, quando for instancia um novo objeto, basta definir o comportamento que deseja que seja alterado dentro dele mesmo.

    ```java
    Animal animal = new Animal(){
    	@Override
    	public void walk(){}
    };
    ```

- Seguem as regras de herança.
- Pode ser usado para criar um interface anônimas

    ```java
    boatList.sort(new Comparator<Boat>() {
        @Override
        public int compare(Boat o1, Boat o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    ```


### Classes aninhadas estáticas

- Quando se utiliza um static em uma classe interna, é como se fosse uma outra classe top level (como se estivesse fora da classe). Se utiliza por um questão de empacotamento.
- Dentro da static class, não poderá acessar nenhum atributo que não seja estático.
- Usado quando não há motivo de colocar a static class fora da outerClass. Porque a static class somente se comunica com a outerClass.