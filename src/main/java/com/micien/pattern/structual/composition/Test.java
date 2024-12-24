package com.micien.pattern.structual.composition;

public class Test {
    public static void main(String[] args) {
        CatalogComponent windowsCourse = new Course("Windows 课程",10);
        CatalogComponent linuxCourse = new Course("Linux 课程",11);

        //是不是javaCatalogue这里也要用List?
        CatalogComponent javaCatalogue = new CourseCatalog("Java课程目录",2);
        CatalogComponent eBusiness1 = new Course("电商1",100);
        CatalogComponent eBusiness2 = new Course("电商2",200);
        javaCatalogue.add(eBusiness1);
        javaCatalogue.add(eBusiness2);

        CatalogComponent imoocCatalogue = new CourseCatalog("Imooc主目录",1);
        //这里要怎么制造主目录和子目录的关系啊？
        //要在CourseCatalogue里创建一个List
        imoocCatalogue.add(windowsCourse);
        imoocCatalogue.add(linuxCourse);
        imoocCatalogue.add(javaCatalogue);

        imoocCatalogue.print(imoocCatalogue);
    }
}

//写代码的思路
/*
1.首先知道有一个抽象组件，他是用来连接目录和课程的，因为只有目录和课程都从属于这个抽象类，后面合并的操作看起来才比较自然
2.如何才能有目录和课程的层级关系？目录里肯定有很多课程,所以里面要有一个List对象，这个要想清楚是放在哪里，是主函数还是类里？
3.层级关系的打印逻辑
* */
