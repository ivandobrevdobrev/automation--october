package com.lectures.lecture10Task;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j

public class Main {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader((System.in))));

        //Syzdavame Mapove kydeto da dyrjim podadenite danni

        Map<String,Person> people =new LinkedHashMap<String, Person>();
        //Coffee=10;Tea=2
        Map<String, Product> products = new LinkedHashMap<String, Product>();

        //Creatvame masiv, kydeto da splitne Inputa po ; and = (Elena= 11;Kiril=4)
         String[] peopleTokens = reader.readLine().split("[;=]");
         //Elena,11, Kiril,4
         String[] productTokens = reader.readLine().split("[;=]");
         // Coffee,10,Tea,2

         for (int i= 0; i< peopleTokens.length; i+=2){
             // creatvame chovek ot Klasa Person koito da ima ime i kolko pari ima
             Person person = new Person(peopleTokens[i],peopleTokens[i+1]);
             people.put(person.getName(),person);// slagame imeto i celiq obekt na Person v Map-a gore

         }
        for (int i= 0; i< productTokens.length; i+=2){
            // creatvame product ot Klasa Product koito da ima ime i kolko pari ima
            Product product = new Product(productTokens[i],Double.parseDouble(productTokens[i+1]));
            products.put(product.getName(),product);// slagame imeto i celiq obekt na Product v Map-a gore

        }
        String line;
        while(true) {
            if ("end".equalsIgnoreCase(line = reader.readLine())) {
                break;
            }


            String[] purchaseTokens = line.split("\\s+");// tova \\s+ splitva po space
            String personName = purchaseTokens[0];
            String productName = purchaseTokens[1];
            // Trqbva da proverim dali parite stigat. Pravim edin boolen metod v Person kakto i nov metod da dobavq i Izbajda praite koito sa mu ostanali kato e kupil producta.
            Person person = people.get(personName);
            Product product = products.get(productName);

            //Pravim  proverka dali nashiq People Map sydyrja personName
            if (people.containsKey(personName) && products.containsKey(productName)) {
                if (person.hasEnoughMoney(product.getCost())) {
                    person.buyProduct(product);
                    log.info("{} boughts {}", person.getName(), product.getName());
                } else {
                    log.error(" {} can't afford {}", person.getName(), product.getName());
                }
            }
        }
        people.values().forEach(System.out::println);


    }
}
