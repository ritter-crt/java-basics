package com.accenture.weihnachtselfen.games;

public class Game {
    private String name;
    private Integer price;

    /* short cut for getter/setter alt+einfg (turn num off) */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

