package com.lectures.lecture6;

import java.util.Scanner;

public class exersice {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Month(sc.nextInt(), sc.nextInt());
    }
     public static void Month(int month, int year){
         //Scanner sc =new Scanner(System.in);

         String monthName;
        int numberDays=0;

        switch (month){
            case 1:
                monthName= "Jan";
                numberDays=31;
                System.out.println("The month "+monthName+" has "+numberDays+ " number of days");
                break;
            case 2:
                monthName= "Feb";
                if((year % 400 ==0) ||(year % 4==0) && (year % 100 !=0)) {
    numberDays=29;
            }else{
numberDays=28;
                    System.out.println("The month "+monthName+" has "+numberDays+ " number of days");
            }
                break;

            default:monthName="unknown";
                System.out.println("The month is "+monthName);
                break;

        }

     }
}
