package com.github.mritunjayr.behavioral.strategy.simUDuck;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
