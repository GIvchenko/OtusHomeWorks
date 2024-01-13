package ru.ivchenko.java.basic.homeworks.homework1;

public class Homework1 {
    public static void main(String[] args) {
        greetings();
        checkSign(8,-2,-7);
        selectColors();
        compareNumbers();
        addOrSubtractAndPrint(12, 6, true);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJawa");
    }

    public static void checkSign(int a, int b, int c) {
        if(a+b+c >= 0){
            System.out.println("Сумма положительная"); }
        else {
            System.out.println("Сумма отрицательная"); }
        }

    public static void selectColors() {
        int data = 17;
        if(data <=10) {
            System.out.println("Красный");
        }
        if(data >10 && data <=20){
            System.out.println("Желтый");
        }
        if(data >20){
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 86;
        int b = 34;
        if(a >= b){
            System.out.println("a >= b");
        }
        if(a < b){
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment = true){
            System.out.println(initValue + delta);
        }
        else {
            System.out.println(initValue - delta);
        }
    }
    }

