package mate.academy.HWpatterns.AbstractFactory;

public interface ProjectTeamFactory {
    Developer setDeveloper();

    Tester setTester();

    Manager setManager();
}
