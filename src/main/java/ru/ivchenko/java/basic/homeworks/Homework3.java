package ru.ivchenko.java.basic.homeworks;

public class Homework3 {

    public static void main(String[] args) {
        int[][] array = {{1,6,7},{2,-2,1},{1,-3,2}};
        System.out.println(sumOfPositiveElements(array));
        square(4);
        diagonalNull(array);
        System.out.println(findMax(array));
        System.out.println(sumSecondString(array));
    }

    public static int sumOfPositiveElements(int [][] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j =0; j < array.length; j++){
                if(array[i][j] > 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void square(int size) {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    public static void diagonalNull(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                else if(i+j == array.length -1){
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static int findMax(int[][] array) {
        int maxNumber = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array.length; j++){
                if(array[i][j] > maxNumber){
                    maxNumber = array[i][j];
                }
            }
        }
        return maxNumber;
    }

    public static int sumSecondString(int[][] array) {
        int sumString = 0;
        for(int i=1; i < array.length; i++)
            for(int j = 0; j < array.length; j++)
                if(i > 0 && i <2){
                    sumString += array[i][j];
                }
        return sumString;
    }
}
