package product_arraylist;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product nokia =  new Product(1, "Nokia", 5000000 );
        Product samsung = new Product(2, "Samsung", 10000000);
        Product sony = new Product(3, "Sony", 5500000);
        productManager.productList.add(nokia);
        productManager.productList.add(samsung);
        productManager.productList.add(sony);
        productManager.menuManager();


    }
}
