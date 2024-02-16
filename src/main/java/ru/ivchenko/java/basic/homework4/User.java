package ru.ivchenko.java.basic.homework4;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private int yearOfBirth;
    private String eMail;

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getEMail(){
        return eMail;
    }
    public User(String name, String surname, String patronymic, int yearOfBirth, String eMail){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
    }
    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic + "\nГод рождения: " + yearOfBirth + "\ne-mail: " + eMail);
    }
}
