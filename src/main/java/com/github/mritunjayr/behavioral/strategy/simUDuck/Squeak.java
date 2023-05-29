package com.github.mritunjayr.behavioral.strategy.simUDuck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
