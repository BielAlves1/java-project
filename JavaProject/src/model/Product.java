package model;

public abstract class Product implements Cloneable {
    private static long countId = 0;
    private final long id;
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category){
        this.id = countId++;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public long getId() {
        return id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clonagem não suportada", e);
        }
    }
}
