package com.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by perl on 2019/6/24.
 * 课程分类目录
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> catalogComponentList = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponentList.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        catalogComponentList.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent : catalogComponentList) {
            if (this.level != null) {
                for (int i = 0;i < this.level;i++){
                    System.out.printf("  ");
                }
            }
            catalogComponent.print();
        }
    }
}
