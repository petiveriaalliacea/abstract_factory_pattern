package com.ootsutsukee.factories;

import com.ootsutsukee.drinks.Drink;
import com.ootsutsukee.drinks.Tea;

public class TeaFactory implements DrinkFactory{
    @Override
    public Drink generateDrink() {
        return new Tea();
    }
}
