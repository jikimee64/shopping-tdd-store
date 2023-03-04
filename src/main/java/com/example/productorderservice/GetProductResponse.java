package com.example.productorderservice;

record GetProductResponse(
        long id, String name, int price, DiscountPolicy discountPolicy
) {
    public GetProductResponse(long id, String name, int price, DiscountPolicy discountPolicy) {
        // 대충 Assert문 4개
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }
}
