package com.ootsutsukee;

import com.ootsutsukee.drinks.Drink;
import com.ootsutsukee.factories.DrinkFactory;

public class CoffeeBoomClient {
    DrinkFactory drinkFactory;

    public CoffeeBoomClient(DrinkFactory drinkFactory) {
        this.drinkFactory = drinkFactory;
    }

    public Drink getDrink() {
        return drinkFactory.generateDrink();
    }


    public DrinkFactory getDrinkFactory() {
        return drinkFactory;
    }

    public void setDrinkFactory(DrinkFactory drinkFactory) {
        this.drinkFactory = drinkFactory;
    }
}
