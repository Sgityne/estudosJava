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

### Inserindo dados com Statement

```java
public static void save(Producer producer) {
    String sql = "INSERT INTO producer (name) VALUES ('%s')".formatted(producer.getName());
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
        int rowsAffected = stmt.executeUpdate(sql);
        log.info("Inserted produced '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
    } catch (SQLException e) {
        log.error("Error while trying to insert producer '{}'", producer.getName(), e);
    }
}
```

### Deletando dados com Statement

```java
public static void delete(int id) {
    String sql = "DELETE FROM producer WHERE id = '%d'".formatted(id);
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
        int rowsAffected = stmt.executeUpdate(sql);
        log.info("Deleted produced '{}' in the database, rows affected '{}'", id, rowsAffected);
    } catch (SQLException e) {
        log.error("Error while trying to delete producer '{}'", id, e);
    }
}
```

### Atualizando dados com Statement

```java
public static void update(Producer producer) {
    String sql = "UPDATE producer SET name = '%s' WHERE id = '%d'"
            .formatted(producer.getName(), producer.getId());
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement()) {
        int rowsAffected = stmt.executeUpdate(sql);
        log.info("Updated produced '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
    } catch (SQLException e) {
        log.error("Error while trying to update producer '{}'", producer.getId(), e);
    }
}
```

### Buscando dados com ResultSet

https://www.ibm.com/docs/en/cognos-analytics/11.1.x?topic=dqedg-data-type-conversions-from-jdbcsql-data-types-java-data-types

```java
public static List<Producer> findAll() {
    log.info("Finding all Producers");
    String sql = "SELECT id, name FROM anime_store.producer;";
    List<Producer> producerList = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            producerList.add(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
            );
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
    return producerList;
}
```

```java
// De maneira extensão, fica dessa forma:
int id = rs.getInt("id");
String name = rs.getString("name");
Producer producer = Producer.builder().id(id).name(name).build();
producerList.add(producer);
```

### ResultSetMetaData

- ResultSet tem algumas funções além de trazer dados como:
  - Em alguns drivers possibilita alterar os registros.
  - Pegar o nome da tabela que se está trabalhando.
  - A quantidade de colunas.
  - O nome da coluna
  - Tamanho que a coluna permite
  - Pegar os metadados
  - Etc…

```java
public static void showProducerMetaData() {
    log.info("Finding Producers Metadata");
    String sql = "SELECT * FROM anime_store.producer;";
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        ResultSetMetaData rsMetaData = rs.getMetaData();
        rs.next();
        int columnCount = rsMetaData.getColumnCount();
        log.info("Columns count '{}'", columnCount);
        for (int i = 1; i <= columnCount ; i++) {
            log.info("Table name '{}'" , rsMetaData.getTableName(i));
            log.info("Column name '{}'" , rsMetaData.getColumnName(i));
            log.info("Column size '{}'" , rsMetaData.getColumnDisplaySize(i));
            log.info("Column type '{}'" , rsMetaData.getColumnTypeName(i));
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
}
```

### DatabaseMetaData

- ResultSet também pode:
  - Alterar a forma de navegação na tabela
    - Cima para baixo
    - Baixo para cima
    - Posição específica
  - Alterar os dados dos campos
  - Refletir as alterações feitas por terceiros

- TYPE_FORWARD_ONLY -> somente de cima para baixo
- TYPE_SCROLL_INSENSITIVE ->tanto para cima para baixo quanto de baixo para cima, é não atualiza os dados em tempo real.
- TYPE_SCROLL_INSENSITIVE ->tanto para cima para baixo quanto de baixo para cima, mas atualiza os dados em tempo real.
- CONCUR_UPDATABLE -> alterar os dados enquanto está navegando no resultSet

```java
public static void showDriverMetaData() {
    log.info("Showing Driver Metadata");;
    try (Connection conn = ConnectionFactory.getConnection()) {
        DatabaseMetaData dbMetaData = conn.getMetaData();
        if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
            log.info("Supports TYPE_FORWARD_ONLY");
            if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                log.info("And Supports CONCUR_UPDATABLE");
            }
        }
        if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
            log.info("Supports TYPE_SCROLL_INSENSITIVE");
            if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                log.info("And Supports CONCUR_UPDATABLE");
            }
        }
        if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
            log.info("Supports TYPE_SCROLL_SENSITIVE");
            if(dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                log.info("And Supports CONCUR_UPDATABLE");
            }
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
}
```

