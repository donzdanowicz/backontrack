package com.backontrack.initialbasiccourse.queue.bookordersdeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application {
    public static void main(String[] args) {

        Book book1 = new Book("Lord of the Rings: The Fellowship of the Ring", 1970, "English",
                "J.R.R. Tolkien", "fantasy");
        Book book2 = new Book("Dark Tower: The Gunslinger", 1979, "English", "Stephen King",
                "fantasy");
        Book book3 = new Book("Rich Dad, Poor Dad", 2002, "English", "Robert Kiyosaki",
                "finances");
        Book book4 = new Book("Finansowy Ninja", 2015, "Polish", "Michał Szafrański",
                "finances");
        Book book5 = new Book("Śledztwo", 1970, "Polish", "Stanisław Lem", "crime");
        Book book6 = new Book("The Stand", 1970, "English", "Stephen King", "fantasy");
        Book book7 = new Book("The Call of Cthulhu", 1920, "English", "H. P. Lovecraft",
                "horror");
        Book book8 = new Book("Der Hexer von Salem", 1980, "German", "Wolfgang Hohlbein",
                "fantasy");
        Book book9 = new Book("Justine ou les malheurs de la vertu", 1791, "French", "Marquis de Sade",
                "fiction");

        Order order1 = new Order(book1, 2024, 10, 14);
        Order order2 = new Order(book2, 2024, 10, 15);
        Order order3 = new Order(book3, 2024, 10, 16);
        Order order4 = new Order(book4, 2024, 10, 16);
        Order order5 = new Order(book5, 2024, 10, 18);
        Order order6 = new Order(book6, 2024, 10,19);

        Deque<Order> orders = new ArrayDeque<>();

        System.out.println("Stack is created. Size of the stack: " + orders.size() + " books.");

        orders.push(order1);
        orders.push(order2);
        orders.push(order3);
        orders.push(order4);
        orders.push(order5);
        orders.push(order6);

        System.out.println("Stack is filled. Size of the stack: " + orders.size() + " books.\n");

        Order temporaryOrder = orders.pop();
        System.out.println("First order executed: " + temporaryOrder + "\n");

        int ordersSize = orders.size();

        for (int i = 0; i < ordersSize; i++) {
            temporaryOrder = orders.pop();
            System.out.println("Order executed: " + temporaryOrder + "\n");
        }

        System.out.println("Stack's size is: " + orders.size());
        System.out.println("Last order executed: " + temporaryOrder + "\n");

    }
}