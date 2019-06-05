package ru.springidol;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
    private String song;
    //@Autowired○○                    ○
    private Instrument instrument;

    public Instrumentalist() {
    }
    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {return song;}
    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    public void perform() {
        System.out.print(song+" ");
        instrument.play();
    }
}
