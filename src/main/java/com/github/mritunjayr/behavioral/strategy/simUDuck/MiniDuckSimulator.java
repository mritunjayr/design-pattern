package com.github.mritunjayr.behavioral.strategy.simUDuck;

/**
 * <h3> The Strategy Pattern</h3> defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 *<ul> <b>OO Principle</b> <li>Encapsulate what varies </li> <li> favour composition over inheritance </li>
 * <li>program to interface, not to implementation.</li></ul>
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
