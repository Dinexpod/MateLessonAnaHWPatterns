package mate.academy.patternsOnLesson;

public class ProxyPatternExample implements PatternExample {
    public Pattern makePattern() {
        return new ProxyPattern();
    }
}
