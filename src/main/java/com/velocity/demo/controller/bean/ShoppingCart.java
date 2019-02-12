package com.velocity.demo.controller.bean;

import java.util.List;

/**
 * @description: 购物车
 * @author:
 * @create: 2019-02-12 11:35
 */
public class ShoppingCart {

    private List<Vendor> vendors;

    public List<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
    }

//    @Override
//    public String toString() {
//        return "Cart{" +
//                "vendors=" + vendors +
//                '}';
//    }
}
