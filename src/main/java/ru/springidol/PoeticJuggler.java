package ru.springidol;

public class PoeticJuggler implements Performer {
    private int bool;
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        this.poem= poem;
    }
    public void perform() {
        System.out.print("Juggler 15 bool "+"");
        poem.readPoem();
    }
}
