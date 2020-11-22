package com.lectures.lecture7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    ArrayList<String> list=new ArrayList<String>(); //създаваме/инициализираме празен ArrayList

    public void getCompanyOffices(){ // пълним листа с информация
        list.add("Sofia");
        list.add("London");
        list.add("Madrid");
        list.add("Barcelona");
        System.out.println("Compmay offices are: " + list);
    }
    public void addNewOffice(){  // добавяме допълнително инфо, в случая на 3та позиция
        list.add(3,"Paris");
        System.out.println(("Company office after addind is : " + list));
    }
    public void changeName(){ //променяме името на елемент
        list.set(1,"London- WEST");
        System.out.println("Company offices after name change: " + list);
    }
    public void removeOffice(){ //махаме елемент
        list.remove(2);
        System.out.println("Company offices after removal: " + list);
    }
    public int getOfficesCount(){
        System.out.println("Company offices count is : " + list.size());
        return list.size();

    }
    public void SortOffices(){
        Collections.sort(list);
        System.out.println(" Sorted Offices: " + list);
    }
    public  String getOfficeIndex(int Index){
        System.out.printf("Office by index is " +  list.get(Index));
        return list.get(Index);

    }

}
