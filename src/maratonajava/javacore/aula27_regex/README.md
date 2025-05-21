## Aula 27 - Classes Utilitárias - Regex

### Introdução

- Também conhecido como expressões regulares.
- É uma lingua que utiliza meta-caracteres, ou seja, símbolos que vão encontrar padrões no texto.
- Também é utilizados para validações
- São duas classe que se precisa para trabalhar com regex no Java: Patter e Matcher
- As expressões regulares precisam ser compiladas com `Patter.compile()`
- Após compilar, se precisar dar um match, usando `.matcher`

### Meta caracteres

- Meta caracteres mais básicos:
    - `\d` = Todos os dígitos
    - `\D` = Tudo o que não for dígito (letras e caracteres especiais)
    - `\s` = Espaços em branco `\t` `\n` `\f` `\r`
    - `\S` = Todos os caracteres excluindo os brancos
    - `\w` = a-z, A-Z, dígitos, _
    - `\W` = Tudo o que não for incluso no `\w`

### Range

- `[]` = **Range, tudo entre a ao z minúsculo, tudo entre A e C maiúsculo

### Quantificadores

- São caracteres que podem pegar determinada expressão baseada na quantidade que o meta caractere representa.
    - `?` = Zero ou uma
    - `*` = zero ou mais
    - `+` = uma ou mais
    - `{n,m}` = de n até m
    - `()` = agrupamento
    - `|` = pipe, para OR: o(v|c)o → ovo, oco
    - `$` = fim da linha
    - `.` = caractere coringa → 123, 133, 1@3, 1A3

### Anchor

- `^` = usado para dar match exatamente o que ser quer no começo da linha
- Também pode ser usado como negação se estiver dentro do `[]`