package maratonajava.javacore.aula13_modificadorestatico.domain;

public class Car {
    private String name;
    private double MaxVelocity;
    private static double LimitVelocity = 250;

    public Car(String name, double maxVelocity) {
        this.name = name;
        MaxVelocity = maxVelocity;
    }

    public void print() {
        System.out.println("----------\n" +
                "name: " + this.name + '\'' +
                ", MaxVelocity: " + this.MaxVelocity +
                ", LimitVelocity: " + Car.LimitVelocity);
    }

    public static void setLimitVelocity(double LimitVelocity){
        Car.LimitVelocity = LimitVelocity;
    }

    public static double getLimitVelocity(){
        return LimitVelocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return MaxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        MaxVelocity = maxVelocity;
    }
}
