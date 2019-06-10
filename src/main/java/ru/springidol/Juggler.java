package ru.springidol;

public class Juggler implements Performer {
    private int bool;

    public Juggler() {
    }
    public void setBool(int bool) {
        this.bool = bool;
    }
    public void perform() {
        System.out.println(bool+" Bool");
    }
}
