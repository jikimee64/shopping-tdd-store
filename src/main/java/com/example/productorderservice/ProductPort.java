package com.example.productorderservice;


interface ProductPort {
    void save(final Product product);

    Product getProduct(long productId);

}
