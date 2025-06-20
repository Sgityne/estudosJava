## Aula 39 - JDBC

### Workbench

- É um sistema gerenciado de banco de dados

### JDBC

- Java DataBase Connectivity
- É uma biblioteca criada para o java para tentar padronizar a conexão com diferentes bancos de dados
    - Connection
    - Statement
    - ResultSet
    - DriverManager
- A url que faz o driverManager pega a conexão, tendo um padrão. Todo banco de dados tem um padrão de url
- Na maioria das vezes segue essa sintaxe:
    - `jdbc:(vendor)://(port)/(databaseName)`
    - `jdbc:mysql://localhost:3360/anime_store`
- Repository são as classe que lidam diretamente com o banco de dados segundo o design pattern DAO.
- Statement é um objeto que vai ser responsável por alterar os dados do banco de dados. Se pega o statement através da conexão

### Lombok

- É uma lib que provém notações simplificadas geradas automaticamente, como getters e setters, builders, hashCode e equals, etc.

  https://projectlombok.org/

- Possibilita a utilização de log.

### Log4J2

- Substitui o `System.out.println()`,devido a péssima performance dele.
- Existe um conceito chamado PII (Personally Identifiable Information), dizendo que não é recomendo colocar dados sensíveis (informações que possam identificar o usuário) dentro dos logs.