package com.velocity.demo.controller.bean;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 单品
 * @author:
 * @create: 2019-02-12 11:43
 */
public class Sku extends Item {

    Map<String, Object> attributes = new HashMap<>();

    private BigDecimal price;

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String calculatePrice(Integer num){
        return BigDecimal.valueOf(num).multiply(price).toPlainString();
    }

    public static void main(String[] args) {
        Sku s = new Sku();
        s.setPrice(new BigDecimal(50.00));
        String total = s.calculatePrice(5);
        System.out.println(total);
    }

    @Override
    public String toString() {
        return "Sku{" +
                "attributes=" + attributes +
                ", price=" + price +
                '}';
    }
}
