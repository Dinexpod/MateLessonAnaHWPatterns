package mate.academy.patternsOnLesson;

public class BuildPatternExample implements PatternExample {
    public Pattern makePattern() {
        return BuilderPattern.builder().build();
    }
}
