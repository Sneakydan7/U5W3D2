package com.danielecagnoni.U5W3D2.E2Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book(List.of("Daniele", "Paperino"), 40);

        Page page1 = new Page(1);
        Page page2 = new Page(2);
        Page page3 = new Page(3);
        Page page4 = new Page(4);
        Page page5 = new Page(5);
        Page page6 = new Page(6);

        Section section1 = new Section();
        section1.addElement(page1);
        section1.addElement(page2);
        Section section2 = new Section();
        section2.addElement(page3);
        section2.addElement(page4);

        book1.addElement(section1);
        book1.addElement(section2);

        book1.addElement(page5);
        book1.addElement(page6);
        book1.print();

    }
}
