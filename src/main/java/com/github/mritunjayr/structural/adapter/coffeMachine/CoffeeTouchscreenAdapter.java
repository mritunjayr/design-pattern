package com.github.mritunjayr.structural.adapter.coffeMachine;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private final OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
            oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
            oldCoffeeMachine.selectB();
    }
}
