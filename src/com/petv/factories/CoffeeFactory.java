package com.ootsutsukee.factories;

import com.ootsutsukee.drinks.Coffee;
import com.ootsutsukee.drinks.Drink;

public class CoffeeFactory implements DrinkFactory{
    @Override
    public Drink generateDrink() {
        return new Coffee();
    }
}
