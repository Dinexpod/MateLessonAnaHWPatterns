package mate.academy.patternsOnLesson;

public class SingletonPattern implements Pattern {
   private static volatile SingletonPattern instanse;

   private int age = 10;

    public SingletonPattern getInstsnce() {
        SingletonPattern localIns = instanse;
        if (localIns == null) {
            synchronized(SingletonPattern.class) {
                localIns = instanse;
                if (localIns == null) {
                    instanse = localIns = new SingletonPattern();
                }
            }
        }

        return localIns;
    }

    public String getPatternName() {
        return "Singleton pattern";
    }
}
