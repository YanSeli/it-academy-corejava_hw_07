package com.company.task126B4;

public abstract class Vegetable {
    private int calories;
    private int weight;
    private String name;
    private VgtblList list = VgtblList.Vgtbl;

    private enum VgtblList {Vgtbl, Carrot, Onion, Garlic, Pepper, Cabbage, Lettuce, Tomatoes, Cucumbers, Potato}

    Vegetable(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }


    abstract String preparation();

    int getCalor() {
        switch (list.valueOf(name)) {
            case Carrot:
                calories = 33;
                break;
            case Onion:
                calories = 43;
                break;
            case Garlic:
                calories = 106;
                break;
            case Pepper:
                calories = 25;
                break;
            case Cabbage:
                calories = 30;
                break;
            case Lettuce:
                calories = 14;
                break;
            case Tomatoes:
                calories = 19;
                break;
            case Cucumbers:
                calories = 15;
                break;
            case Potato:
                calories = 83;
                break;
            default:
                calories = 0;
                System.out.println("calorie-free");
        }

        return calories;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}