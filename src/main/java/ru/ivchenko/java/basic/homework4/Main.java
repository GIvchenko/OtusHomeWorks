package ru.ivchenko.java.basic.homework4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Иван","Иванов","Иванович",1999, "QQQ@WWW.ru");
        user1.info();
        User[] user = {
                new User("Алексей","Иванов","Алексеевич",1973,"111@111.ru"),
                new User("Иван","Петров","Иванович",1980,"222@222.ru"),
                new User("Сергей","Соболев","Сергеевич",2001,"333@333.ru"),
                new User("Ирина","Барсова","Николаевна",1965,"444@444.ru"),
                new User("Ольга","Фёдорова","Сергеевна",1990,"555@555.ru"),
                new User("Пётр","Кузнецов","Петрович",1989,"666@666.ru"),
                new User("Оксана","Михайлова","Михайловна",2002,"777@777.ru"),
                new User("Мария","Кострова","Константиновна",2003,"888@888.ru"),
                new User("Кирилл","Клинских","Кириллович",1997,"999@999.ru"),
                new User("Анна","Осипова","Аркадьевна",1963,"000@000.ru"),
        };
        for(int i = 0; i < user.length; i++) {
            if (2024 - user[i].getYearOfBirth() >= 40) {
                user[i].info();
            }
        }
        Box box1 = new Box(10,10,10,"Red",true,true);
        box1.info();
        box1.putSubject("Ball");
        box1.setOpen(false);
        box1.getSubjectFromBox();
    }
}
