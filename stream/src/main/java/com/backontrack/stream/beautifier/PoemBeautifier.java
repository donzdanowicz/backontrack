package com.backontrack.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poem, PoemDecorator decorator) {
        System.out.println(decorator.decorate(poem));
    }
}
