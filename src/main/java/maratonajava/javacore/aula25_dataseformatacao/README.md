## Aula 25 - Classes Utilitárias - Datas e Formatação

- Há várias formas de trabalhar com datas no Java.
- Ordem de releases:
  - Classe Date > Classe Calendar > Package JavaTime

### Date

- Existe desde a versão 1.0 do Java.
- Praticamente totalmente depreciada, obsoleta.
- Atualmente, date só é utilizado em sistemas legado.
- Trabalha em milissegundos (conta o tempo em milissegundos), sendo um long representando os milissegundos desde 1 de janeiro de 1970.
- Um dos problemas que se tinha que fez com que o date se tornasse obsoleto é a possibilidade de trabalhar com internacionalização.

### Calendar

- Foi a 2º classe criada na tentativa de consertar a classe Date, praticamente todos relacionados a internacionalização.
- Também do package java.util.
- É um classe abstrata.
- Ou seja, não pode ser instanciada. Para pegar um instância de calendar se utiliza.

    ```java
    Calendar c = Calendar.getInstance();
    ```


### DateFormat

- É uma classe do package java.text, e é abstrata
<br><br>
  **Sintaxe:**

    ```java
    DateFormat test = DateFormat.getDateInstance();
    ```


## Classe Locale

- Foi criada para trabalhar com internacionalização, usada para formatar tanto data, moedas e números baseada na preferência do usuário ou na localização da JVM dele.
- É uma classe do package java.util.
- Trabalha com diversos tipos de formatação.
- Tem duas ISOs, uma para definir a lingua e outra para o país.
- **Sintaxe:**

    ```java
    // Depreciada no Java 19
    Locale locale = new Locale("pt", "BR");
    ```

    ```java
    Locale localeBR = Locale.of("pt", "BR");
    ```


### Internacionalização Datas com Locale

- Exemplo: `LocaleTest`
- Exemplo: `LocaleTest2`

### **Internacionalização Números com Locale**

- Assim como DateFormat, também é uma classe do package java.text, e abstrata.
  <br><br>
  **Sintaxe:**

    ```java
    NumberFormat test = NumberFormat.getInstance();
    ```

- Com o método parse vai retornar um número, vindo do início da string, e caso tenha um caractere inválido, ele ignora todo o resto após.
- Exemplo: `NumberFormatTest`

### **Internacionalização de Moeda com Locale**

- Segue o mesmo formato da formatação de números.
<br><br>
  **Sintaxe:**

    ```java
    NumberFormat test = NumberFormat.getCurrencyInstance();
    ```

- Para usar o método parse, se tem que utilizar a moeda do respectivo país, caso n use resultará em uma `ParseException: Unparseable number`.
- A maioria dos bancos de dados geralmente guarda o valor números, e após adiciona a localização.
- Exemplo: `NumberFormatTest2`

### SimpleDataFormat

- Foi criada a partir da versão 1.1, com o objetivo de trabalhar formatação de datas de forma mais flexível que a DateFormat.
- Permite fazer a formatação de data utilizando os padrões que são definidos através de letras
- O pattern é totalmente personalizável.

## JavaTime

- API a partir da versão 8 do javaTime.
- É uma versão melhorada de tudo visto acima, com exceção de locale.
- A maioria dos métodos de jTime foi importada para o javaTime.
- A principal diferença é que ela foi introdução da versão 8 do java, é imutável e thread-safe.

### LocalDate

- LocalDate só trabalha com a data, não tem hora.

### LocalTime

- Da mesma forma que LocalDate trabalha com datas, LocalTime trabalha com horários.

### LocalDateTime

- Uma junção de LocalDate e LocalTime.

### Instant

- Parecida com a Date, a diferença é que Date trabalha com milissegundo a partir de 1 de janeiro de 1970, já Instant trabalha com nano-segundos.
- Representa um ponto instantâneo dentro de uma timeline.
- Guarda os nano segundos de 1970 até agora.
- O “z” no fim de Instant representa o zulu time, ou seja, e o horário neutro do mundo (0).
- Geralmente quando se trabalha em alguma aplicação que envolve data, se salva tudo em formato UTC (zulu time)
- Os nano segundos a partir de 1970 resultam em um número que não cabe dentro de um long, para remediar isso, dividiram em duas variáveis, o nano e o epoch-seconds

### Duration

- Foi criado para trabalhar com a quantidade de tempo (hora).
- Geralmente usada para quando se quer pegar o intervalo entre duas datas.
- Baseada em segundos e nano-segundos, ou seja, caso tenha um classe que ela não ofereça no epoch-segundo e o nano-segundo (como LocalDate) não se pode trabalhar com duration.
- O valor retornado vem conforma a ISO 8601.
- Não aceita LocalDate, porque ela não tem segundos.

### Period

- Parecida com Duration, porém baseada na data.

### ChronoUnit

- É um padrão, tem vários método que padronizam as datas e períodos.
- Praticamente tudo que é relacionado a data e período é utilizado através da ChronoUnit.

### TemporalAdjusters

- É uma classe que todos os métodos são estáticos, ou seja, é uma classe utilitária que foi criada para fazer ajustes no tempo.

### **ZonedDateTime, ZoneId, OffsetDateTime**

- Exemplo: `ZoneTest`

### DateTimeFormatter

- Formatter: Transformando de um objeto para uma String
- Parse: Transformando de uma String para um objeto