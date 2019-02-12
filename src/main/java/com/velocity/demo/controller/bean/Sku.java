package com.velocity.demo.controller.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 单品
 * @author:
 * @create: 2019-02-12 11:43
 */
public class Sku extends Item {

    Map<String, Object> attributes = new HashMap<>();

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
}
