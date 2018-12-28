package mate.academy.patternsOnLesson;

public class BuilderPattern implements Pattern {
    private String name;
    private int age;

    private BuilderPattern(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static BuilderClass builder() {
        return new BuilderClass();
    }

    public String getPatternName() {
        if (name == null) {
            name = "Builder pattern";
        }

        return name;
    }

    public static class BuilderClass {
        private String name;
        private int age;

        public BuilderClass setName(String name) {
            this.name = name;
            return this;
        }

        public BuilderClass setAge(int age) {
            this.age = age;
            return this;
        }

        private BuilderClass() {
        }

        public BuilderPattern build() {
            return new BuilderPattern(name, age);
        }
    }
}
