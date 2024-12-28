package ru.netology.javaqa3;

public class PostTest {
    public static void main(String[] args) {
        PostClass postObject = new PostClass();
        postObject.name = "Иван";
        postObject.passport = "4444 № 44444444";
        postObject.patronymic = "Иванович";
        postObject.surname = "Иванов";
        postObject.phone = "+7 (999)-999-99-99";
        postObject.subscription = true;

        FormDate birthday = new FormDate();
        birthday.month = 6;
        birthday.day = 13;
        birthday.years = 1999;
    }

}
