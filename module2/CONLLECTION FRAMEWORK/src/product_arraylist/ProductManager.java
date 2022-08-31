package product_arraylist;

import sun.nio.cs.ext.ISO2022_CN_CNS;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import static com.sun.xml.internal.bind.v2.schemagen.Util.getParentUriPath;

public class ProductManager {
    public ArrayList<Product> productList;
    private boolean product;

    public ProductManager() {
        ArrayList<Product> productList = new ArrayList<>();
        this.productList = productList;
    }

    // Kiểm tra xem sản phẩm có trong list chưa ?
    public boolean isThereAnyProductsOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product) ;
                return true;
            }
        }
        return false;
    }

    // Kiểm tra id sản phẩm
    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getId() == id) ;
                return true;
            }
        }
        return false;

    }

    //Kiểm tra xem tên đã nằm trong danh sách chưa
    public boolean isNameProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName() == name) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct() {
        int id;
        String name;
        double price;
        Scanner input = new Scanner(System.in);

        // nhập name, nếu name đã có thì phải nhập lại.
        do {
            System.out.println("Product name: ");
            name = input.nextLine();
            if (isNameProductList(name))
                System.out.println(" Sản phẩm đã có trong danh sách ");
        } while (isNameProductList(name));


        // nhập vào id, nếu id đã có thì phải nhập lại.
        do {
            System.out.println("Product id: ");
            id = input.nextInt();
            if (isIdInProductList(id))
                System.out.println(" id đã có trong danh sách ");
        } while (isIdInProductList(id));

        System.out.println(" Product price: ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);

    }

    public void setProductListWithId() {
        Scanner input = null;
        if (productList.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách ");

        }
        input = new Scanner(System.in);
        System.out.println(" Id sản phẩm cần chỉnh sửa ");
        int id = input.nextInt();
        if (isIdInProductList(id)) {
            for (Product product : productList) {
                if (product.getId() == id) {
                    System.out.println(" Sản phẩm có id là " + id + " : " + product);
                    char choice;


                    do {
                        System.out.println(" Menu edit Product ");
                        System.out.println("1. Edit id product");
                        System.out.println("2. Edit name product");
                        System.out.println("3. Edit price product");
                        System.out.println("0. Exit");
                        System.out.println("-------------------------");

                        Scanner scanner = new Scanner(System.in);
                        choice = scanner.nextLine().charAt(0);


                        switch (choice) {
                            case '1':
                                System.out.print(" New Id: ");
                                int newId = scanner.nextInt();
                                product.setId(newId);
                                break;

                            case '2':
                                System.out.print("new Name");
                                String newName = scanner.nextLine();
                                product.setName(newName);
                                break;

                            case '3':
                                System.out.print("new Price");
                                double newPrice = scanner.nextInt();
                                product.setPrice(newPrice);
                                break;

                            case '0':
                                menuManager();
                                break;

                        }
                    } while (choice != '?');
                }
            }
        }
    }

    public void findProductWithName() {
        if (productList.isEmpty()) {
            System.out.println(" không có sản phẩm nào trong danh sách ");

        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Sản phẩm cần tìm: ");
            String name = scanner.nextLine();
            if (isNameProductList(name)) {
                for (Product products : productList) {
                    if (products.getName().equalsIgnoreCase(name)) {
                        System.out.println(product);

                    } else {
                        System.out.println(" Không có ");
                    }
                }
            }
        }
    }

    public void deleteProductInProductWithId() {
        if (productList.isEmpty()) {
            System.out.println(" Không có sản phẩm nào trong danh sách ");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Sản phẩm cần xóa");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println(" Sản phẩm cần xóa là  : " + product.toString());
                        productList.remove(product);
                    }
                }
            } else {
                System.out.println(" Không có trong danh sách sản phẩm");
            }
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println(" không có sản phẩm nào trong  danh sách ");
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceAscending() {
        if (productList.isEmpty()) {
            System.out.println(" Không có sản phẩm nào trong danh sách ");
        } else {
            PriceAscendingComparator priceAscendingComparator = new PriceAscendingComparator();
            Collections.sort(productList, priceAscendingComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceDecrease() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            PriceDereaseComparator priceDereaseComparator = new PriceDereaseComparator();
            Collections.sort(productList, priceDereaseComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
            }
        }
    }

    public void menuManager() {
        char choice = '?';
        while (choice != '0') {
            System.out.println("Menu product Manager ");
            System.out.println("1. Thêm sản phẩm ");
            System.out.println("2. Sửa id sản phẩm ");
            System.out.println("3. Sưả tên sản phẩm  ");
            System.out.println("4. Xóa sản phẩm  ");
            System.out.println("5. Hiển thị danh sách sản phẩm  ");
            System.out.println("6. Sắp xếp sản phẩm tắng dần ");
            System.out.println("7. Sắp xếp sản phẩm giảm dần ");
            System.out.println("0. Thoát");
            System.out.println("------------------------");
            System.out.println("choice : ");
            Scanner change = new Scanner(System.in);
            choice = change.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    addProduct();
                    break;
                case '2':
                    setProductListWithId();
                    break;
                case '3':
                    findProductInProductWithName();
                    break;
                case '4':
                    deleteProductInProductWithId();
                    break;
                case '5':
                    displayProduct();
                    break;
                case '6':
                    sortPriceAscending();
                    break;
                case '7':
                    sortPriceDecrease();
                    break;
                case '0':
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

    private void findProductInProductWithName() {

    }
}


