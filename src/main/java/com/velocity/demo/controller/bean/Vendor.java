package com.velocity.demo.controller.bean;

import java.util.List;

/**
 * @description: 经销商
 * @author:
 * @create: 2019-02-12 11:38
 */
public class Vendor {

    private List<SortedEntry> sorteds;

    public List<SortedEntry> getSorteds() {
        return sorteds;
    }

    public void setSorteds(List<SortedEntry> sorteds) {
        this.sorteds = sorteds;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "sorteds=" + sorteds +
                '}';
    }
}
