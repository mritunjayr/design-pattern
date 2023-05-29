package com.github.mritunjayr.behavioral.strategy.simUDuck;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
