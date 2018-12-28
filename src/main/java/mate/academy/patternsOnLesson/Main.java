package mate.academy.patternsOnLesson;

public class Main {
    public static void main(String[] args) {
        PatternExample builderPattern = new BuildPatternExample();
        PatternExample proxyPattern = new ProxyPatternExample();
        PatternExample singletonPattern = new SingletonPatternExample();

        Pattern builder = builderPattern.makePattern();
        Pattern proxy = proxyPattern.makePattern();
        Pattern singleton = singletonPattern.makePattern();

        System.out.println("I am " + builder.getPatternName());
        System.out.println("I am " + proxy.getPatternName());
        System.out.println("I am " + singleton.getPatternName());
    }
}
