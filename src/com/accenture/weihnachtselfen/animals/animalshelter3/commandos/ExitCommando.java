package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

public class ExitCommando implements Commando {

    @Override
    public boolean execute() {
        return false;
    }

    @Override
    public boolean shouldRun(String commando) {
        return "exit".equals(commando);
    }
}
