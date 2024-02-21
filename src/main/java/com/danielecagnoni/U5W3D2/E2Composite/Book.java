package com.danielecagnoni.U5W3D2.E2Composite;

import java.util.ArrayList;
import java.util.List;

public class Book implements PageInterface {

    private List<String> authors;

    protected List<PageInterface> sections = new ArrayList<>();

    private int price;

    public Book(List<String> authors, int price) {
        this.authors = authors;
        this.price = price;
    }

    @Override
    public int getPages() {
        int pageNumberTotal = 0;
        for (PageInterface section : sections) {
            pageNumberTotal += section.getPages();
        }
        return pageNumberTotal;
    }

    @Override
    public void print() {
        System.out.println("Print Book");
        for (PageInterface section : sections) {
            section.print();
        }
    }

    public void addElement(PageInterface element) {
        sections.add(element);
    }


}
