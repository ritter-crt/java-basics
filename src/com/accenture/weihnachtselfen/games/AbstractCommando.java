package com.accenture.weihnachtselfen.games;


public abstract class AbstractCommando {
    public abstract String getName();
    // commando is "show" "add" or "exit"
    public boolean shouldRun(String commando){
        return getName().equals(commando);
    }
}
