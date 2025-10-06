package com.backontrack.patterns.builder.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {
    @Test
    void testPizzaCapricciosa() {
        //Given
        Pizza capricciosa = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                .ingredient("Mushroom")
                .ingredient("Ham")
                .bottom("Thin")
                .sauce("Mild")
                .build();

        System.out.println(capricciosa);
        //When
        int howManyIngredients = capricciosa.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }

    @Test
    void testPizzaCarnivora() {
        //Given
        Pizza carnivora = new Pizza.PizzaBuilder()
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Bacon")
                .ingredient("Ham")
                .ingredient("Salami")
                .ingredient("Sausage")
                .build();

        System.out.println(carnivora);
        //When
        int howManyIngredients = carnivora.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}
