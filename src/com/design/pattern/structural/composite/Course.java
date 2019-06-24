package com.design.pattern.structural.composite;

/**
 * Created by perl on 2019/6/24.
 * 课程类
 */
public class Course extends CatalogComponent {

    private String name;
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public Double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称: "+this.name+",价格: "+this.price);
    }
}
