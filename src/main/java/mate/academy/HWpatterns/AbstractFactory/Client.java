package mate.academy.HWpatterns.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SetProjectTeam();

        Developer developer = projectTeamFactory.setDeveloper();
        Tester tester = projectTeamFactory.setTester();
        Manager manager = projectTeamFactory.setManager();

        System.out.println("Creating project ... ");

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
