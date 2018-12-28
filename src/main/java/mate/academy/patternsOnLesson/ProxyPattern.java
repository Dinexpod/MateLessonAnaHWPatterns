package mate.academy.patternsOnLesson;

import mate.academy.patternsOnLesson.project.Progect;
import mate.academy.patternsOnLesson.project.RealProject;

public class ProxyPattern implements Pattern, Progect {
    Progect progect = new RealProject();

    public void run() {
        System.out.println("Doing with Proxy");
        progect.run();
    }

    public String getPatternName() {
        return "Proxy";
    }
}
