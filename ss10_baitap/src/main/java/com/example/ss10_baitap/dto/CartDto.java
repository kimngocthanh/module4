package com.example.ss10_baitap.dto;

import com.example.ss10_baitap.model.Product;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<ProductDto, Integer> productDtoMap = new HashMap<>();

    public CartDto() {

    }

    public Map<ProductDto, Integer> getProductDtoMap() {
        return productDtoMap;
    }

    public void setProductDtoMap(Map<ProductDto, Integer> productDtoMap) {
        this.productDtoMap = productDtoMap;
    }

    public void addProduct(ProductDto productDto) {
        if (productDtoMap.containsKey(productDto)) {
            Integer value = productDtoMap.get(productDto);
            productDtoMap.replace(productDto, value + 1);
        } else {
            productDtoMap.put(productDto,1);
        }
    }

    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<ProductDto, Integer> entry : productDtoMap.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Float countTotalPayment() {
        float payment = 0;
        for (Map.Entry<ProductDto, Integer> entry : productDtoMap.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }

    public void deleteAllItemInCard() {
        productDtoMap.clear();
    }
}
