package com.lectures.lecture10Task;

import lombok.Getter;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Person {
    private String name;
    private double money;
    private List<Product> bag ;// syzdavane list ot produktite ot drugiq Klass Product

    public Person(String name, double money)  {
        setName(name);
        setMoney(money);
        this.bag = new ArrayList<>();


    }
    public boolean hasEnoughMoney(double money){
        return this.money>= money;
    }
    public void buyProduct(Product product){
        this.money -=product.getCost();
        this.bag.add(product);
    }

    public Person(String peopleToken) {

    }

    public Person(String peopleToken, String peopleToken1) {

    }


    private void setName(String name) {// setvase imeto tuk kato priavte i da se izpolzva v gorniq konstriktor. Taka nqma da moje da go promeq nikoi
        if (name == null) {
            throw new IllegalArgumentException(" Product Name cannot be empty");
        }
        this.name = name;
    }

        private void setMoney(double money) {
            if (money<0)
            throw new IllegalArgumentException("Cost cannot be negative");

        this.money= money;
    }

    @Override
    public String toString() {
        return String.format("%s -%s",this.name,this.bag.size()==0 ? "nothing bought" :  this.bag.stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
//this.name,this.bag.size()==0 ? "nothing bought" :