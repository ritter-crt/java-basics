package com.accenture.weihnachtselfen.games;

public interface Commando {
    // is implicitly abstract and public
    /* public abstract boolean execute();*/
    boolean execute();

    boolean shouldRun(String commando);
}
