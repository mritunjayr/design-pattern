package com.github.mritunjayr.behavioral.command.remoteControl;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Not assigned");
    }
}
