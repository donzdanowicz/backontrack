package com.backontrack.stream.beautifier;

public class Application {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String poemToRefine = "Raven";
        poemBeautifier.beautify(poemToRefine, (poem) -> poem + " is such a smart bird.");
        poemBeautifier.beautify(poemToRefine, (poem) -> poem.substring(0, 2));
        poemBeautifier.beautify(poemToRefine, String::toUpperCase);
        poemBeautifier.beautify(poemToRefine, poem -> "[*] " + poem + " [*]");
        poemBeautifier.beautify(poemToRefine, poem -> poem.repeat(3));
    }
}
