package mate.academy.HWpatterns.AbstractFactory;

public class SetProjectTeam implements ProjectTeamFactory {
    @Override
    public Developer setDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester setTester() {
        return new JavaTester();
    }

    @Override
    public Manager setManager() {
        return new ProjectManager();
    }
}
