package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BookList {

    public static void main(String[] args) {

        ArrayList<Books> books = new ArrayList<>();

        books.add(new Books("Duvar", 354, "Ahmet Şık", "05.01.2022"));
        books.add(new Books("Medyum", 300, "Stephan King","03.02.1998"));
        books.add(new Books("Enstitü", 420, "Stephan King", "08.08.2021"));
        books.add(new Books("Psikiyatrist", 335, "Wulf Dorn", "15.03.2017"));
        books.add(new Books("Aforizmalar", 215, "Schopenhauer", "1790"));
        books.add(new Books("Silmarilion", 423, "JJR", "17.7.2010"));

        Map<String,String> mappedList = new TreeMap<String,String>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                return o1.compareTo(o2);
            }

        });

        books.forEach(i-> {
            mappedList.put(i.getName(),i.getWriter());
        });

        ArrayList<Books> pageSizeOneHundredBooks = new ArrayList<>();

        books.stream().forEach(i -> {
            if (i.getPageNumber() > 100){
                pageSizeOneHundredBooks.add(i);
            }
        });

        mappedList.forEach((i,v) -> System.out.println(i+" : "+v));


    }

}