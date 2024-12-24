package com.micien.pattern.structual.composition;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CourseCatalog extends CatalogComponent {
    private String catologName;
    private List<CatalogComponent> catalogComponents = new ArrayList<>();
    private Integer level;
    CourseCatalog(String catalog, Integer level) {
        this.catologName = catalog;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    @Override
    public void print(CatalogComponent catalogComponent) {

        System.out.println(catologName+":");
        for(CatalogComponent component : catalogComponents) {

            for(int i = 0 ; i < level ; i++) {
                System.out.print("  ");
            }

            component.print(catalogComponent);
        }

    }
}
