package com.github.mritunjayr.behavioral.strategy.simUDuck;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a model duck");
    }
}
