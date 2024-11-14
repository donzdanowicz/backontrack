package com.backontrack.initialbasiccourse.interfaces.animal;

public class Mouse implements Animal{
    @Override
    public String voice() {
        return "pi";
    }

    @Override
    public String name() {
        return "Mouse";
    }
}
