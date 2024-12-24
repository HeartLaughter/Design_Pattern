package com.micien.pattern.structual.composition;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Not supported yet remove.");
    }

    public void get(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Not supported yet get.");
    }

    public void getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Not supported yet get price.");
    }

    public void print(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("Not supported yet print.");
    }


}
