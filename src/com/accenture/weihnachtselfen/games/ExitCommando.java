package com.accenture.weihnachtselfen.games;

public class ExitCommando implements Commando {
    @Override
    public boolean execute() {
        System.out.println("exit");
        return false;
    }

    @Override
    public boolean shouldRun(String commando) {
        return ("exit".equals(commando));
    }
}
