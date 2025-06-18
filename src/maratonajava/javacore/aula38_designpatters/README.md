## Padrões de Projeto

- Design Patters (ou padrões de projeto) são padrões que geralmente tendem a resolver problemas comuns.

### Builder

- É uma forma que se tem de organizar a criação de objeto.
- Geralmente se priva o acesso ao constructor para forçar a utilização do builder.
- Quando se está trabalhando com o padrão builder, se coloca os setters dentro do builder, retornando o builder
- Após a instanciação de um builder, se utiliza o método build para a criação do objeto

    ```java
        public static class PersonBuilder {
            private String firstName;
            private String lastName;
            private String username;
            private String email;
    
            public PersonBuilder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }
            public PersonBuilder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }
            public PersonBuilder username(String username) {
                this.username = username;
                return this;
            }
            public PersonBuilder email(String email) {
                this.email = email;
                return this;
            }
            public Person build() {
                return new Person(firstName, lastName, username, email);
            }
        }
    ```


### Factory

- Foi criado para se desacoplar lógica de negócio da criação do objeto (da classe).
- Permite uma interface a criação de objetos através de uma superclasse, permitindo que subclasses alterem o tipo de objeto que será criado.k

### Singleton

- Uma classe que tem apenas uma instância e fornece um ponto global de acesso a ela.

**Eager Initialization**

- Instancia o objeto dentro da classe e seta um getInstance para a classe, impedindo a instância de novos objetos daquela classe, ou seja, a única forma de obter aquele objeto é chamando o getInstance, que será retornará o mesmo objeto.

**Lazy Initialization**

- No getInstance se adiciona um if para caso a instância for null, retorna a instância.
- Para evitar problemas com multithread de múltiplas instânciações, se faz um doublelock.

    ```java
    public static AircraftSingletonLazy getInstance() {
            if (INSTANCE == null) {
                synchronized (AircraftSingletonEager.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new AircraftSingletonLazy("787-900");
                    }
                }
            }
            return INSTANCE;
    }
    ```


**Singleton with enumeration**

- Um problema que existe em ambos initialization é a possibilidade de alterar via reflection a acessibilidade do constructor.

    ```java
    Constructor<AircraftSingleton> constructor = AircraftSingleton.
                    class.getDeclaredConstructor(String.class);
    constructor.setAccessible(true);
    AircraftSingleton aircraftSingleton = constructor.newInstance("787-900");
    ```


### Data Transfer Object

- Na verdade, ele é um padrão arquitetural de aplicações corporativas (Enterprise application architecture patterns).
- É um padrão de projeto onde se cria uma classe com os atributos que se deseja que sejam de classes diferentes.