### ResultSet TYPE SCROLL INSENSITIVE

- `last()` -> move o cursor para a ultima linha baseada na query.
- `first()` -> move o cursor para a primeira linha baseada na query.
- `absolute()` -> move o cursor para a linha dada baseada na query.
- `relative()` -> move o cursor um relativo número de linhas (negativa ou positiva) baseada no local atual do cursor.
- `islast()` -> verificar se o cursor está na ultima linha baseada na query (não move o cursor).
- `isfisrt()` -> verificar se o cursor está na primeira linha baseada na query (não move o cursor).
- `isAfterlast()` -> verificar se o cursor está após ultima linha baseada na query (não move o cursor).
- `isBeforefisrt()` -> verificar se o cursor está antes da primeira linha baseada na query (não move o cursor).

```java
public static void showTypeScrollWorking() {
    String sql = "SELECT * FROM anime_store.producer;";
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery(sql)) {
        log.info("Last row? '{}'", rs.last());
        log.info("Row number '{}'", rs.getRow());
        log.info(Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build());

        log.info("First row? '{}'", rs.first());
        log.info("Row number '{}'", rs.getRow());
        log.info(Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build());

        log.info("Absolute row? '{}'", rs.absolute(2));
        log.info("Row number '{}'", rs.getRow());
        log.info(Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build());

        log.info("Relative row? '{}'", rs.relative(-1));
        log.info("Row number '{}'", rs.getRow());
        log.info(Producer
                .builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build());

        log.info("is last? '{}'", rs.isLast());
        log.info("Row number '{}'", rs.getRow());

        log.info("is first()? '{}'", rs.isFirst());
        log.info("Row number '{}'", rs.getRow());

        log.info("Last row? '{}'", rs.last());
        log.info("---------------------");
        rs.next();
        log.info("After last row? '{}'", rs.isAfterLast());
        while(rs.previous()) {
            log.info(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build());
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
}
```

### Atualizando registros com ResultSet

```java
rs.updateString("name", rs.getString("name").toUpperCase());
rs.updateRow();
```

```java
public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
    log.info("Finding Producers by name");
    String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);
    List<Producer> producerList = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            rs.updateString("name", rs.getString("name").toUpperCase());
            rs.updateRow();
            producerList.add(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
            );
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
    return producerList;
}
```

- Para cancelar o update se usar `cancelRowUpdates()`, somente funciona antes do `updateRow()`.

### Inserindo registros com ResultSet

```java
rs.moveToInsertRow();
rs.updateString("name", name);
rs.insertRow();
```

```java
public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producerList;
            insertNewProducer(name, rs);
            Producer producer = getProducer(rs);
            producerList.add(producer);
        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }
        return producerList;
    }
```

### Deletando registros com ResultSet

```java
rs.deleteRow();
```

```java
public static void findByNameAndDelete(String name) {
    log.info("Finding Producers by name");
    String sql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);
    try (Connection conn = ConnectionFactory.getConnection();
         Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = stmt.executeQuery(sql)) {
        while(rs.next()) {
            log.info("Deleting '{}", rs.getString("name"));
            rs.deleteRow();
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
}
```

### PreparedStatement

- É um statement onde a performance é maior.
- Ele pré-compilar a sql query deixando mais rápido.
- Tem uma proteção contra SQL injection.

**Read**

```java
public static List<Producer> findByNamePreparedStatement(String name) {
    log.info("Finding Producers by name");
    List<Producer> producerList = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement ps = preparedStatementFindByName(conn, name);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            producerList.add(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
            );
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
    return producerList;
}

private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
    String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, String.format("%%%s%%", name));
    return ps;
}
```

**Update**

```java
public static void updatePreparedStatement(Producer producer) {
    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement ps = preparedStatementUpdate(conn, producer)) {
        int rowsAffected = ps.executeUpdate();
        log.info("Updated produced '{}' in the database, rows affected '{}'", producer.getId(), rowsAffected);
    } catch (SQLException e) {
        log.error("Error while trying to update producer '{}'", producer.getId(), e);
    }
}

private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
    String sql = "UPDATE producer SET name = ? WHERE id = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, producer.getName());
    ps.setInt(2, producer.getId());
    return ps;
}
```

