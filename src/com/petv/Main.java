package com.ootsutsukee;

import com.ootsutsukee.drinks.Drink;
import com.ootsutsukee.factories.CoffeeFactory;
import com.ootsutsukee.factories.JuiceFactory;
import com.ootsutsukee.factories.TeaFactory;

public class Main {

    public static void main(String[] args) {
	    CoffeeBoomClient client = new CoffeeBoomClient(new CoffeeFactory());
        Drink drink = client.getDrink();
        drink.drink();
        client.setDrinkFactory(new TeaFactory());
        drink = client.getDrink();
        drink.drink();
        client.setDrinkFactory(new JuiceFactory());
        drink = client.getDrink();
        drink.drink();
    }
}
