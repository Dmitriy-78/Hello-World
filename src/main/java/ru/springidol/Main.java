package ru.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ru.springidol\\context.xml");

        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }
}
