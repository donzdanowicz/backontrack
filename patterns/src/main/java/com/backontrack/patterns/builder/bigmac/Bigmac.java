package com.backontrack.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final Bun bun;
    private final int burgers;
    private List<Sauce> sauces;
    private List<Ingredient> ingredients;

    public static class BigmacBuilder {
        private Bun bun;
        private int burgers;
        private List<Sauce> sauces = new ArrayList<>();
        private List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(Sauce sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredient(Ingredient ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauces, ingredients);
        }
    }

    private Bigmac(final Bun bun, final int burgers, List<Sauce> sauces, List<Ingredient> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers='" + burgers + '\'' +
                ", sauce='" + sauces + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public enum Bun {
        SESAME,
        SUNFLOWER_SEED,
        NO_SESAME;
    }

    public enum Sauce {
        KETCHUP,
        THOUSAND_ISLANDS,
        MUSTARD,
        MAYONNAISE,
        BARBECUE,
        CURRY,
        SPICY_BUFFALO
    }

    public enum Ingredient {
        BACON,
        HAM,
        JALAPENO,
        EXTRA_CHEESE,
        EXTRA_PICKLES,
        EXTRA_ONIONS,
        EXTRA_LETTUCE,
        GRILLED_ONIONS
    }
}
