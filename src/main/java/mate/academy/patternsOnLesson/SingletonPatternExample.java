package mate.academy.patternsOnLesson;

public class SingletonPatternExample implements PatternExample {
    public Pattern makePattern() {
        return new  SingletonPattern();
    }
}
