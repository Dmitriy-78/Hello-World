package ru.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
    private String song;
    //@Autowired
    private Instrument instrument;

    public Instrumentalist() {
    }
    public void setSong(String song) {
        this.song = song;
    }
    public String getSong() {return song;}

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    public void perform() {
        System.out.print(song+" ");
        instrument.play();
    }
}
