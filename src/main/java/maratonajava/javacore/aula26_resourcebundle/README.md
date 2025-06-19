## Aula 26 - Classes Utilitárias - Resource Bundle

- É uma forma que se tem que internacionalizar as mensagens, pegando as mensagens baseada no local
<br><br>
**Sintaxe:**

  `(nomeBase)_(localização).properties`

  `messages_en_US.properties`
  <br><br>
- Regra de Fallback
    1. Locale("fr","CA")
    2. messages_fr_CA.propertie
    3. messages_fr.properties
    4. messages_en_US.properties
    5. messages_en.properties
    6. messages.properties
    - Caso não ache no ultimo, ele lançará uma exceção.