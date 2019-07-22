package com.company.task126B4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> salad;

    Salad() {
        salad = new ArrayList<Vegetable>();
    }

    Salad(String name, Vegetable... components) {
        this.name = name;
        salad = new ArrayList<Vegetable>();
        for (Vegetable v : components) {
            this.salad.add(v);
        }
    }


    public Salad setComponent(Vegetable v) {
        this.salad.add(v);
        return this;
    }


    public String getName() {
        return name;
    }

    public Salad setName(String name) {
        this.name = name;
        return this;
    }


    private int foodValue() {
        int v = 0;
        for (Vegetable c : salad){
            v += Math.round(((double) c.getWeight() * c.getCalor()) / 100);
        }
        return v;
    }

    @Override
    public String toString() {
        salad.sort(new TypeComparator());
        String smin = "";
        String smax = "";
        int salcalorie = this.foodValue();
        String s = "Salad" + this.getName() + (char) 13 + "-------------------" + (char) 13;
        for (Vegetable v : salad) {
            long c = Math.round((double) v.getWeight() * v.getCalor() / 100);
            if (c < .1 * salcalorie) smin += v.getName() + " ";
            if (c > .5 * salcalorie) smax += v.getName() + " ";
            s = s + v.getName() + " " + v.getWeight() + " r " + v.preparation() + (char) 13;
        }
        return s + "Calorie content " + salcalorie + " Kcal" + (char) 13
                + "___________________" + (char) 13
                + "Most calories are given: "
                + smax + (char) 13
                + "The least calories are given: " + (char) 13
                + smin;
    }

    private static class TypeComparator implements Comparator<Vegetable> {
        @Override
        public int compare(Vegetable one, Vegetable two) {
            if (one.getClass() == two.getClass())
                return 0;
            else if (one.getClass().hashCode() > two.getClass().hashCode())
                return 1;
            else if (one.getClass().hashCode() < two.getClass().hashCode())
                return -1;
            return 0;
        }
    }
}