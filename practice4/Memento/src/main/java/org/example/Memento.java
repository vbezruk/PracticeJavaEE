package org.example;

import javax.jws.soap.SOAPMessageHandlers;

public class Memento {
    private Stats state;

    public Memento() {

    }

    public Memento(Stats state) {
        this.state = state;
    }

    public void setState(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }
}
