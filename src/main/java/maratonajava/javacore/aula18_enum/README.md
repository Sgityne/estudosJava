## Aula 18 - Orientação a Objetos - Enumeração

### Introdução

- Tipo especial de classe
- É uma classe que será definido atributos que representam aquela enumeração
<br><br>
**Sintaxe**

    ```java
    (acessModifier) enum (ClassName) {}
    ```

- Todos os atributos são constantes

### Construtores e atributos

- Se pode fazer associações com enum pelo construtor dentro da classe enum
- Sempre que um tipo enum for instanciado ele receber aqueles atributos

    ```java
    public enum CostumerType {
        PESSOA_FISICA(1, "Pessoa Física"),
        PESSOA_JURIDICA(2, "Pessoa Jurídica");
    
        public final int VALUE;
        private String reportName;
        
        CostumerType(int value, String reportName) {
            this.VALUE = value;
            this.reportName = reportName;
        }
    }
    ```


### Sobreescrita de métodos

- Da pra colocar métodos dentro de cada enum, para que quando o método seja chamado, o comportamento dele seja baseado no tipo de enum declarado
    - Exemplo: `PaymentType`

### Busca por atributos

- Exemplo: `CostumerType.CostumerTypePerReportName()`