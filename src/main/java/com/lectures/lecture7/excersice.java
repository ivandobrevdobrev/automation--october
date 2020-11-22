package com.lectures.lecture7;

public class excersice {
    public static void main(String[] args) {
        //SumNumbers(3);
        //Scanner sc = new Scanner(System.in);
        //Faktorial(sc.nextInt()); // moje da sevika Chislo otScannera, ili direktno da mu dadem chislokakto po dolu
        //Faktorial(7);
        //Faktorial(5);
        //Factorial22(5);
        //ForLoop(10);
       //ArrayElements();
        ArrayElementswithFOR();
        //doesArraycontainsmyElement(new int[]{1,2,3}, 3);

    }
    private static boolean doesArraycontainsmyElement(int[] array, int item ){
        int[] numbers = {2, 3, 5, 7, 11};
        for (int j : array) {
            if (item == j) {
                System.out.println("This is the Item");
                return true;
            }
        }
        System.out.println(" Item not found");
        return false;

    }
    private static void ArrayElements() {
        int[] numbers = {2, 3, 5, 7, 11};
        for (int i : numbers) {
            System.out.printf("%d ", i);
        }
    }
    private static void ArrayElementswithFOR() {    ////// Виж как се принтирата Еленетите от Видеото..Не довършена
        int[] numbers = {2, 3, 5, 7, 11};
        for (int i = 0; i < numbers.length ; i++) {

            System.out.println(numbers[i]);
            
        }
    }

    private static void SumNumbers(int n) {

        int number = 1;
        int sum = 0;
        while (number < n) {
            number++;
            sum += number;
        }
        System.out.println("The sum is : " + sum);
    }

    private static void Faktorial(int Number) {
        long factorial = 1;
        System.out.println("The initial number for calculation is :" + Number);
        while (true) {
            if (Number == 1) {
                break;
            }
            factorial *= Number;
            Number--;

        }
        System.out.println("n! = " + factorial);

    }

    private static void Factorial22(int Number) {
        long factorial = 1;
        System.out.println("The initial number for calculation is :" + Number);
        do {
            factorial *= Number;
            Number--;

        } while (Number>0);
        System.out.println("n! = " + factorial);
    }
    private static void ForLoop(int n){
        //int n =5;
        //for (int i = 1; i <= n; i++) {
            //System.out.println(i);
        for (int j = 10; j >0; j--) {
            System.out.println(j);
        }
    }

    }

