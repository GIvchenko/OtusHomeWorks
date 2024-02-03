package ru.ivchenko.java.basic.homeworks;

import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {
        quantityString(2,"Hello, world");
        sumArray(5,8,1,7,0,2);
        completion(5, new int[4]);
        increase(2,3,2,1,5);
        sumOfTheHalves(4,4,4,6,6,6);

    }
    public static void quantityString(int incomingQuantity, String text) {
        for(int quantity = 0; quantity != incomingQuantity; quantity++)
            System.out.println(text);
    }

    public static void sumArray(int... array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 5){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void completion(int number, int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void increase(int number, int... array) {
        for(int i = 0; i < array.length; i++){
            array[i] += number;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sumOfTheHalves(int... array) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < array.length/2; i++){
            sum1 += array[i];
        }
        for(int i = array.length/2; i < array.length; i++){
            sum2 += array[i];
        }
    if(sum1 > sum2){
        System.out.println("Левая половина больше");
    }
    else if(sum1 < sum2) {
        System.out.println("Правая половина больше");
    }
    else {
        System.out.println("Половины равны");
    }
    }
    }