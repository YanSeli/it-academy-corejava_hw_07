package com.company.task126B4;

public class WithPeel extends Vegetable{
    public WithPeel(String name, int weight){
        super(name, weight);
    }
    public String preparation(){
        return "Peel and chop";
    }
}
