package com.github.mritunjayr.behavioral.command.remoteControl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleRemoteControlTest {
    @Test
    public void simpleTest(){
        SimpleRemoteControl remote =new SimpleRemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
    }

    @Test
    public void doorOpenTest(){
        SimpleRemoteControl remote =new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        Command doorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(doorOpen);
        remote.buttonWasPressed();
    }

}