### CallableStatement

- Basicamente é uma versão mais especializada do preparedStatement. A diferença é que Callable realiza procedures e functions;
  - Functions precisa obrigatoriamente retornar um valor.
  - Stored Procedures se tem a escolher entre retornar ou não retornar um determinado valor.

```java
public static List<Producer> findByNameCallableStatement(String name) {
    log.info("Finding Producers by name");
    List<Producer> producerList = new ArrayList<>();
    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement ps = callableStatementFindByName(conn, name);
         ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            producerList.add(Producer
                    .builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
            );
        }
    } catch (SQLException e) {
        log.error("Error while trying to find all producers", e);
    }
    return producerList;
}

private static PreparedStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
    String sql = "CALL `anime_store`.`sp_get_producer_by_name` (?);";
    PreparedStatement cs = conn.prepareCall(sql);
    cs.setString(1, String.format("%%%s%%", name));
    return cs;
}
```

### Connected RowSet - JdbcRowSet

- Uma versão melhorada do ResultSet
  - ResultSet sempre mantém uma conexão com o banco de dados.
  - RowSet pode manter uma conexão ou se pode desconectar do banco de dados.

- ResultSet não pode ser serializado. Ou seja, não se pode mandar um ResultSet via network.
- RowSet pode ser serializado.

- ResultSet não é um javaBin
- RowSet é um javaBin, ou seja, pode ser criado usando o padrão factory.

- Por padrão RowSet é Scrollable e Updatable.
- Com o JdbcRowSet se pode criar um Listener
- Listener é um classe que fica escutando por mudanças
- Exemplo: `CustomRowSetListener`

**Criar conexão**

```java
public static JdbcRowSet getJdbcRowSet() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/anime_store";
    String username = "root";
    String password = "root";
    JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
    jdbcRowSet.setUrl(url);
    jdbcRowSet.setUsername(username);
    jdbcRowSet.setPassword(password);
    return jdbcRowSet;
}
```

**Read**

```java
public static List<Producer> findByNameJdbcRowSet(String name) {
    String sql = "SELECT id, name FROM anime_store.producer WHERE name LIKE ?;";
    List<Producer> producers = new ArrayList<>();
    try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
        jrs.setCommand(sql);
        jrs.setString(1, String.format("%%%s%%", name));
        jrs.execute();
        while (jrs.next()) {
            producers.add(Producer.builder()
                    .id(jrs.getInt("id"))
                    .name(jrs.getString("name"))
                    .build());
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return producers;
}
```

- `execute()` só pode ser usado para inserir dados apenas para buscar.

**Update**

```java
public static void updateJdbcRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if(!jrs.next()) return;
            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```

### Disconnected RowSet - CachedRowSet

- Por ser um RowSet desconectado, todas as alterações feitas nele precisam ser mandadas novamente para o banco de dados.

```java
public static void updateCachedRowSet(Producer producer) {
    String sql = "SELECT * FROM producer WHERE id = ?";
    try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
         Connection connection = ConnectionFactory.getConnection()) {
        connection.setAutoCommit(false);
        crs.setCommand(sql);
        crs.setInt(1, producer.getId());
        crs.execute(connection);
        if (!crs.next()) return;
        crs.updateString("name", producer.getName());
        crs.updateRow();
        crs.acceptChanges();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
```

### Transação

- Basicamente atomicidade no banco de dados, ou seja, ou se executa tudo, ou não se executa nada.
- Caso não desative o autoCommit, a cada query executada ele irá salvar, que em caso de exceção, a informação ficará incompleta.

```java
public static void saveTransaction(List<Producer> producers) {
    try (Connection conn = ConnectionFactory.getConnection()) {
        conn.setAutoCommit(false);
        preparedStatementSaveTransaction(conn, producers);
        conn.commit();
        conn.setAutoCommit(true);
    } catch (SQLException e) {
        log.error("Error while trying to update producer '{}'", producers, e);
    }
}

private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
    String sql = "INSERT INTO producer (name) VALUES (?)";
    for (Producer p : producers) {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            log.info("Saving producer '{}'", p.getName());
            ps.setString(1, p.getName());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```