package by.kolbun.jobs.patterns.command.meta;

import by.kolbun.jobs.patterns.command.ICommand;

// Invoker
public class User {
    private ICommand start;
    private ICommand stop;
    private ICommand reset;

    public User(ICommand start, ICommand stop, ICommand reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComp() {
        start.execute();
    }

    public void stopComp() {
        stop.execute();
    }

    public void resetComp() {
        reset.execute();
    }
}
