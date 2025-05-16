## Aula 25 - Classes Utilitárias -  Datas e Formatação

- Há várias formas de trabalhar com datas no Java
- Ordem de releases:
    - Classe Date > Classe Calendar > Package JavaTime

### Date

- Existe desde a versão 1.0 do Java.
- Praticamente totalmente depreciada, obsoleta
- Atualmente, date só é utilizado em sistemas legado
- Trabalha em milissegundos (conta o tempo em milissegundos), sendo um long representando os milissegundos desde 1 de janeiro de 1970
- Um dos problemas que se tinha que fez com que o date se tornasse obsoleto é a possibilidade de trabalhar com internacionalização
- Exemplo: `DateTest`

### Calendar

- Foi a 2º classe criada na tentativa de consertar a classe Date, praticamente todos relacionados a internacionalização
- Também do package java.util
- É um classe abstrata
- Exemplo: `CalendarTest`

### DateFormat

- É uma classe do package java.text, e é abstrata
- Exemplo: `DateFormatTest`

### Internacionalização Datas com Locale

- Foi criada para trabalhar com internacionalização, usada para formatar tanto data, moedas e números baseada na preferência do usuário ou na localização da JVM dele
- É uma classe do package java.util, e é abstrata
- Exemplo: `LocaleTest`
- Exemplo: `LocaleTest2`