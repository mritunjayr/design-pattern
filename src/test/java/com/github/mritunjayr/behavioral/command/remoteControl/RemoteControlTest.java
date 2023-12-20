package com.github.mritunjayr.behavioral.command.remoteControl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlTest {
    @Test
    public void printRemote(){
        RemoteControl remote = new RemoteControl();
        System.out.println(remote);
    }

}