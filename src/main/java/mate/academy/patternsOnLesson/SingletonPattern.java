package mate.academy.patternsOnLesson;

public enum SingletonPattern implements Pattern {
    INSTANCE;

    private int age = 10;

    public static int getAge() {
        return INSTANCE.age;
    }

    public String getPatternName() {
        return "Singleton pattern";
    }
}
