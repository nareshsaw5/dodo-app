package com.dodo.app.product.service;

import com.dodo.app.product.dto.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private List<Product> products;

    /**
     *
     */
    public ProductService() {
        products = new ArrayList<>();
        products.add(new Product("T-Shirt", 200));
        products.add(new Product("Shirt", 300));
        products.add(new Product("Pant", 400));
        products.add(new Product("Jeans", 500));
    }

    /**
     *
     * @return
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     *
     * @return
     */
    public Long getCount() {
        return products.stream().count();
    }

    /**
     *
     * @param product
     */
    public void addProduct(Product product) {
        Product prd = new Product(product.getName(), product.getPrice());
        this.products.add(prd);
    }

    /**
     *
     * @param product
     */
    public void updateProduct(Product product) {
        products = products.stream().map((prd) -> {
            if (prd.getId() == product.getId()) {
                prd.setName(product.getName());
                prd.setPrice(product.getPrice());
            }
            return prd;
        }).collect(Collectors.toList());
    }

    /**
     *
     * @param productId
     */
    public void removeProduct(int productId){
        products.removeIf( prd -> prd.getId() == productId);
    }


}
