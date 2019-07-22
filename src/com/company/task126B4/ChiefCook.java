package com.company.task126B4;

import java.util.ArrayList;
import java.util.List;

public class ChiefCook {
    public static void main(String[] args) {
        Salad salad1 = new Salad("Fresh", new Solid("Carrot", 100), new WithPeel("Onion", 3), new Soft("Lettuce", 100), new Soft("Tomatoes", 50), new Soft("Pepper", 50), new Solid("Potato", 200));
        System.out.println(salad1);
        System.out.println();
        System.out.println();

        List<Salad> salad2 = new ArrayList<>();
        salad2.add(new Salad()
                .setName("Green")
                .setComponent(new Solid("Carrot", 100))
                .setComponent(new Soft("Garlic", 1))
        );
        System.out.println(salad2);
    }

}
