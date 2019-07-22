package com.company.task124A4;

public class StateStarter {

    public static void main(String[] args) {
        City[] cities = new City[3];
        cities[0] = new City("Moscow", new Region("Moscow region", 20000), new Area("Moscow area"), true, true);
        cities[1] = new City("SPB", new Region("Leningrad region", 30000), new Area("Leningrad area"), false, true);
        cities[2] = new City("Smolensk", new Region("Smolensk region", 50000), new Area("Smolensk area"), false, true);

        StateStarter starter = new StateStarter();

        System.out.println("Capital: " + getCapital(cities));
        System.out.println("Count region" + getRegionsAmount(cities));
        printRegions(cities);
        getRegionCapital(cities);

    }

    private static String capital;
    private static String regionCapital;
    private static int countRegions;


    public static String getCapital(City[] cities) {
        for (City city : cities) {
            if (city.isCapital() == true) {
                capital = city.getCityName();
                break;
            }
        }
        return capital;
    }

    public static void getRegionCapital(City[] cities) {
        for (City city : cities) {
            if (city.isRegioanlCenter() == true) {
                System.out.println("Region capital: " + city.getCityName());
            }
        }
    }


    public static int getRegionsAmount(City[] cities) {
        countRegions = 0;
        for (City city : cities) {
            if (city.returnRegionSquare() != 0) {
                countRegions++;
            }
        }
        return countRegions;
    }

    public static void printRegions(City[] cities) {
        double sumSquare = 0;
        for (City city : cities) {
            if (city.returnRegionSquare() != 0) {
                sumSquare = sumSquare + city.returnRegionSquare();
            }
        }
        System.out.println("\nИтого: площаль страны: " + sumSquare + " км²");
    }

}
