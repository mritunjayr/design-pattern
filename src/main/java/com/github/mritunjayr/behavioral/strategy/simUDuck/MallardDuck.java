package com.github.mritunjayr.behavioral.strategy.simUDuck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I am real mallard duck");
    }
}
