package com.github.mritunjayr.behavioral.strategy.simUDuck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehavior quackBehavior;
    abstract void display();
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("All duck float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
