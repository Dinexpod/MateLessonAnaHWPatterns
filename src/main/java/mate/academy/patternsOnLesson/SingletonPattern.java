package mate.academy.patternsOnLesson;

public class SingletonPattern implements Pattern {
   private static volatile SingletonPattern instanse;

    private SingletonPattern() {
    }

    public SingletonPattern getInstsnce() {
        if (instanse == null) {
            synchronized(SingletonPattern.class) {
                if (instanse == null) {
                    instanse = new SingletonPattern();
                }
            }
        }

        return instanse;
    }

    public String getPatternName() {
        return "Singleton pattern";
    }
}
