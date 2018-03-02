package by.kolbun.jobs.patterns.command;

import by.kolbun.jobs.patterns.command.meta.Comp;

public class StopCommand implements ICommand{
    Comp comp;

    public StopCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.stop();
    }
}
