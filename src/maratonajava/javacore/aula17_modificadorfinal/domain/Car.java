package maratonajava.javacore.aula17_modificadorfinal.domain;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Buyer BUYER = new Buyer();

    public final void print(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
