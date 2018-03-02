package by.kolbun.jobs.patterns.command;

import by.kolbun.jobs.patterns.command.meta.Comp;
import by.kolbun.jobs.patterns.command.meta.User;

public class CommandTest {
    public static void exec() {
        Comp c = new Comp();

        User u = new User(
                new StartCommand(c),
                new StopCommand(c),
                new ResetCommand(c)
        );

        u.startComp();
        u.resetComp();
        u.stopComp();
    }
}
