package com.lectures.lecture10Task;

import lombok.Getter;
@Getter

public class Product {
    private String name;
    private double cost;


    public Product(String name, double cost)  {// tova se samo se updeitna tuk sled kato slojih Throw na private metodite po- dolu
        setName(name);
        setCost(cost);

    }
    private void setName(String name)  {// setvae imeto tuk kato priavte i da se izpolzva v gorniq konstriktor. Taka nqma da moje da go promeq nikoi
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    private void setCost(double money)  {
        if (cost<0){
            throw new IllegalArgumentException("money cannot be negative");
        }
        this.cost= cost;
    }
}
