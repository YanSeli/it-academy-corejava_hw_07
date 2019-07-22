package com.company.task124A4;

public class City{
    private String cityName;
    private String region;
    private double regionSquare;
    private String area;
    private boolean isCapital;
    private boolean isRegionalCenter;

    public City(String cityName, Region region, Area area, boolean isCapital, boolean isRegionalCenter){
        this.cityName = cityName;
        this.region = region.getRegionName();
        this.regionSquare = region.getSquare();
        this.setArea(area.getArea());
        this.isCapital = isCapital;
        this.isRegionalCenter = isRegionalCenter;
    }

    public String getCityName() {
        return cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public double returnRegionSquare() {
        return regionSquare;
    }

    public String returnRegionName() {
        return region;
    }

    public boolean isRegioanlCenter() {
        return isRegionalCenter;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
