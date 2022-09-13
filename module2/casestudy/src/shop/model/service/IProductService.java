package shop.model.service;

import shop.model.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product newProduct);

    void update(Product newProduct);

    Product findById(long id);

    Product findByTitle(String title);

    boolean exist(long id);

    boolean existByName(String name);

    boolean existsById(long id);

    void deleteById(long id);

    List<Product> findAllOrderByPriceASC();

    List<Product> findAllOrderByPriceDESC();
}

