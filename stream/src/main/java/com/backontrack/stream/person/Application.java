package com.backontrack.stream.person;

public class Application {
    public static void main(String[] args) {
        System.out.println("\nSimple stream with for each and printing");

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("\nChanging to upper case and printing");

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nFiltering Strings longer than 11");

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("\nCascade streaming");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

    }
}
