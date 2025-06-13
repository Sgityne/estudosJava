## Aula 36 - Optional

- É uma classe que introduzida na versão 8 do Java.
- O intuito dessa classe é tentar evitar o nullPointerException.
- O principal objetivo é identificar que o retorno de um método pode ser opcional, ou seja, não vir.
    - Ao invés de retorna null, retorna um optional.
- Optional é um objeto que irá encapsular outros objetos.
- Não é indicado para passagem de parâmetros ou atributos de classe, porque Optional não é uma classe serializável.
    - Tem alguns framework que esperam que os atributos da classe sejam serializáveis. Porque se não eles não conseguiram fazer o mapeamento relacional.
- É somente indicado para utilização no retorno dos métodos.