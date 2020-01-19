package homework.store;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product(0, "Apple", 1500);
        Product star = new Product(1, "Star", 1000);
        Product phone = new Product(2, "Phone", 10000);
        Product radio = new Product(2, "Radio", 500);
        Store store = new Store();
        store.addProduct(apple);
        store.addProduct(star);
        store.addProduct(phone);
        store.printAllProducts();
        store.printAllProducts();
        for (Product product : store.priceSortList()) {
            System.out.println(product);
        }
        System.out.println();
        store.deleteProduct(1);
        for (Product product : store.sortByLastAddToList()) {
            System.out.println(product);
        }
        System.out.println();
        store.replaceProduct(radio);
        store.printAllProducts();
    }
}
