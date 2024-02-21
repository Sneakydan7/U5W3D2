package com.danielecagnoni.U5W3D2.E2Composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements PageInterface {

    public List<PageInterface> pages = new ArrayList<>();

 
    @Override
    public int getPages() {
        int pageNumberTotal = 0;
        for (PageInterface page : pages) {
            pageNumberTotal += page.getPages();
        }
        return pageNumberTotal;
    }

    @Override
    public void print() {
        for (PageInterface page : pages) {
            page.print();
        }
    }


    public void addElement(PageInterface element) {
        pages.add(element);
    }

}
