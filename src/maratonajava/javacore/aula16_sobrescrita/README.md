## Aula 16 - Orientação a Objetos - Sobrescrita do método toString

- Mudará o retorno padrão da classe
    - Retorno padrão

        ```java
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        ```


- @Override - Ter certeza que o método será sobrescrito
- Regras de sobrescrita:
    - O nome tem que ser exatamente o mesmo
    - A quantidade de parâmetros tem que se exatamente a mesma, independente de ter ou não
    - O tipo de retorno tem que ser exatamente a classe ou alguma subclasse, isso se chama covariância de retorno
    - O modificador de acesso nunca pode ser mais restritivo