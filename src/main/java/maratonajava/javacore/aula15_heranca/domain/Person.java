package maratonajava.javacore.aula15_heranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    public Person(String name){
        this.name = name;
    }

    public void print() {
        System.out.println("Nome: " + this.name + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Endereço: " + this.address.getStreet() + " " + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
