package com.lectures.lecture5;
import  java.util.Scanner;

public class exercise6 {
    String name = "My Name is test";

    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        exercise6 homework = new exercise6();
        homework.replaceString();
       /* Заместете даден под-string в даден string с друг текст:
        Пример: “My name is Test” – заместете Test с нещо, което чете от конзолата

        Сравнете 2 стринга дали са еднакви

        Пребройте колко думи има в един стринг (разделете текста по space)

        Обединете 2 и повече стринга в един и го изпишете в конзолата
*/



    }
    private void replaceString(){
        String name2;
        System.out.println(name);
        name2 = name.replace("test", "dog");
        System.out.println(name2);
    }


}
