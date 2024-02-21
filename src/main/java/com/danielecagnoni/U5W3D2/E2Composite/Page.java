package com.danielecagnoni.U5W3D2.E2Composite;

public class Page implements PageInterface {

    public int pageNumber;

    public Page(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int getPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Print page number:" + pageNumber);
    }
}
