package com.ootsutsukee.factories;

import com.ootsutsukee.drinks.Drink;
import com.ootsutsukee.drinks.Juice;

public class JuiceFactory implements DrinkFactory{
    @Override
    public Drink generateDrink() {
        return new Juice();
    }
}
