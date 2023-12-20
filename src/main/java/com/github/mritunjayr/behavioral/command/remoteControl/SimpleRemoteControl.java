package com.github.mritunjayr.behavioral.command.remoteControl;

public class SimpleRemoteControl {
    Command slot;
    public SimpleRemoteControl(){

    }
    public void buttonWasPressed(){
        slot.execute();
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }
}
