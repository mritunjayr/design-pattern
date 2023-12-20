package com.github.mritunjayr.behavioral.command.remoteControl;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        Arrays.fill(onCommands, noCommand);
        Arrays.fill(offCommands, noCommand);

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n-------Remote Control------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
