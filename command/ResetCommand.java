package by.kolbun.jobs.patterns.command;

import by.kolbun.jobs.patterns.command.meta.Comp;

public class ResetCommand implements ICommand {
    Comp comp;

    public ResetCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.reset();
    }
}
