package com.lectures.lecture7;

import java.util.LinkedList;

public class MainLecture {
    public static void main(String[] args) {
//        ArrayListExample object=new ArrayListExample();//съсдаваме обект от Класа ArrayListExample и ще викаме всички методи създадени в ArrayListExample тука
//        object.getCompanyOffices();
//        object.addNewOffice();
//        object.changeName();
//        object.removeOffice();
//        object.getOfficesCount();
//        object.SortOffices();
//        object.getOfficeIndex(2);
        LinkedListExample object=new LinkedListExample();//съсдаваме обект от Класа LinkedListExample и ще викаме всички методи създадени в LinkedListExample тука
        object.getCompanyOffices();
        object.addNewOffice();
        object.changeName();
        object.removeOffice();
        object.getOfficesCount();
        object.SortOffices();
        object.getOfficeIndex(2);
    }
}
