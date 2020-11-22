package com.lectures;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String Pet =sc.nextLine();
        String activity =sc.nextLine();
        String Pet2= sc.nextLine();
        int number = sc.nextInt();
        int number2= sc.nextInt();

        //System.out.println("My pet is a "+name+" and it "+activity);
        MyPet(Pet, activity, number);
        System.out.println("That is crazy pet");
        MyPet2(Pet2,activity, number2);
    }

    public static void MyPet (String a, String b , int c){
        System.out.println("My pet is a "+a+" and it "+b+" "+c+" times for 1 second");
    }
    public static void MyPet2(String t,String s, int u){

        System.out.println("My "+t+" "+s+" "+u+" times only for 1 second");
    }
}