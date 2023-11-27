package com.accenture.weihnachtselfen.animals.animalshelter3.commandos;

public interface Commando {
    public boolean execute();

    public boolean shouldRun(String commando);
}
