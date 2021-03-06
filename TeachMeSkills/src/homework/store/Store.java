package homework.store;

import java.util.*;

public class Store {
    private final List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        if (products.indexOf(product) != -1) {
            System.out.println("You have product with this id.");
        } else {
            System.out.println("Add successful");
            products.add(product);
        }
    }

    List<Product> printAllProducts() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
        System.out.println();
        return products;
    }

    List<Product> getAllProducts() {
        return products;
    }

    void deleteProduct(int id) {
        boolean deleteProduct = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                deleteProduct = true;
                System.out.println("Delete product successful");
                break;
            }
        }
        if (!deleteProduct) {
            System.out.println("You dont have product with this id");
        }
    }

    void replaceProduct(Product product) {
        if (products.indexOf(product) != -1) {
            products.set(products.indexOf(product), product);
            System.out.println("Replace product successful");
        } else {
            System.out.println("You dont have product with this id");
        }
    }

    List<Product> priceSortList() {
        List<Product> priceSortList = new ArrayList<>(products);
        Collections.sort(priceSortList);
        return priceSortList;
    }

    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = products.size(); i > 0; i--) {
            sortByLastAddToList.add(products.get(i - 1));
        }
        return sortByLastAddToList;
    }

    void printFirstMenu() {
        System.out.println("1. Вывод всех товаров");
        System.out.println("2. Добавление товара");
        System.out.println("3. Удаление товара");
        System.out.println("4. Редактирование товара");
        System.out.println("5. Выход");
    }

    void printSecondMenu() {
        System.out.println("1. По цене(возрастание)");
        System.out.println("2. По цене(убывание)");
        System.out.println("3. По добавлению(сначала новые, потом более старые)");
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        try {
            int key;
            do {
                printFirstMenu();
                System.out.print("Введите номер меню: ");
                String keyString = sc.nextLine();
                key = Integer.parseInt(keyString.trim());
                switch (key) {
                    case 1:
                        printSecondMenu();
                        System.out.print("Введите номер меню: ");
                        keyString = sc.nextLine();
                        key = Integer.parseInt(keyString.trim());
                        switch (key) {
                            case 1:
                                for (Product p : priceSortList()) {
                                    System.out.println(p);
                                }
                                break;
                            case 2:
                                for (int i = products.size(); i > 0; i--) {
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
                        System.out.print("Введите id товара: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите наименование товара: ");
                        String name = sc.nextLine();
                        System.out.print("Введите цену товара: ");
                        int price = sc.nextInt();
                        sc.nextLine();
                        Product product = new Product(id, name, price);
                        addProduct(product);
                        break;
                    case 3:
                        System.out.print("Введите id товара: ");
                        int deleteId = sc.nextInt();
                        sc.nextLine();
                        deleteProduct(deleteId);
                        break;
                    case 4:
                        System.out.print("Введите id товара для редактирования: ");
                        int replaceId = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Введите новое наименование товара: ");
                        String replaceName = sc.next();
                        System.out.print("Введите новую цену товара: ");
                        int replacePrice = sc.nextInt();
                        sc.nextLine();
                        Product replaceProduct = new Product(replaceId, replaceName, replacePrice);
                        replaceProduct(replaceProduct);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Вы ввели неверное номер меню\n");
                }
            } while (key != 5);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверное значение. Необходимо ввести число\n");
            start();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели неверное значение меню. Введите число\n");
            start();
        }
    }
}