package maratonajava.javacore.aula9_metodos.domain;

public class Studant {
    public String name;
    public int age;
    public char gender;

    // Refefência this
    public void print(){
        System.out.println("Nome: " + this.name +"\n" +
                           "Idade: " + this.age + "\n" +
                           "Sexo:  " + this.gender);
    }
}
