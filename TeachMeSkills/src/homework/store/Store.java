package homework.store;

import java.util.*;

public class Store {
    static List<Product> Products = new ArrayList<>();
    private Scanner scanner;

    public Store(Scanner scanner) {
        this.scanner = scanner;
    }

    public Store() {

    }

    void addProduct(Product product) {
        try {
            for (Product p : Products) {
                if (p.getId() == product.getId()) {
                    throw new MyException();
                }
            }
            Products.add(product);
            System.out.println("Add successful");
        } catch (MyException e) {
            System.out.println("You have product with this id ");
        }
    }

    List<Product> returnProduct() {
        return Products;
    }

    List<Product> printAllProducts() {
        for (Product p : Products) {
            System.out.println("Product " + p.getName() + ". Product id " + p.getId()
                    + ". Product price " + p.getPrice());
        }
        System.out.println();
        return Products;
    }

    void removeProduct(int id) {
        try {
            boolean findId = false;
            int numberDeleteProduct = 0;
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).getId() == id) {
                    findId = true;
                    numberDeleteProduct = i;
                    break;
                }
            }
            if (!findId) {
                throw new MyException();
            }
            Products.remove(numberDeleteProduct);
            System.out.println("Product deleted");
            System.out.println();
        } catch (MyException e) {
            System.out.println("You don`t have product with this id");
            System.out.println();
        }
    }

    void editProduct(Product product) {
        try {
            boolean findId = false;
            for (int i = 0; i < Products.size(); i++) {
                if (Products.get(i).getId() == product.getId()) {
                    Products.set(i, product);
                    findId = true;
                    break;
                }
            }
            if (!findId) {
                throw new MyException();
            }
            System.out.println("Product edited");
            System.out.println();
        } catch (MyException e) {
            System.out.println("You don`t have product with this id");
            System.out.println();
        }
    }

    List<Product> priceSortList() {
        List<Product> priceSortList = new ArrayList<>(Products);
        Collections.sort(priceSortList);
        return priceSortList;
    }

    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = Products.size(); i > 0; i--) {
            sortByLastAddToList.add(Products.get(i - 1));
        }
        return sortByLastAddToList;
    }

    private void printMenu() {
        System.out.println("1. Вывод всех товаров");
        System.out.println("2. Добавление товара");
        System.out.println("3. Удаление товара");
        System.out.println("4. Редактирование товара");
        System.out.println("5. Выход");
    }

    private void printMenuCase1() {
        System.out.println("1. По цене(возрастанию)");
        System.out.println("2. По цене(убыванию)");
        System.out.println("3. По мере добавления");
    }

    public void start() {
        Scanner scanner=new Scanner(System.in);
        try{
        if (this.scanner != null) {
                int key;
                do {
                    printMenu();
                    System.out.print("Введите номер меню: ");
                    key = this.scanner.nextInt();
                    switch (key) {
                        case 1:
                            printMenuCase1();
                            key = this.scanner.nextInt();
                            switch (key) {
                                case 1:
                                    for (Product p : priceSortList()) {
                                        System.out.println(p);
                                    }
                                    break;
                                case 2:
                                    for (int i = Products.size(); i > 0; i--) {
                                        System.out.println(priceSortList().get(i - 1));
                                    }
                                    break;
                                case 3:
                                    for (Product p : sortByLastAddToList()) {
                                        System.out.println(p);
                                    }
                                    break;
                                default:
                                    System.out.println("Вы ввели неверное значение меню...\n");
                            }
                            break;
                        case 2:
                            System.out.println("Введите id товара");
                            int id = scanner.nextInt();
                            System.out.println("Введите наименование товара");
                            String name = scanner.next();
                            System.out.println("Введите цену товара");
                            int price = scanner.nextInt();
                            Product product = new Product(id, name, price);
                            addProduct(product);
                            break;
                        case 3:
                            System.out.println("Введите id товара");
                            int deleteId = scanner.nextInt();
                            removeProduct(deleteId);
                            break;
                        case 4:
                            System.out.print("Введите id товара");
                            int editId = scanner.nextInt();
                            System.out.println("Введите наименование товара");
                            String editName = scanner.next();
                            System.out.println("Введите цену товара");
                            int editPrice = scanner.nextInt();
                            Product editProduct = new Product(editId, editName, editPrice);
                            editProduct(editProduct);
                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("Вы ввели неверное значение меню...\n");
                    }
                } while (key != 5);
            }
        }catch (InputMismatchException e){
            System.out.println("Неверный тип значения, попробуйте снвоа!");
            start();
        }
    }
}

