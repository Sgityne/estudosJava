package maratonajava.javacore.aula9_metodos.domain;

public class PrinterStudant {
    public void print(Studant studant){
        // Parâmetros tipo referência
        System.out.println("Nome: " + studant.name +"\n" +
                           "Idade: " + studant.age + "\n" +
                           "Sexo:  " + studant.gender);
    }
}
