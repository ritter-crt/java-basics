package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

public class EmptyCommando implements Commando {
    @Override
    public boolean execute() {
        System.out.println("I am empty :-(");
        return true;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "".equals(commando);
    }
}