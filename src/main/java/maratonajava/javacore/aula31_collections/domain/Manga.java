package maratonajava.javacore.aula31_collections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;
    private int quantity;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "ID não pode ser nulo");
        Objects.requireNonNull(name, "Nome não pode ser nulo");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Manga(Long id, String name, double price, int quantity) {
        this(id, name, price);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this < outroManga
        // se this == outromanga, return 0
        // positivo se this > outroManga
//        if(this.id < outroManga.getId()) {
//            return -1;
//        } else if(this.id.equals(outroManga.getId())){
//            return 0;
//        } else {
//            return 1;
//        }
        return this.name.compareTo(outroManga.getName());
        //return Double.compare(price, outroManga.getPrice());
        //return this.id.compareTo(outroManga.getId());
    }
}
