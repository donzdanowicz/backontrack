package com.backontrack.stream.person;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Chloe Fry");
        theList.add("Martin Venezuela");
        theList.add("John Locke");

        return new ArrayList<>(theList);
    }
}
