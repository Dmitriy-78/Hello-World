package ru.springidol;


import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    public void play() {
        System.out.println("strum strum strum");
    }
}
