package com.backontrack.initialbasiccourse.loop.duplicatesinlinkedlist;

public class MyObject {
    private int value = 0;


    public MyObject(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        MyObject myObject = (MyObject) o;
        return myObject.getValue() == value;
    }

    public int getValue() {
        return value;
    }
}
