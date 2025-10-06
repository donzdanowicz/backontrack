package com.backontrack.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bigmac.Bun.SESAME)
                .burgers(2)
                .sauce(Bigmac.Sauce.BARBECUE)
                .sauce(Bigmac.Sauce.THOUSAND_ISLANDS)
                .ingredient(Bigmac.Ingredient.BACON)
                .ingredient(Bigmac.Ingredient.JALAPENO)
                .ingredient(Bigmac.Ingredient.EXTRA_CHEESE)
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
    }
}
