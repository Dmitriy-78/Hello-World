package ru.kridmi;

public class ByMessage implements Message {
    private String text;

    public ByMessage(String text) {
        this.text = "By " + text;
    }

    public String getText() {
        return text;
    }
}
