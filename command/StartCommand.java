package by.kolbun.jobs.patterns.command;

import by.kolbun.jobs.patterns.command.meta.Comp;

public class StartCommand implements ICommand {
    Comp comp;

    public StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
