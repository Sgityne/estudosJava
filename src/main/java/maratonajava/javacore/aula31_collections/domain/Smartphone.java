package maratonajava.javacore.aula31_collections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null.
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo  y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, logo x.equals(z) == true, logo y.equals(z) == true.
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferentes de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // se x.equals(y) == true, y.hashCode() == x.hashCode().
    // y.hashCode() == x.hashCode não necessariamente o equals de y.equals(x) tem que ser true.
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
