package ru.ivchenko.java.basic.homework4;

public class Box {
    private int  boxLength;
    private int boxWidth;
    private int boxHeight;
    private String color;
    private boolean open;
    private boolean theBoxIsEmpty;

    public int getLength(){
        return boxLength;
    }
    public int getWidth(){
        return boxWidth;
    }
    public  int getHeight(){
        return boxHeight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setOpen(boolean open){
        this.open = open;
    }
    public void setTheBoxIsEmpty(boolean theBoxIsEmpty){
        this.theBoxIsEmpty = theBoxIsEmpty;
    }
    public Box(int boxLength,int boxWidth, int boxHeight, String color, boolean open,boolean theBoxIsEmpty) {
        this.boxLength = boxLength;
        this.boxWidth = boxWidth;
        this.boxHeight = boxHeight;
        this.color = color;
        this.open = open;
        this.theBoxIsEmpty = theBoxIsEmpty;
    }
    public void info(){
        System.out.println("Размеры(Д*Ш*В): " + boxLength + "*" + boxWidth + "*" + boxHeight + "\nЦвет: " + color + "\nКоробка открыта: " + open + "\nКоробка пуста: " + theBoxIsEmpty);
    }
    public void putSubject(){
        if(open == true && theBoxIsEmpty == true){
            System.out.println("Вы положили предмет в коробку!");
            theBoxIsEmpty = false;
        }
        else if(open != true && theBoxIsEmpty == true){
            System.out.println("Коробка закрыта.");
        }
        else if(open == true && theBoxIsEmpty != true){
            System.out.println("Коробка уже заполнена!");
        }
        else{
            System.out.println("Коробка уже заполнена и закрыта.");
        }
    }

    public void getSubjectFromBox(){
        if(open == true && theBoxIsEmpty != true){
            System.out.println("Вы достали предмет!");
            theBoxIsEmpty = true;
        }
        else if(open != true && theBoxIsEmpty != true){
            System.out.println("Колобка закрыта.");
        }
        else if(open == true && theBoxIsEmpty == true){
            System.out.println("Коробка уже пуста!");
        }
        else{
            System.out.println("Коробка уже пуста и закрыта!");
        }
    }

}
