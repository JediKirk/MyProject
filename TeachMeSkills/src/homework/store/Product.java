package homework.store;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product " + getName() + ". Product id " + getId()
                + ". Product price " + getPrice();
    }

    @Override
    public int compareTo(Product o) {
        int compareQuantity = o.getPrice();
        return this.price - compareQuantity;
    }

    @Override
    public boolean equals(Object product) {
        if (product == this) {
            return true;
        }
        if (product == null || product.getClass() != this.getClass()) {
            return false;
        }
        Product guest = (Product) product;
        if (id != guest.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();
        return result;
    }
}
