package mate.academy.patternsOnLesson;

public enum SingletonPattern implements Pattern {
    INSTANCE;

    public String getPatternName() {
        return "Singleton pattern";
    }
}
