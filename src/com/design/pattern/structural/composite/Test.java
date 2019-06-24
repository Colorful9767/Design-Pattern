package com.design.pattern.structural.composite;

/**
 * Created by perl on 2019/6/24.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        CourseCatalog mainCatalog = new CourseCatalog("mainCatalog",1);
        CourseCatalog catalog1 = new CourseCatalog("catalog1",2);
        CourseCatalog catalog2 = new CourseCatalog("catalog2",2);

        Course course1 = new Course("course1",100.0);
        Course course2 = new Course("course2",122.0);

        catalog2.add(course1);
        catalog2.add(course2);
        mainCatalog.add(catalog1);
        mainCatalog.add(catalog2);

        mainCatalog.print();
    }
}
